package steps;

import pages.DashboardPage;
import pages.LoginPage;

import static data.Data.DASHBOARD_HEADLINE;
import net.thucydides.core.annotations.Step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends LoginPage {

    private LoginPage loginPage;

    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }

    @Step
    public void user_puts_email(){
      loginPage.userPutsUsernameField();
    }

    @Step
    public void user_puts_password(){
      loginPage.userPutsPasswordField();
    }

    @Step
    public void user_taps_login_button(){
      loginPage.clickLoginButton();
    }

    @Step
    public void user_verify_the_dashboard_headline(){
      assertEquals(DASHBOARD_HEADLINE, loginPage.getDashboardHeadline());
    }
}

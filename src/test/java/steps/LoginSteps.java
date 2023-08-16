package steps;

import pages.DashboardPage;
import pages.LoginPage;

import static data.Data.DASHBOARD_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends LoginPage {

    private LoginPage loginPage;


    public void user_puts_email(){
      loginPage.userPutsUsernameField();
    }

    public void user_puts_password(){
      loginPage.userPutsPasswordField();
    }

    public void user_taps_login_button(){
      loginPage.clickLoginButton();
    }

    public void user_verify_the_dashboard_headline(){
      assertEquals(DASHBOARD_HEADLINE, loginPage.getDashboardHeadline());
    }
}

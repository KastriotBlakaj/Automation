package steps;

import pages.LoginPage;

import static data.Data.DASHBOARD_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends LoginPage {

  private LoginPage landingPages;

  public void user_puts_email(){
    landingPages.userPutsUsernameField();
  }

  public void user_puts_password(){
    landingPages.userPutsPasswordField();
  }

  public void user_taps_login_button(){
    landingPages.clickLoginButton();
  }

  public void user_verify_the_dashboard_headline(){
    assertEquals(DASHBOARD_HEADLINE, landingPages.getDashboardHeadline());
  }
}

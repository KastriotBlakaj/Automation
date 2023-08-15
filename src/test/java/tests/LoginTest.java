package tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import steps.DashboardSteps;
import steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest extends BaseClass {

    @Managed
    WebDriver driver;

    @Steps
    private BaseClass baseClass;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashboardSteps dashboardSteps;

    @Test
    public void loginUserTest(){
      loginMethod();
    }

  @Test
  public void addingNewItemIntoCart(){
    loginMethod();
    dashboardSteps.user_adds_item_to_the_cart();
    dashboardSteps.user_taps_on_the_cart();
  }

  public void loginMethod(){
    baseClass.userRedirectToRightUrl();
    loginSteps.user_puts_email();
    loginSteps.user_puts_password();
    loginSteps.user_taps_login_button();
    loginSteps.user_verify_the_dashboard_headline();
  }
}

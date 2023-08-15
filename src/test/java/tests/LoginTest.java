package tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest extends BaseClass {

    @Managed
    WebDriver driver;

    @Steps
    private BaseClass baseClass;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginUserTest(){
      baseClass.userRedirectToRightUrl();
      loginSteps.user_puts_email();
      loginSteps.user_puts_password();
      loginSteps.user_taps_login_button();
      loginSteps.user_verify_the_dashboard_headline();
    }



}

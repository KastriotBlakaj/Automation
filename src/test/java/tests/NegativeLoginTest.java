package tests;


import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import steps.NegativeLoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class NegativeLoginTest  extends  BaseClass {

    @Managed
    WebDriver driver;

    @Steps
    private BaseClass baseClass;

    @Steps
    private NegativeLoginSteps negativeLoginSteps;

    @Test
    public void tryLoginWithWrongUsername(){
        baseClass.userRedirectToRightUrl();
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongPassword(){
        baseClass.userRedirectToRightUrl();
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongUsernameAndPassword(){
        baseClass.userRedirectToRightUrl();
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithRightUsernameAndPassword(){
        baseClass.userRedirectToRightUrl();
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
    }
}

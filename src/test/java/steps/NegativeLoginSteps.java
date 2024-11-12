package steps;

import static data.Data.LOGIN_ERROR_TEXT;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.thucydides.core.annotations.Step;

import pages.NegativeLoginPage;

public class NegativeLoginSteps extends NegativeLoginPage {

    private NegativeLoginPage negativeLoginPage;


    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }
    @Step
    public void user_puts_wrong_username() {
        negativeLoginPage.userPutsWrongUsernameField();
    }

    @Step
    public void user_puts_right_username() {
        negativeLoginPage.userPutsRightUsernameField();
    }

    @Step
    public void user_puts_right_password() {
        negativeLoginPage.userPutsRightPasswordField();
    }

    @Step
    public void user_puts_wrong_password() {
        negativeLoginPage.userPutsWrongPasswordField();
    }

    @Step
    public void user_taps_login_button() {
        negativeLoginPage.clickLoginButton();
    }

    @Step
    public void user_verify_the_login_error_text() {
        assertEquals(LOGIN_ERROR_TEXT, negativeLoginPage.getErrorText());
    }

}

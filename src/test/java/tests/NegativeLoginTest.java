package tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import steps.NegativeLoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class NegativeLoginTest {

    @Steps
    private NegativeLoginSteps negativeLoginSteps;

    @Test
    public void tryLoginWithWrongUsername() {
        negativeLoginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongPassword() {
        negativeLoginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongUsernameAndPassword() {
        negativeLoginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithRightUsernameAndPassword() {
        negativeLoginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
    }
}

package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import steps.LoginSteps;
import steps.NegativeLoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class NegativeLoginTest {

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
    }
    @Steps
    private NegativeLoginSteps negativeLoginSteps;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void tryLoginWithWrongUsername() {
        loginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongPassword() {
        loginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithWrongUsernameAndPassword() {
        loginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_wrong_username();
        negativeLoginSteps.user_puts_wrong_password();
        negativeLoginSteps.user_taps_login_button();
        negativeLoginSteps.user_verify_the_login_error_text();
    }

    @Test
    public void tryLoginWithRightUsernameAndPassword() {
        loginSteps.userRedirectToRightUrl();  // Serenity automatically handles base URL
        negativeLoginSteps.user_puts_right_username();
        negativeLoginSteps.user_puts_right_password();
        negativeLoginSteps.user_taps_login_button();
    }
}

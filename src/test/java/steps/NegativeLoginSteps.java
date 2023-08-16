package steps;

import static data.Data.LOGIN_ERROR_TEXT;
import static org.junit.jupiter.api.Assertions.assertEquals;

import pages.NegativeLoginPage;

public class NegativeLoginSteps  extends NegativeLoginPage {

      private NegativeLoginPage negativeLoginPage;

      public void user_puts_wrong_username(){
          negativeLoginPage.userPutsWrongUsernameField();
      }

      public void user_puts_right_username(){
          negativeLoginPage.userPutsRightUsernameField();
      }

      public void user_puts_right_password(){
          negativeLoginPage.userPutsRightPasswordField();
      }

      public void user_puts_wrong_password(){
          negativeLoginPage.userPutsWrongPasswordField();
      }

      public void user_taps_login_button(){
          negativeLoginPage.clickLoginButton();
      }

      public void user_verify_the_login_error_text(){
          assertEquals(LOGIN_ERROR_TEXT, negativeLoginPage.getErrorText());
      }

}

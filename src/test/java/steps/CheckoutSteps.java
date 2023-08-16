package steps;

import static data.Data.CHECKOUT_ERROR;
import static data.Data.CHECKOUT_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

import pages.CheckOutPage;

public class CheckoutSteps extends CheckOutPage {

      private  CheckOutPage checkOutPage;

      public void verify_checkout_headline_Text(){
          assertEquals(CHECKOUT_HEADLINE,checkOutPage.headlineText());
      }

      public void click_continue_button(){
          checkOutPage.continueButton();
      }

      public void verify_error_on_checkout(){
          assertEquals(CHECKOUT_ERROR,checkOutPage.checkoutErrorText());
      }

      public void checkout_first_name(){
         checkOutPage.checkoutFirstNameField();
      }

      public void checkout_last_name(){
          checkOutPage.checkoutLastNameField();
      }

      public void checkout_postal_code(){
          checkOutPage.checkoutPostalCodeField();
      }

      public void checkout_finish_button(){
          checkOutPage.checkoutFinishButton();
      }

      public void verify_finish_headline_text(){
          checkOutPage.finishHeadlineText();
      }
}

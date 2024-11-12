package steps;

import static data.Data.CHECKOUT_ERROR;
import static data.Data.CHECKOUT_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.thucydides.core.annotations.Step;
import pages.CheckOutPage;

public class CheckoutSteps extends CheckOutPage {

    private CheckOutPage checkOutPage;

    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }

    @Step
    public void verify_checkout_headline_Text() {
        assertEquals(CHECKOUT_HEADLINE, checkOutPage.headlineText());
    }

    @Step
    public void click_continue_button() {
        checkOutPage.continueButton();
    }

    @Step
    public void verify_error_on_checkout() {
        assertEquals(CHECKOUT_ERROR, checkOutPage.checkoutErrorText());
    }

    @Step
    public void checkout_first_name() {
        checkOutPage.checkoutFirstNameField();
    }

    @Step
    public void checkout_last_name() {
        checkOutPage.checkoutLastNameField();
    }

    @Step
    public void checkout_postal_code() {
        checkOutPage.checkoutPostalCodeField();
    }

    @Step
    public void checkout_finish_button() {
        checkOutPage.checkoutFinishButton();
    }

    @Step
    public void verify_finish_headline_text() {
        checkOutPage.finishHeadlineText();
    }
}

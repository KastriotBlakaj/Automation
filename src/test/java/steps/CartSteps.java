package steps;

import static data.Data.CART_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.annotations.Step;
import pages.CartPage;

public class CartSteps extends CartPage {

    private CartPage cartPage;

    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }

    @Step
    public void verify_cart_headline_text() {
        assertEquals(CART_HEADLINE, cartPage.cardHeadlineText());
    }

    @Step
    public void click_remove_item_button() {
        cartPage.removeButton();
    }

    @Step
    public void click_continue_shopping_button() {
        cartPage.continueButton();
    }

    @Step
    public void click_on_checkout_button() {
        cartPage.checkoutButton();
    }
}

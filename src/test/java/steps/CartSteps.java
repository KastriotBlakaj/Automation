package steps;

import static data.Data.CART_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;

import pages.CartPage;

public class CartSteps extends CartPage {

    private CartPage cartPage;

    public void verify_cart_headline_text(){
     assertEquals(CART_HEADLINE,cartPage.cardHeadlineText());
    }

    public void click_remove_item_button(){
      cartPage.removeButton();
    }

    public void click_continue_shopping_button(){
      cartPage.continueButton();
    }

    public void click_on_checkout_button(){
      cartPage.checkoutButton();
    }
}

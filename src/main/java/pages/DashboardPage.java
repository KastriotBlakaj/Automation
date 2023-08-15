package pages;

import static java.time.Duration.ofSeconds;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class DashboardPage extends PageObject {

  private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);

      @FindBy(id = "add-to-cart-sauce-labs-backpack")
      private WebElementFacade addingToCartButton;

      @FindBy(css = "#shopping_cart_container > a")
      private WebElementFacade cartButton;

      public void clickAddToCartButton(){
        addingToCartButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        addingToCartButton.click();
      }

      public void clickOnCardButton(){
        cartButton.click();
      }

}

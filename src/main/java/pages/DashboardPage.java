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

      @FindBy(css = "#header_container > div.header_secondary_container > div > span")
      private WebElementFacade sortingDropdownButton;

      @FindBy(css ="#header_container > div.header_secondary_container > div > span > select > option:nth-child(4)")
      private WebElementFacade selectingItem;

      @FindBy(css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(3)")
      private WebElementFacade selectingLowHighItem;


    @FindBy(css ="#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")
    private WebElementFacade priceOfItem;

      public void clickAddToCartButton(){
        addingToCartButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        addingToCartButton.click();
      }

      public void clickOnCardButton(){
        cartButton.click();
      }

      public void clickOnDropdownButton(){
          sortingDropdownButton.click();
      }

      public void clickOnselectingItem(){
          selectingItem.click();
      }

      public String priceOfItem(){
         return priceOfItem.getTextContent();
      }

      public void clickOnThirdItem(){
          selectingLowHighItem.click();
      }
}

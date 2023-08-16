package pages;

import static java.time.Duration.ofSeconds;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CartPage extends PageObject {

    private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    private WebElementFacade cartHeadlineText;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElementFacade removeButton;


    @FindBy(id = "continue-shopping")
    private WebElementFacade continueButton;


    @FindBy(id = "checkout")
    private WebElementFacade checkoutButton;

    public String cardHeadlineText(){
      cartHeadlineText.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
      return cartHeadlineText.getTextContent();
    }

    public void removeButton(){
      removeButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
      removeButton.click();
    }

    public void continueButton(){
      continueButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
      continueButton.click();
    }

    public void checkoutButton(){
      checkoutButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
      checkoutButton.click();
    }
}

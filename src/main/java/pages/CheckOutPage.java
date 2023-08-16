package pages;

import static PagesData.PagesData.CHECKOUT_FIRST_NAME;
import static PagesData.PagesData.CHECKOUT_LAST_NAME;
import static PagesData.PagesData.CHECKOUT_POSTAL_CODE;
import static java.time.Duration.ofSeconds;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CheckOutPage  extends PageObject {

      private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);

      @FindBy(css = "#header_container > div.header_secondary_container > span")
      private WebElementFacade checkoutHeadlineText;

      @FindBy(id = "continue")
      private WebElementFacade checkoutContinueButton;

      @FindBy(css = "#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")
      private WebElementFacade checkoutErrorText;

      @FindBy(id = "first-name")
      private WebElementFacade firstNameField;

      @FindBy(id = "last-name")
      private WebElementFacade lastNameField;

      @FindBy(id = "postal-code")
      private WebElementFacade postalCodeField;

      @FindBy(id = "finish")
      private WebElementFacade finishButton;


      @FindBy(css = "#checkout_complete_container > h2")
      private WebElementFacade finishHeadlineText;


      public String headlineText(){
          checkoutHeadlineText.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          return checkoutHeadlineText.getTextContent();
      }

      public void continueButton(){
          checkoutContinueButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          checkoutContinueButton.click();
      }

      public String checkoutErrorText(){
          checkoutErrorText.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          return checkoutErrorText.getTextContent();
      }

      public void checkoutFirstNameField(){
          firstNameField.sendKeys(CHECKOUT_FIRST_NAME);
      }

      public void checkoutLastNameField(){
          lastNameField.sendKeys(CHECKOUT_LAST_NAME);
      }

      public void checkoutPostalCodeField(){
          postalCodeField.sendKeys(CHECKOUT_POSTAL_CODE);
      }

      public void checkoutFinishButton(){
          finishButton.click();
      }

      public String finishHeadlineText(){
          finishHeadlineText.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          return finishHeadlineText.getTextContent();
      }

}

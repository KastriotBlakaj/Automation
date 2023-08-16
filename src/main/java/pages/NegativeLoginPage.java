package pages;


import static PagesData.PagesData.USER_PASSWORD;
import static PagesData.PagesData.WRONG_PASSWORD;
import static PagesData.PagesData.WRONG_USER_USERNAME;
import static java.time.Duration.ofSeconds;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class NegativeLoginPage extends PageObject {

      private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);


      @FindBy(id = "user-name")
      private WebElementFacade userNameField;

      @FindBy(id = "password")
      private WebElementFacade passwordField;

      @FindBy(id = "login-button")
      private WebElementFacade loginButton;

      @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
      private WebElementFacade errorText;

      public void userPutsWrongUsernameField(){
          userNameField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          userNameField.sendKeys(WRONG_USER_USERNAME);
      }

      public void userPutsRightUsernameField(){
          userNameField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          userNameField.sendKeys(WRONG_USER_USERNAME);
      }

      public void userPutsWrongPasswordField(){
          passwordField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          passwordField.sendKeys(WRONG_PASSWORD);
      }

      public void userPutsRightPasswordField(){
          passwordField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
          passwordField.sendKeys(USER_PASSWORD);
      }

      public void clickLoginButton(){
        loginButton.withTimeoutOf(TIMEOUT_IN_SECONDS).isClickable();
        loginButton.click();
      }

      public String getErrorText(){
        errorText.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        return errorText.getTextContent();
      }
}

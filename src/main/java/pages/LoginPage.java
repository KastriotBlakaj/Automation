package pages;

import static PagesData.PagesData.USER_PASSWORD;
import static PagesData.PagesData.USER_USERNAME;
import static java.time.Duration.ofSeconds;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends PageObject {

    private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);

    @FindBy(id = "user-name")
    private WebElementFacade userNameField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    private WebElementFacade dashboardHeadline;


    public void userPutsUsernameField(){
        userNameField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        userNameField.sendKeys(USER_USERNAME);
    }

    public void userPutsPasswordField(){
        passwordField.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        passwordField.sendKeys(USER_PASSWORD);
    }

    public void clickLoginButton(){
        loginButton.withTimeoutOf(TIMEOUT_IN_SECONDS).isClickable();
        loginButton.click();
    }

    public String getDashboardHeadline(){
        dashboardHeadline.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        return dashboardHeadline.getTextContent();
    }

}

package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class AboutPage extends PageObject {

    private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(10);

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade burgerButton;

    public void click_buger_button(){
        burgerButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        burgerButton.click();
    }


}

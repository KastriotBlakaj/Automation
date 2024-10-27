package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class AboutPage extends PageObject {

    private static final Duration TIMEOUT_IN_SECONDS = ofSeconds(20);

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade burgerButton;

    @FindBy(id = "about_sidebar_link")
    private WebElementFacade aboutButton;

    @FindBy(css = "#__next > div.MuiBox-root.css-14ifkx6 > div.MuiContainer-root.MuiContainer-maxWidthLg.css-w03l51 > div > div > div.MuiStack-root.css-lu2zz1 > div > div.MuiStack-root.css-chbenk > div:nth-child(1) > a > button")
    private WebElementFacade testFreeButton;

    public void click_buger_button(){
        burgerButton.withTimeoutOf(TIMEOUT_IN_SECONDS).waitUntilVisible();
        burgerButton.click();
    }

    public void click_on_about_button(){
        aboutButton.click();
    }

    public  void verify_the_button_is_visible(){
         testFreeButton.withTimeoutOf(TIMEOUT_IN_SECONDS).isVisible();
         testFreeButton.isClickable();
    }

}

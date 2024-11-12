package steps;

import net.thucydides.core.annotations.Step;
import pages.AboutPage;

public class AboutSteps extends AboutPage {

    private AboutPage aboutPage;

    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }

    @Step
    public void user_click_burger_button() {
        aboutPage.click_buger_button();
    }

    @Step
    public void user_click_on_about_button() {
        aboutPage.click_on_about_button();
    }

    @Step
    public void user_verify_the_visiblity_of_the_button() {
        aboutPage.verify_the_button_is_visible();
    }
}

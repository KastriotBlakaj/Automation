package steps;

import pages.AboutPage;
public class AboutSteps extends AboutPage {

    private AboutPage aboutPage;

    public void user_click_burger_button(){
        aboutPage.click_buger_button();
    }

    public void user_click_on_about_button(){
        aboutPage.click_on_about_button();
    }

    public void user_verify_the_visiblity_of_the_button(){
        aboutPage.verify_the_button_is_visible();
    }

}

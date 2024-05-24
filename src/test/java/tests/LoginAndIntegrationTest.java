package tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import steps.CartSteps;
import steps.CheckoutSteps;
import steps.DashboardSteps;
import steps.LoginSteps;
import steps.AboutSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginAndIntegrationTest extends BaseClass {

    @Managed
    WebDriver driver;

    @Steps
    private BaseClass baseClass;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private DashboardSteps dashboardSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private AboutSteps aboutSteps;

    @Test
    public void loginUserTest(){
      loginMethod();
    }

    @Test
    public void aboutTest(){
        loginMethod();
        aboutSteps.user_click_burger_button();
        aboutSteps.user_click_on_about_button();
        aboutSteps.user_verify_the_visiblity_of_the_button();
    }

    @Test
    public void sortingTestbyprice(){
        loginMethod();
        dashboardSteps.user_taps_drop_down_button();
        dashboardSteps.user_select_the_item();
    }

    @Test
    public void addingNewItemIntoCart(){
        loginMethod();
        dashboardSteps.user_adds_item_to_the_cart();
        dashboardSteps.user_taps_on_the_cart();

    }

    @Test
    public void addingNewItemIntoCartAndRemovingIt(){
        loginMethod();
        dashboardSteps.user_adds_item_to_the_cart();
        dashboardSteps.user_taps_on_the_cart();
        cartSteps.verify_cart_headline_text();
        cartSteps.click_remove_item_button();
        cartSteps.click_continue_shopping_button();
        dashboardSteps.user_adds_item_to_the_cart();
        dashboardSteps.user_taps_on_the_cart();
        cartSteps.click_on_checkout_button();
    }

    @Test
    public void addingNewItemAndCheckout(){
        loginMethod();
        dashboardSteps.user_adds_item_to_the_cart();
        dashboardSteps.user_taps_on_the_cart();
        cartSteps.verify_cart_headline_text();
        cartSteps.click_remove_item_button();
        cartSteps.click_continue_shopping_button();
        dashboardSteps.user_adds_item_to_the_cart();
        dashboardSteps.user_taps_on_the_cart();
        cartSteps.click_on_checkout_button();
        checkoutSteps.verify_checkout_headline_Text();
        checkoutSteps.click_continue_button();
        checkoutSteps.verify_error_on_checkout();
        checkoutSteps.checkout_first_name();
        checkoutSteps.checkout_last_name();
        checkoutSteps.checkout_postal_code();
        checkoutSteps.click_continue_button();
        checkoutSteps.checkout_finish_button();
        checkoutSteps.verify_finish_headline_text();
    }

    public void loginMethod(){
        baseClass.userRedirectToRightUrl();
        loginSteps.user_puts_email();
        loginSteps.user_puts_password();
        loginSteps.user_taps_login_button();
        loginSteps.user_verify_the_dashboard_headline();
    }
}

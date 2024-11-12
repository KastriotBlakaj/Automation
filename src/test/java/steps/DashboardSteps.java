package steps;

import net.thucydides.core.annotations.Step;
import pages.DashboardPage;

import static data.Data.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DashboardSteps extends DashboardPage {

    private DashboardPage dashboardPage;

    @Step
    public void userRedirectToRightUrl() {
        openAt("/");  // This will open the base URL from serenity.properties
    }

    @Step
    public void user_adds_item_to_the_cart() {
        dashboardPage.clickAddToCartButton();
    }

    @Step
    public void user_taps_on_the_cart() {
        dashboardPage.clickOnCardButton();
    }

    @Step
    public void user_taps_drop_down_button() {
        dashboardPage.clickOnDropdownButton();
    }

    @Step
    public void user_select_the_item() {
        dashboardPage.clickOnselectingItem();
    }

    @Step
    public void verify_the_price_of_item() {
        assertEquals(ITEM_PRICE, dashboardPage.priceOfItem());
    }

    @Step
    public void user_clicks_on_third_option() {
        dashboardPage.clickOnThirdItem();
    }

    @Step
    public void verify_price_low_to_high() {
        assertEquals(ITEM_PRICE_SORTED, dashboardPage.priceOfItem());
    }
}

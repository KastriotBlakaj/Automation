package steps;

import pages.DashboardPage;

import static data.Data.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DashboardSteps extends DashboardPage{

    private DashboardPage dashboardPage;

    public void user_adds_item_to_the_cart(){
      dashboardPage.clickAddToCartButton();
    }

    public void user_taps_on_the_cart(){
      dashboardPage.clickOnCardButton();
    }

    public void user_taps_drop_down_button(){
        dashboardPage.clickOnDropdownButton();
    }

    public void user_select_the_item(){
        dashboardPage.clickOnselectingItem();
    }

    public void verify_the_price_of_item(){
        assertEquals(ITEM_PRICE, dashboardPage.priceOfItem());
    }

    public void user_clicks_on_third_option(){
        dashboardPage.clickOnThirdItem();
    }

    public void verify_price_low_to_high(){
        assertEquals(ITEM_PRICE_SORTED,dashboardPage.priceOfItem());
    }
}

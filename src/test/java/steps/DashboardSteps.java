package steps;

import pages.DashboardPage;

public class DashboardSteps {

  private DashboardPage dashboardPage;

  public void user_adds_item_to_the_cart(){
    dashboardPage.clickAddToCartButton();
  }

  public void user_taps_on_the_cart(){
    dashboardPage.clickOnCardButton();
  }

}

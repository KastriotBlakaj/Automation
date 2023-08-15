package steps;

import pages.LoginPage;

import static data.Data.TEXT_HEADLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends LoginPage {

  private LoginPage landingPages;

  public void user_verify_the_headline(){
    assertEquals(TEXT_HEADLINE, landingPages.getTextHeadline());
  }

}

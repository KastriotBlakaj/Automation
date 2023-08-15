package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
  @FindBy(id = "user-name")
  private WebElementFacade headlineText;

  public String getTextHeadline() {
    return  headlineText.getTextContent();
  }

}

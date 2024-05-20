package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@ExtendWith(SerenityJUnit5Extension.class)
public class BaseClass extends UIInteractionSteps {

      @Before
      public void userRedirectToRightUrl() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver-win64\\chromedriver.exe");
        openUrl("https://www.saucedemo.com/");
        getDriver().manage().window().maximize();
      }

      public void scrollToElement(WebElement element) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element, 0, 0).perform();
      }

      @After
      public void tearDown() {
        if (!(getDriver() ==null)){
            getDriver().quit();
        }
      }
}
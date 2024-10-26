package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import java.util.Map;

@ExtendWith(SerenityJUnit5Extension.class)
public class BaseClass extends UIInteractionSteps {


      @Before
      public void userRedirectToRightUrl() {
          WebDriverManager.chromedriver().setup();
          getDriver().manage().window().maximize();
          openUrl("https://www.saucedemo.com/");
      }


      @After
      public void tearDown() {
        if (!(getDriver() ==null)){
            getDriver().quit();
        }
      }
}
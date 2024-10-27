package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Before;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class BaseClass extends UIInteractionSteps {


    @Before
    public void userRedirectToRightUrl() {
        WebDriverManager.chromedriver().setup();
        getDriver().manage().window().maximize();
        try {
            Thread.sleep(10000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        openUrl("https://www.saucedemo.com/");
    }

    public void tearDown() {
        if (!(getDriver() == null)) {
            getDriver().quit();
        }
    }
}
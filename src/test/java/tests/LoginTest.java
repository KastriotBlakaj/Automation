package tests;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest extends BaseClass {

    @Managed
    WebDriver driver;

    @Steps
    private BaseClass baseClass;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void userTest(){
      baseClass.userRedirectToRightUrl();
      loginSteps.user_verify_the_headline();
    }

}

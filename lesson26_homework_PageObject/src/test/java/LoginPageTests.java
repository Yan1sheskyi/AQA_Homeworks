import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wanderlust.flow.LoginFlow;

import java.time.Duration;

public class LoginPageTests extends Init{

    private LoginFlow loginFlow = new LoginFlow(driver);

    @Test
    public void emptyEmailErrorTextCheck() {
        driver.get("https://wanderlust.com.ua/en/site/login");
        Assertions.assertEquals(loginFlow.getWrongEmailError(driver).getText(), "E-mail cannot be blank.");
    }

    @Test
    public void wrongEmailErrorTextCheck() {
        driver.get("https://wanderlust.com.ua/en/site/login");

        Assertions.assertEquals(loginFlow.getWrongEmailError("WrongEmail", driver).getText(), "E-mail is not a valid email address.");
    }

    @Test
    public void createAccountClickTest() {
        driver.get("https://wanderlust.com.ua/en/site/login");
        loginFlow.clickRegistrationButton();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://wanderlust.com.ua/en/site/registration");
    }

    @Test void loginTest() {
        driver.get("https://wanderlust.com.ua/en/site/login");
        loginFlow.login("TestEmail@wanderlust.com", "TestPassword#1");
    }

}

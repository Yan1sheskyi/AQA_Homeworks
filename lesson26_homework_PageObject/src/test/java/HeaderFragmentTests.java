import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.wanderlust.flow.HeaderFlow;

public class HeaderFragmentTests extends Init{

    private HeaderFlow headerFlow = new HeaderFlow(driver);

    @Test
    public void headerLogoClickTest() {
        driver.get("https://wanderlust.com.ua/en");
        headerFlow.clickHeaderLogo();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://wanderlust.com.ua/en");
    }

    @Test
    public void headerPhoneIconCheck() {
        driver.get("https://wanderlust.com.ua/en");
        Assertions.assertTrue(headerFlow.getHeaderPhoneIcon().isDisplayed());

    }

    @Test
    public void headerPhoneNumberCheck() {
        driver.get("https://wanderlust.com.ua/en");
        Assertions.assertEquals(headerFlow.getHeaderPhoneNumber().getText(), "+380 95 364 17 36");
    }

    @Test
    public void headerLanguageChangeCheck() {
        driver.get("https://wanderlust.com.ua/en");
        headerFlow.changeLanguage();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://wanderlust.com.ua/uk");
    }

    @Test
    public void headerLoginIconClickTest() {
        driver.get("https://wanderlust.com.ua/en");
        headerFlow.clickHeaderLoginIcon();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://wanderlust.com.ua/en/site/login");
    }

}

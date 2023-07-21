package WebDriverTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class WebDriverCash {

    private static WebDriver driver;

    private WebDriverCash() {
    }

    public static WebDriver getDriver() {

        ChromeOptions options = new ChromeOptions();                //          Це я глянув в іннеті, бо без цього в мене видавало помилку:
        options.addArguments("--remote-allow-origins=*");           //          Invalid Status code=403 text=Forbidden

        if (Objects.nonNull(driver)) {
            return driver;
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver(options);
            return driver;
        }
    }
}

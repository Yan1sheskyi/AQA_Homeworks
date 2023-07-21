
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wanderlust.driver.WebDriverCash;
import org.wanderlust.flow.HeaderFlow;
import org.wanderlust.pages.HeaderFragment;


public class Init {
    protected static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://wanderlust.com.ua/en");
    }


//    @AfterAll
//    public static void driverQuit() {
//        driver.quit();
//            }
}

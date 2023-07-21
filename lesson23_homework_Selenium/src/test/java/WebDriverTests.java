import com.beust.jcommander.DynamicParameter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import WebDriverTests.WebDriverCash;
import org.openqa.selenium.By;

public class WebDriverTests {

    @Test
    @DisplayName("News page -> main title check")
    public void Test1() {
        WebDriverCash.getDriver().manage().window().maximize();
        WebDriverCash.getDriver().get("https://www.ukr.net/");
        WebDriverCash.getDriver().findElement(By.xpath("//h2[@class='feed__section--title']/a[contains(text(), 'Головне')]")).click();
        Assertions.assertEquals(WebDriverCash.getDriver().findElement(By.xpath("//main[@id='main']/div/h2")).getText(), "Головні події України та світу");


    }

    @Test
    @DisplayName("News page -> img clicking returns to main page check")
    public void Test2() {
        WebDriverCash.getDriver().findElement(By.xpath("//nav[@id=\"nav\"]/div/div/div/a/img")).click();
        Assertions.assertEquals(WebDriverCash.getDriver().getCurrentUrl(), "https://www.ukr.net/");
    }

    @Test
    @DisplayName("Main page -> fuel tab -> A-95+ and it`s price is displayed")
    public void Test3() {
        WebDriverCash.getDriver().findElement(By.xpath("//li[@data-tab='fuel']")).click();
        Assertions.assertEquals(WebDriverCash.getDriver().findElement(By.xpath("//li[@id='fuel-2']/div[@class='name']")).getText(), "A-95+");
        Assertions.assertTrue(WebDriverCash.getDriver().findElement(By.xpath("//li[@id='fuel-2']/div[@class='price']")).isDisplayed());
        WebDriverCash.getDriver().close();
    }
}

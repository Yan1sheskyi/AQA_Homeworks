package org.wanderlust.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderFragment extends AbstractPage{

    private final static By HEADER_LOGO = By.cssSelector(".navbar-brand > img");
    private final static By HEADER_PHONE_ICON = By.cssSelector("a[href^= tel]  > svg");
    private final static By HEADER_PHONE_NUMBER = By.cssSelector("a[href^= tel]  > span");
    private final static By HEADER_LOGIN_ICON = By.cssSelector(".icon-person");
    private final static By HEADER_SHOPPING_CART_ICON = By.cssSelector(".icon-cart");
    private final static By HEADER_CURRENCY_DROPDOWN = By.cssSelector("li:nth-child(4) > a");
    private final static By HEADER_LANGUAGE_DROPDOWN = By.cssSelector("li:nth-child(5) > a");
    private final static By HEADER_ANOTHER_CURRENCY = By.cssSelector("#w4 > a");
    private final static By HEADER_ANOTHER_LANGUAGE = By.cssSelector("#w5 > a");

    public HeaderFragment(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeaderLogo() {
        return driver.findElement(HEADER_LOGO);
    }
    public WebElement getHeaderPhoneIcon() {
        return driver.findElement(HEADER_PHONE_ICON);
    }
    public WebElement getHeaderPhoneNumber() {
        return driver.findElement(HEADER_PHONE_NUMBER);
    }
    public WebElement getHeaderLoginIcon() {
        return driver.findElement(HEADER_LOGIN_ICON);
    }
    public WebElement getHeaderShoppingCartIcon() {
        return driver.findElement(HEADER_SHOPPING_CART_ICON);
    }
    public WebElement getHeaderCurrencyDropdown() {
        return driver.findElement(HEADER_CURRENCY_DROPDOWN);
    }
    public WebElement getHeaderLanguageDropdown() {
        return driver.findElement(HEADER_LANGUAGE_DROPDOWN);
    }
    public WebElement getHeaderAnotherCurrency() {
        return driver.findElement(HEADER_ANOTHER_CURRENCY);
    }
    public WebElement getHeaderAnotherLanguage() {
        return driver.findElement(HEADER_ANOTHER_LANGUAGE);
    }

}

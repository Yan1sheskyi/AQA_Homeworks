package org.wanderlust.flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.wanderlust.pages.HeaderFragment;

public class HeaderFlow {

    private HeaderFragment headerFragment;

    public HeaderFlow(WebDriver driver) {
        this.headerFragment = new HeaderFragment(driver);
    }

    public void clickHeaderLogo() {
        headerFragment.getHeaderLogo().click();
    }

    public WebElement getHeaderPhoneIcon() {
        return headerFragment.getHeaderPhoneIcon();
    }

    public WebElement getHeaderPhoneNumber() {
        return headerFragment.getHeaderPhoneNumber();
    }

    public void clickHeaderLoginIcon() {
        headerFragment.getHeaderLoginIcon().click();
    }

    public void clickHeaderShoppingCartIcon() {
        headerFragment.getHeaderShoppingCartIcon().click();
    }

    public void clickHeaderCurrencyDropdown() {
        headerFragment.getHeaderCurrencyDropdown().click();
    }

    public void clickHeaderLanguageDropdown() {
        headerFragment.getHeaderLanguageDropdown().click();
    }

    public void changeCurrency() {
        clickHeaderCurrencyDropdown();
        headerFragment.getHeaderAnotherCurrency().click();
    }

    public void changeLanguage() {
        clickHeaderLanguageDropdown();
        headerFragment.getHeaderAnotherLanguage().click();
    }

}

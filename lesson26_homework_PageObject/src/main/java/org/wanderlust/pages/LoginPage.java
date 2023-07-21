package org.wanderlust.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    public final static By LOGIN_PAGE_LABEL = By.cssSelector("div > h1");
    public final static By EMAIL_LABEL = By.cssSelector("[for=loginform-email]");
    public final static By EMAIL_INPUT_FIELD= By.cssSelector("input#loginform-email");
    public final static By EMAIL_WRONG_EMAIL_ERROR= By.cssSelector(".field-loginform-email > div > div");
    public final static By PASSWORD_LABEL = By.cssSelector("[for=loginform-password]");
    public final static By PASSWORD_INPUT_FIELD = By.cssSelector("input#loginform-password");
    public final static By PASSWORD_EMPTY_ERROR = By.cssSelector(".field-loginform-password .invalid-feedback");
    public final static By REMEMBER_ME_CHECKBOX = By.cssSelector("[for=loginform-rememberme]");
    public final static By LOGIN_BUTTON = By.cssSelector(".form-group > [name=login-button]");
    public final static By REGISTRATION_BUTTON = By.cssSelector("#login-form > div:nth-child(7) > a");
    public final static By FORGOT_PASSWORD_BUTTON = By.cssSelector("#login-form > div:nth-child(8) > a");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginPageLabel() {
        return driver.findElement(LOGIN_PAGE_LABEL);
    }
    public WebElement getEmailLabel() {
        return driver.findElement(EMAIL_LABEL);
    }
    public WebElement getEmailInputField() {
        return driver.findElement(EMAIL_INPUT_FIELD);
    }
    public WebElement getWrongEmailError() {
        return driver.findElement(EMAIL_WRONG_EMAIL_ERROR);
    }
    public WebElement getPasswordLabel() {
        return driver.findElement(PASSWORD_LABEL);
    }
    public WebElement getPasswordInputField() {
        return driver.findElement(PASSWORD_INPUT_FIELD);
    }
    public WebElement getPasswordEmptyError() {
        return driver.findElement(PASSWORD_EMPTY_ERROR);
    }
    public WebElement getRememberMeCheckbox() {
        return driver.findElement(REMEMBER_ME_CHECKBOX);
    }
    public WebElement getLoginButton() {
        return driver.findElement(LOGIN_BUTTON);
    }
    public WebElement getRegistrationButton() {
        return driver.findElement(REGISTRATION_BUTTON);
    }
    public WebElement getForgotPasswordButton() {
        return driver.findElement(FORGOT_PASSWORD_BUTTON);
    }

}

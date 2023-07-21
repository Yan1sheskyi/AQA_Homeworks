package org.wanderlust.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wanderlust.pages.LoginPage;

import java.time.Duration;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver){
        this.loginPage = new LoginPage(driver);
    }

    public WebElement getLoginPageLabel() {
        return loginPage.getLoginPageLabel();
    }

    public WebElement getEmailLabel() {
        return loginPage.getEmailLabel();
    }

    public void clickEmailLabel() {
        loginPage.getEmailLabel().click();
    }

    public void clickEmailInputField() {
        loginPage.getEmailInputField().click();
    }

    public void setEmailInputField(String email) {
        loginPage.getEmailInputField().clear();
        loginPage.getEmailInputField().sendKeys(email);
    }

    public WebElement getWrongEmailError(String wrongEmail, WebDriver driver) {
        setEmailInputField(wrongEmail);
        clickEmailLabel();
        return new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(loginPage.getWrongEmailError()));
    }

    public WebElement getWrongEmailError(WebDriver driver) {
        clickEmailInputField();
        clickEmailLabel();
        return new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(loginPage.getWrongEmailError()));
    }

    public WebElement getPasswordLabel() {
        return loginPage.getPasswordLabel();
    }

    public void setPasswordInputField(String password) {
        loginPage.getPasswordInputField().clear();
        loginPage.getPasswordInputField().sendKeys(password);
    }

    public void clickPasswordInputField() {
        loginPage.getPasswordInputField().click();
    }

    public void clickPasswordLabel() {
        loginPage.getPasswordLabel().click();
    }

    public WebElement getPasswordEmptyError() {
        return loginPage.getPasswordEmptyError();
    }

    public void clickRememberMeCheckbox() {
        loginPage.getRememberMeCheckbox().click();
    }

    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }

    public void clickRegistrationButton() {
        loginPage.getRegistrationButton().click();
    }

    public void clickForgotPasswordButton() {
        loginPage.getForgotPasswordButton();
    }

    public void login(String email, String password) {
        setEmailInputField(email);
        setPasswordInputField(password);
        clickLoginButton();
    }
}

package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public static WebDriver driver;
    public LandingPage(WebDriver driver) {
        LandingPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='button-component button-component-primary button-component-solid button-component-md']")
    private WebElement loginBtn;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitLoginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void userLogin(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitLoginBtn.click();
    }

}

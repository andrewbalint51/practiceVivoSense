package com.vivoSense.pages;

import com.vivoSense.utilities.BrowserUtils;
import com.vivoSense.utilities.ConfigurationReader;
import com.vivoSense.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ObjectInputFilter;
import java.time.Duration;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* @FindBy(css = "label[for='inputEmail']")
    public WebElement email;

    @FindBy(css = "label[for='inputPassword']")
    public WebElement password;

    @FindBy(css="button[type='submit']")
    public WebElement loginButton;*/

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement loginButton;

    public void login(String email, String password){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until()
        this.email.sendKeys(email);
        this.email.click();
        this.password.sendKeys(password);
        loginButton.click();
    }

    public void login(String userType){
        String email = ConfigurationReader.getProperty(userType+"_username");
        String password = ConfigurationReader.getProperty(userType+"_password");
        BrowserUtils.sleep(3);
        login(email, password);
    }

}

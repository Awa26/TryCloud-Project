package com.seamlessly.pages;


import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="user")
    public WebElement txt_userName;



    @FindBy(id="password")
    public WebElement txt_password;

    @FindBy(id="submit-form")
    public WebElement loginBtn;


    public void login() {
        txt_userName.sendKeys(ConfigurationReader.getProperty("user_name"));
        txt_password.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();

    }
    @FindBy(xpath="//p[@class='warning wrongPasswordMsg']")
    public  WebElement errorMessage;

}

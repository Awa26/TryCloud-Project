package com.seamlessly.step_definitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US84_InvalidCredLoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        loginPage.txt_userName.sendKeys(username);
        loginPage.txt_password.sendKeys(password);
        loginPage.loginBtn.click();
    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String message) {
        loginPage.errorMessage.isDisplayed();
        Assert.assertEquals(loginPage.errorMessage.getText(),message);
    }


}

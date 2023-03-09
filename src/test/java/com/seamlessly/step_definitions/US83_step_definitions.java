package com.seamlessly.step_definitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US83_step_definitions {
    LoginPage loginPage = new LoginPage();

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
     String expectedTitle = "Dashboard";
       BrowserUtils.verifyTitleContains(expectedTitle);
    }



    @When("user enters username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String userName, String password) {
loginPage.txt_userName.sendKeys(userName);
loginPage.txt_password.sendKeys(password);

    }

}

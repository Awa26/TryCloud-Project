package com.seamlessly.step_definitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.*;

public class US86_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    @When("user is already logged in.")
    public void user_is_already_logged_in() {
       loginPage.login();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
    
}

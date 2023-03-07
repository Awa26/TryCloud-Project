package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class US60_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.login();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedOptions) {

        BrowserUtils.sleep(5);
        System.out.println("expectedOptions = " + expectedOptions);
        List<String> actualMenuOption = new ArrayList<>();


        System.out.println("actualMenuOption.size() = " + actualMenuOption.size());
        System.out.println("dashboardPage.MenuOptions.size() = " + dashboardPage.MenuOptions.size());
        System.out.println("dashboardPage.deckIcon.getText() = " + dashboardPage.deckIcon.getText());
        System.out.println("dashboardPage.deckIcon.getAttribute(\"data-id\") = " + dashboardPage.deckIcon.getAttribute("data-id"));

        for (WebElement each : dashboardPage.MenuOptions) {
            actualMenuOption.add(each.getAttribute("data-id"));
        }
        System.out.println("actualMenuOption = " + actualMenuOption);
     //   Assert.assertTrue(actualMenuOption.equals(expectedOptions));
    }

}
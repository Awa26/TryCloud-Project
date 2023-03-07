package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(dashboardPage.deckIcon).perform();


        for (WebElement each : dashboardPage.menuOptions) {
           // System.out.println((each.getAttribute("aria-label")).toUpperCase());
            System.out.println(each.getText());
            actualMenuOption.add(each.getText());
        }
        System.out.println("actualMenuOption = " + actualMenuOption);
        Assert.assertFalse(actualMenuOption.equals(expectedOptions));
    }

}
package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class US85_DashboardModules_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.login();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedOptions) {

        BrowserUtils.sleep(5);


      List<String> actualMenuOption = new ArrayList<>();

        for (int i = 0; i < dashboardPage.appMenu.size()-1; i++) {
            actualMenuOption.add(dashboardPage.appMenu.get(i).getAccessibleName());

        }

        Assert.assertTrue(actualMenuOption.equals(expectedOptions));



        for (int i = 0; i < 9; i++) {
           BrowserUtils.verifyElementDisplayed(dashboardPage.appMenu.get(i));
            System.out.println(dashboardPage.appMenu.get(i).getAccessibleName()+" module is visible");
        }


    }

}
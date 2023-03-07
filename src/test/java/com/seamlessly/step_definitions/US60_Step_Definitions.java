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


      /*  List<String> actualMenuOption = new ArrayList<>();


        for (WebElement each : dashboardPage.appMenu) {
            actualMenuOption.add(each.getAttribute("data-id"));
        }
        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualMenuOption = " + actualMenuOption);
        Assert.assertFalse(actualMenuOption.equals(expectedOptions));

    */


        BrowserUtils.verifyElementDisplayed(dashboardPage.dashboardIcon);
        System.out.println("Dashboard module is displayed");
        BrowserUtils.verifyElementDisplayed(dashboardPage.filesIcon);
        System.out.println("Files module is displayed");
        BrowserUtils.verifyElementDisplayed(dashboardPage.photosIcon);
        System.out.println("Photos module is displayed");
        BrowserUtils.verifyElementDisplayed(dashboardPage.activityIcon);
        System.out.println("Activity module is displayed");
        BrowserUtils.verifyElementDisplayed(dashboardPage.talkIcon);
        System.out.println("Talk module is displayed");
        BrowserUtils.verifyElementDisplayed(dashboardPage.contactsIcon);
        BrowserUtils.verifyElementDisplayed(dashboardPage.circlesIcon);
        BrowserUtils.verifyElementDisplayed(dashboardPage.calendarIcon);
        BrowserUtils.verifyElementDisplayed(dashboardPage.deckIcon);
    }

}
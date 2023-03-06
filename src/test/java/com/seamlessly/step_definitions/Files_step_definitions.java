package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Files_step_definitions {


    // ashley US  As a user, I should be able to update settings.

    // Dashboard object to call relevant locators on dashboard
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("dashboardURL"));
    }
    @When("the user clicks the files module")
    public void the_user_clicks_the_module(String filesIcon) {
        dashboardPage.filesIcon.click();
    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }













}

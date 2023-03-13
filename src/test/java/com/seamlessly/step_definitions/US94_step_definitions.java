package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US94_step_definitions {


    // ashley US  As a user, I should be able to update settings.

    // created Dashboard and Files object to call and use relevant locators on dashboard
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    LoginPage loginPage = new LoginPage();

   @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
    filesPage.settingsButton.click();

    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {

       BrowserUtils.waitForClickablility(filesPage.richWorkspacesCheckbox, 5);
    filesPage.richWorkspacesCheckbox.click();
        BrowserUtils.waitForClickablility(filesPage.hiddenFilesCheckbox, 5);
        filesPage.hiddenFilesCheckbox.click();
        BrowserUtils.waitForClickablility(filesPage.recommendationsCheckbox, 5);
        filesPage.recommendationsCheckbox.click();
        BrowserUtils.waitForClickablility(filesPage.cropImageCheckbox, 5);
        filesPage.cropImageCheckbox.click();



    // if selected assertion (is selected)

    }













}

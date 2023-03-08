package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.*;

import java.nio.file.Files;

public class US86_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();
/*
    DashboardPage dashboardPage = new DashboardPage();
    @When("user is already logged in.")
    public void user_is_already_logged_in() {
       loginPage.login();
    }

 */




    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        BrowserUtils.sleep(2);
        filesPage.files_Icon.click();}

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
       BrowserUtils.verifyTitleContains(expectedTitle);
    }



    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage.selectAllFiles_checkBox.click();
    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
filesPage.selectAllFiles_checkBox.isSelected();
    }

}

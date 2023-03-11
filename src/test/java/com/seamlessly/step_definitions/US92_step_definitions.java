package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FilesActionPage;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US92_step_definitions {

    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    LoginPage loginPage = new LoginPage();
    Actions action = new Actions(Driver.getDriver());

FilesActionPage actionPage = new FilesActionPage();


    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(2);
        action.moveToElement(filesPage.iuliiaFile).contextClick()
                .click(filesPage.delete)
                .perform();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String deleteFileOptions) {
        actionPage.deleteIcon.click();

    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String deleteFilesButton) {
        actionPage.deleteFilesButton.click();
    }

    @Then("Verify the deleted file is displayed on the Deleted Files page.")
    public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {
        Assert.assertTrue(actionPage.deletedFileName.isDisplayed());

    }

  /*  @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        dashboardPage.filesIcon.click();

  }*/

}

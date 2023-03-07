package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US91_StepDefinitions {
    DashboardPage dashboardPage = new DashboardPage();
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(dashboardPage.deckIcon).perform();

        for (WebElement each : dashboardPage.menuOptions){
            if(each.getText().equals(module)){
                each.click();
            }
        }
    }
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }
}

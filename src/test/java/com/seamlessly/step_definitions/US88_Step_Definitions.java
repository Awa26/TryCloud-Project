package com.seamlessly.step_definitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US88_Step_Definitions {

    FilesPage filesPage = new FilesPage();


    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        filesPage.addIcon.click();
    }
    @When("users uploads file with the upload file option")
    public void users_uploads_file_with_the_upload_file_option() {
        //filesPage.uploadFileButton.click();
        filesPage.uploadFileButton.sendKeys("/Users/ivayloklisarski/Desktop/Upload.txt");
        //BrowserUtils.sleep(2);
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }

}

package com.seamlessly.step_definitions;

import com.github.javafaker.Faker;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US91_StepDefinitions {


    FilesPage filesPage = new FilesPage();
    String folderName = BrowserUtils.randomNameGenerator();
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
       filesPage.addIcon.click();
       filesPage.add_Folder.click();
       filesPage.newFolder_Input_box.sendKeys(folderName + Keys.ENTER);
       BrowserUtils.sleep(2);
       filesPage.folderSearch(folderName).click();

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

        filesPage.addIcon.click();


    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        String path = BrowserUtils.dynamicPath();
        filesPage.uploadFileButton.sendKeys(path);

    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitForVisibility(filesPage.uploadedFile,10);
        Assert.assertTrue(filesPage.uploadedFile.isDisplayed());
    }

}

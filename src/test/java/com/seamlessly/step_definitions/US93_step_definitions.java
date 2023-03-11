package com.seamlessly.step_definitions;

import com.seamlessly.pages.FilesActionPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US93_step_definitions {

    FilesActionPage filesActionPage = new FilesActionPage();

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

        filesActionPage.commentsIcon.click();
        filesActionPage.commentBox.sendKeys("Hello World"+ Keys.ENTER);
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
       // filesActionPage.submitCommentButton.;

    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        Assert.assertTrue(filesActionPage.commentMessage.isDisplayed());
    }

    @And("user choose the Details option")
    public void userChooseTheDetailsOption() {

        filesActionPage.detailsIcon.click();
    }
}

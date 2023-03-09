package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.PhotosPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US96_step_definitions {

     DashboardPage dashboardPage = new DashboardPage();

     PhotosPage photosPage=new PhotosPage();

        @When("user click the Photos button")
        public void user_click_the_photos_button() {
            dashboardPage.photosIcon.click();

        }
        @Then("user should see Photos in the title")
        public void user_should_see_photos_in_the_title() {
            BrowserUtils.verifyTitle("Photos - Seamlessly");
        }
      @Then("user should be able to see all side menu selections")
       public void userShouldBeAbleToSeeAllSideMenuSelections() {
            photosPage.YourPhotos.isDisplayed();
            photosPage.YourVideos.isDisplayed();
            photosPage.Favorites.isDisplayed();
            photosPage.OnThisDay.isDisplayed();
            photosPage.YourFolders.isDisplayed();
            photosPage.SharedWithYou.isDisplayed();
            photosPage.TaggedPhotos.isDisplayed();

        }


    }


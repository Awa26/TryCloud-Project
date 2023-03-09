package com.seamlessly.step_definitions;

import com.seamlessly.pages.SearchFilesPage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US95_step_definitions {
    SearchFilesPage searchFilesPage = new SearchFilesPage();


    @When("the user clicks the search icon")
    public void the_user_clicks_the_search_icon() {
        searchFilesPage.searchIcon.click();
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchKey) {
        searchFilesPage.searchBox.sendKeys(searchKey);
        searchFilesPage.searchArrow.click();
        
    }

    @Then("the user should be able to see {string} in search result")
    public void theUserShouldBeAbleToSeeInSearchResult(String searchResultKey) {
        searchFilesPage.resultText.getText().equalsIgnoreCase(searchResultKey);
    }

}


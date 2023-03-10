package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FavoriteFilesPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US87_Step_Definitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @When("the user clicks the File module")
    public void the_user_clicks_the_module() {
        dashboardPage.filesIcon.click();
        favoriteFilesPage.favoriteButtonMenuBar.click();


        if (favoriteFilesPage.tableOfSelectedFavorite.size() > 0) {

            for (int i = 1, k = 1, j = favoriteFilesPage.listOfActions.size() - 1; i <= favoriteFilesPage.tableOfSelectedFavorite.size(); i++, j--) {
                favoriteFilesPage.listOfActions.get(j).click();
                BrowserUtils.sleep(1);
                favoriteFilesPage.removeFromFavorite.click();

                if (k == favoriteFilesPage.tableOfSelectedFavorite.size()) {
                    break;
                }
                k++;
            }
            if (favoriteFilesPage.noFavoritesYet.getText().equals("No favorites yet")) {
                dashboardPage.filesIcon.click();
            }

            dashboardPage.filesIcon.click();
        }

    }


    FavoriteFilesPage favoriteFilesPage = new FavoriteFilesPage();

    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        for (int i = 0; i < favoriteFilesPage.listOfActions.size(); i++) {
            favoriteFilesPage.listOfActions.get(i).click();
            BrowserUtils.sleep(1);
            favoriteFilesPage.listOfActions.get(i).click();

        }

    }

    @When("user choose the Add to favorite option")
    public void user_choose_the_option() {


        for (int i = 0; i < favoriteFilesPage.listOfActions.size(); i++) {
            favoriteFilesPage.listOfActions.get(i).click();
            BrowserUtils.sleep(1);

            if (favoriteFilesPage.addToFavorite.isDisplayed()) {
                BrowserUtils.sleep(1);
                favoriteFilesPage.addToFavorite.click();
            } else {
                favoriteFilesPage.listOfActions.get(i).click();
            }

        }


    }

    @When("user click the Favorite sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side() {

        favoriteFilesPage.favoriteButtonMenuBar.click();
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        for (int i = 0, j = 2, k = 1; i < favoriteFilesPage.tableOfSelectedFavorite.size(); i++, j++, k++) {

            System.out.println(k + " " + favoriteFilesPage.tableOfSelectedFavorite.get(i).getAttribute("data-file"));


        }


    }


}

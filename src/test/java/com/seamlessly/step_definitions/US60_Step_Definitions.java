package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US60_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
      loginPage.login();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {

    }
}

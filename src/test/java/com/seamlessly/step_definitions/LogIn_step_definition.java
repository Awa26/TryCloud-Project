package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LogIn_step_definition {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    Actions action = new Actions(Driver.getDriver());
    @Given("user log in as {string}")
    public void user_log_in_as(String typeUser){
        if(typeUser.equalsIgnoreCase("user")){
            loginPage.txt_userName.sendKeys(ConfigurationReader.getProperty("user_name"));
            loginPage.txt_password.sendKeys(ConfigurationReader.getProperty("userPassword"));
            loginPage.loginBtn.click();
        }else if(typeUser.equalsIgnoreCase("employee")){
            loginPage.txt_userName.sendKeys(ConfigurationReader.getProperty("employee_name"));
            loginPage.txt_password.sendKeys(ConfigurationReader.getProperty("employeePassword"));
            loginPage.loginBtn.click();
        }

    }

}

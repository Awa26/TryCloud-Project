package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Dashboard_step_definition {

    DashboardPage dashboardPage = new DashboardPage();
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleName) {

        for(WebElement each : dashboardPage.appMenu){
            if(each.getAttribute("data-id").equalsIgnoreCase(moduleName))
                each.click();

        }
        System.out.println("MODULE DOESN'T EXIST");
    }
}

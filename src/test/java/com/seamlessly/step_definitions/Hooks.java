package com.seamlessly.step_definitions;

import com.seamlessly.pages.DashboardPage;
import com.seamlessly.pages.FilesActionPage;
import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */
public class Hooks {

    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    FilesActionPage filesActionPage = new FilesActionPage();
    Actions action = new Actions(Driver.getDriver());

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){
        System.out.println("first");

       Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
   //     Driver.getDriver().get("https://qa.seamlessly.net/index.php/login");
    }


    //@Before (value = "@login", order = 2 )
    public void login_scenario_before(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /*
    @After will be executed automatically after EVERY scenario in the project.
     */
    @After(order = 1)
    public void teardownMethod(Scenario scenario){
        System.out.println("after method");
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

    @After(order = 2)
    public void cleaningMethod(){
        System.out.println("cleaning");
        if(!Driver.getDriver().getTitle().equalsIgnoreCase("Files - Seamlessly")) {
            dashboardPage.filesIcon.click();
        }
        filesPage.selectAll.click();
        BrowserUtils.waitFor(2);
        filesPage.action.click();
        BrowserUtils.waitFor(2);
        filesPage.deleteAll.click();

    }

    //@BeforeStep
    public void setupStep(){
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }

    @BeforeStep(value = "@createFolder", order = 0)
    public void teardownStep(){
        System.out.println("-----> @AfterSTEP : Running after each step!");
        dashboardPage.filesIcon.click();
        //BrowserUtils.sleep(2);
        filesPage.addIcon.click();
        // BrowserUtils.sleep(2);
        filesPage.add_Folder.click();
        // BrowserUtils.sleep(2);
        filesPage.newFolder_Input_box.sendKeys("Books" + Keys.ENTER);
        BrowserUtils.sleep(2);

    }


}

package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




@FindBy(id="appmenu")
    List<WebElement> appMenu;

@FindBy(xpath="(//li[@data-id='dashboard'])[1]")
    WebElement dashboardIcon;


@FindBy(xpath="(//li[@data-id='photos'])[1]")
    WebElement photosIcon;


@FindBy(xpath="(//li[@data-id='activity'])[1]")
    WebElement activityIcon;

@FindBy(xpath="(//li[@data-id='contacts'])[1]")
    WebElement contactsIcon;

@FindBy(xpath="(//li[@data-id='calendar'])[1]")
    WebElement calendarIcon;

    @FindBy(xpath="(//li[@data-id='deck'])[1]")
    WebElement deckIcon;

    @FindBy(xpath="(//li[@data-id='tasks'])[1]")
    WebElement tasksIcon;
}

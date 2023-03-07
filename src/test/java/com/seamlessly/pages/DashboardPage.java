package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public WebElement talkIcon;

    public WebElement circlesIcon;
    @FindBy(xpath = "// a [@aria-label = 'Files']")
    public WebElement filesIcon;


@FindBy(xpath="//ul[@id='appmenu']/li//spa")
   public List<WebElement> appMenu;




@FindBy(xpath = "//li[@data-id]")
public List<WebElement> menuOptions;

@FindBy(xpath="(//li[@data-id='dashboard'])[1]")
public    WebElement dashboardIcon;


@FindBy(xpath="(//li[@data-id='photos'])[1]")
 public   WebElement photosIcon;


@FindBy(xpath="(//li[@data-id='activity'])[1]")
public    WebElement activityIcon;

@FindBy(xpath="(//li[@data-id='contacts'])[1]")
 public   WebElement contactsIcon;

@FindBy(xpath="(//li[@data-id='calendar'])[1]")
 public   WebElement calendarIcon;

    @FindBy(xpath="(//li[@data-id='deck'])[1]")
 public   WebElement deckIcon;

    @FindBy(xpath="(//li[@data-id='tasks'])[1]")
 public   WebElement tasksIcon;

    @FindBy(xpath="(//li[@data-id='notes'])[1]")
    public   WebElement notesIcon;

 public List<WebElement> MenuOptions = new ArrayList<>(Arrays.asList(dashboardIcon,filesIcon,photosIcon,activityIcon,
         contactsIcon,calendarIcon,notesIcon, deckIcon,tasksIcon));
}

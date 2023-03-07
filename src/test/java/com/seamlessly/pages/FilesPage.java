package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.io.File;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "settings-button")
    public WebElement settingsButton;

    @FindBy(xpath = "//label [@for ='showRichWorkspacesToggle']")
    public WebElement richWorkspacesCheckbox;

    @FindBy(xpath = "//label [@for ='recommendationsEnabledToggle']")
    public WebElement recommendationsCheckbox;

    @FindBy(xpath = "//label [@for ='showhiddenfilesToggle']")
    public WebElement hiddenFilesCheckbox;

    @FindBy(xpath = "//label [@for ='cropimagepreviewsToggle']")
    public WebElement cropImageCheckbox;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement filesMenu;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;


}

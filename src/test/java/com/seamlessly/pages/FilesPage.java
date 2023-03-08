package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

@FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
public WebElement files_Icon;
    @FindBy(xpath = "//th[@id='headerSelection']/label")
    public WebElement selectAllFiles_checkBox;
}

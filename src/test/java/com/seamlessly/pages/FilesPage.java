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

    @FindBy(id = "showRichWorkspacesToggle")
    public WebElement richWorkspacesCheckbox;


}

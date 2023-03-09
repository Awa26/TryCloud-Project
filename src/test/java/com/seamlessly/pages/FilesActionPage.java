package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesActionPage {

    public FilesActionPage()  {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement actionIcon;


    @FindBy(xpath = "(//span[.='Delete file'])")
public WebElement deleteIcon;

    @FindBy(xpath = "(//a[@class='nav-icon-trashbin svg'])")
public WebElement deleteFilesButton;

    @FindBy(xpath = "//span[.='Doug Graves']")
public WebElement deletedFileName;
}

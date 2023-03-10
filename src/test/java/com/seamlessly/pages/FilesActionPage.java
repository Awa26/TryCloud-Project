package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesActionPage {

    public FilesActionPage()  {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement actionIcon;


    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deleteFilesButton;

    @FindBy(xpath = "//span[.='Iuliia1']")
    public WebElement deletedFileName;


    @FindBy(xpath = "//span[@class='icon icon-details']")
    public WebElement detailsIcon ;


    @FindBy(xpath = "//a[@id='comments']")
    public WebElement commentsIcon ;

    @FindBy(xpath = "//div[@role='textbox']")

    public WebElement commentBox ;

    @FindBy(xpath = "//input[@disabled='disabled']")

    public WebElement submitCommentButton;

    @FindBy(xpath = "//div[@class='comment__message']")

    public WebElement commentMessage;

}

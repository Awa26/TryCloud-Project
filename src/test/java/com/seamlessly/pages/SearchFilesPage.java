package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFilesPage {
    public SearchFilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div[@class='header-menu unified-search']" )
    public WebElement searchIcon;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//span[@class='unified-search__result-content']")
    public WebElement searchArrow;

    @FindBy(className = "innernametext")
    public WebElement resultText;
}

package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage {


    public PhotosPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="(//li[@data-id='photos'])[1]")
   public WebElement photosIcon;

    @FindBy (xpath = "(//span[@title='Your photos'])")
    public WebElement YourPhotos;

    @FindBy (xpath = "(//span[@title='Your videos'])")
    public WebElement YourVideos;

    @FindBy (xpath = "(//span[@title='Favorites'])")
    public WebElement Favorites;

    @FindBy (xpath = "(//span[@title='On this day'])")
    public WebElement OnThisDay;

    @FindBy (xpath = "(//span[@title='Your folders'])")
    public WebElement YourFolders;

    @FindBy (xpath = "(//span[@title='Shared with you'])")
    public WebElement SharedWithYou;

    @FindBy (xpath = "(//span[@title='Tagged photos'])")
    public WebElement TaggedPhotos;



}

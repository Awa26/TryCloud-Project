package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FavoriteFilesPage {


    public FavoriteFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoriteButtonMenuBar;

    @FindBy(xpath = "//a[@data-action='menu']")
    public List<WebElement> listOfActions;


    @FindBy(xpath = "(//table)[3]//tbody/tr")
    public List<WebElement> tableOfSelectedFavorite;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavorite;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorite;

    @FindBy(xpath = "//h2[.='No favorites yet']")
    public WebElement noFavoritesYet;

    /*@FindBy(xpath = "//span[@class='icon icon-more']")
    public List<WebElement> threeDotsOfFavorite;

    @FindBy(xpath="//span[@class='icon icon-starred']")
    public List<WebElement> listOfFavorite;


    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> firstPageFavoriteTable;

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> selectedFavoriteButton;


    @FindBy(xpath = "//ul[@id=\'appmenu\']/li")
    public List<WebElement> listOfMenuBar;

    @FindBy(xpath = "// a [@aria-label = 'Files']")
    public WebElement files;


    @FindBy(xpath ="(//span[@class='icon icon-starred'])[2]")
    public WebElement addToFavorite;


    */





}

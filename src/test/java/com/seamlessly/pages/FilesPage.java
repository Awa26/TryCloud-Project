package com.seamlessly.pages;

import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.List;

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

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//input[@id='file_upload_start']" )
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[.='marko'])")
    public WebElement uploadedFile;
//----------------------------
    @FindBy(xpath = "//span[.='New folder']")
    public WebElement add_Folder;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement newFolder_Input_box;
    @FindBy(xpath = "//tr[@data-type='dir']")
    List<WebElement> all_folders;

    @FindBy(xpath = "//a[@class='actions-selected']")
    public WebElement actionButton;



    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAll;
    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/a")
    public WebElement action;
    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/div/ul/li[4]/a")
    public WebElement deleteAll;
    @FindBy(xpath = "//span[.='New text file']")
    public WebElement addNewFile;
    @FindBy(xpath = "//input[@value='New text file.md']")
    public WebElement newFileInputBox;
    @FindBy(xpath = "(//button//span[@role='img'])[2]")
    public WebElement close;
    @FindBy(xpath = "//span[.='Iuliia']")
    public WebElement iuliiaFile;
    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement delete;


    //String filename = "marko";

   // @FindBy(xpath = "//tr[@data-type='dir']//input")
    //public List<WebElement> allFoldersCheckBoxes;

    public  WebElement folderSearch(String folderName) {
        for(WebElement each : all_folders){
            //System.out.println("each.getText() = " + each.getText());
            if(each.getText().contains(folderName)){
                return each;
            }
        }
        System.out.println("FOLDER DOESN'T EXIST");
        return null;
    }

}

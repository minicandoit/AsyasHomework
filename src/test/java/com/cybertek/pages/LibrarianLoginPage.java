package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianLoginPage extends BasePage {
    public LibrarianLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(id="inputEmail")
    public WebElement emailInputBox;
    @FindBy(id="inputPassword")
    public WebElement passwordInputBox;
    @FindBy(xpath = "//button")
    public WebElement signInButton;


    public void loginAsLibrarian(){
        emailInputBox.sendKeys(ConfigurationReader.getProperty("librarianEmail"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        signInButton.click();
    }






}

package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage extends BasePage{
    @FindBy(xpath = "//th")
    public List<WebElement> columns;
}

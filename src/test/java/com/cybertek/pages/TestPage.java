package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//will make conflict
}

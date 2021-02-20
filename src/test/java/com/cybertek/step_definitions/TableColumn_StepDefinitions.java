package com.cybertek.step_definitions;

import com.cybertek.pages.LibrarianLoginPage;
import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableColumn_StepDefinitions {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
String url= ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }



LibrarianLoginPage librarianLoginPage=new LibrarianLoginPage();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
librarianLoginPage.loginAsLibrarian();

    }


    @And("I click on {string} link")
    public void iClickOnLink(String link) {
        switch (link.toLowerCase()){
            case"dashboard":
                librarianLoginPage.Dashboard.click();
                break;
            case"users":
                librarianLoginPage.Users.click();
                break;
            case"books":
                librarianLoginPage.Books.click();
                break;
        }
    }
UsersPage usersPage=new UsersPage();
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String>columns) {
       List<String>actualResult=new ArrayList<>();
        for (WebElement eachColumn : usersPage.columns) {
            actualResult.add(eachColumn.getText());
        }
        Assert.assertEquals(columns,actualResult);
    }




}

package com.cydeo.vTrack.pages;

import com.cydeo.vTrack.utilities.ConfigurationReader;
import com.cydeo.vTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public LoginPage (){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(id = "prependedInput")
    public WebElement userBox;

   @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

   @FindBy(id = "_submit")
    public WebElement loginButton;

   @FindBy(xpath = "//div[.='Invalid user name or password.']")
   public WebElement errorMessage;

   @FindBy(xpath = "//div[@class='bar']")
   public WebElement bar;



   public void login(String username){
       userBox.sendKeys(username);
       passwordBox.sendKeys(ConfigurationReader.getProperty("VyTruckPassword"));
       loginButton.click();
   }



}

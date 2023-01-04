package com.cydeo.vTrack.pages;

import com.cydeo.vTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[.='Fleet Management'])[2]")
    public WebElement fleetManagement;

    @FindBy(id = "user-menu")
    public WebElement userName;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

    public void logout(){
        userName.click();
        logoutButton.click();
    }
}

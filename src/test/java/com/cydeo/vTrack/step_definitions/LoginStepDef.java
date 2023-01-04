package com.cydeo.vTrack.step_definitions;

import com.cydeo.vTrack.pages.LoginPage;
import com.cydeo.vTrack.pages.MainPage;
import com.cydeo.vTrack.utilities.BrowserUtils;
import com.cydeo.vTrack.utilities.ConfigurationReader;
import com.cydeo.vTrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("VyTruckUrl"));
    }
    @When("user enter {string}")
    public void user_enter(String username) {
        loginPage.login(username);
    }
    @Then("user should be on home page")
    public void user_should_be_on_home_page() {
        String expectedURL ="https://qa2.vytrack.com/";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.bar));
        wait.until(ExpectedConditions.visibilityOf(mainPage.fleetManagement));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }
    @Then("error message shows")
    public void error_message_shows() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @And("user logOut")
    public void userLogOut() {
        mainPage.logout();
        //BrowserUtils.waitFor(1);
    }
}

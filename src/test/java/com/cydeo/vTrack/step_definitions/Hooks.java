package com.cydeo.vTrack.step_definitions;

import com.cydeo.vTrack.pages.MainPage;
import com.cydeo.vTrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    MainPage mainPage = new MainPage();
    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }


}

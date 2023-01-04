package com.cydeo.vTrack.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"rerun:target/rerun.txt",
                "html:target/cucumber-report.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "@target/rerun.txt",
        glue= "com/cydeo/vTrack/step_definitions"
)
public class FiledRunner {
}

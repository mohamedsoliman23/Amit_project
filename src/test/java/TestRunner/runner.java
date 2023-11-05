package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Features",
                glue = "StepDefs",
                tags = "@smoke",

                plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty.html",
                        "json:target/cucumber-reports/CucumberTestReport.json",
                        "rerun:target/cucumber-reports/rerun.txt"}

        )

public class runner extends AbstractTestNGCucumberTests {
}
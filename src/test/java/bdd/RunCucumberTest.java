package bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/resources/hello2",
        //glue = {"stepdefs"},
//        tags = {"~@Ignore"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "io.cucumber.pro.JsonReporter"
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt"
        })
public class RunCucumberTest {
}

package ma.crafts.bdd.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber",
        strict = true,
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"})
public class RunAllCucumberTests {
}

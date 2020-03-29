package ma.crafts.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber",
        strict = true,
        plugin = {"html:target/cucumber/status-points.html"},
        tags = {"@status-points"})
public class StatusPoints {
}
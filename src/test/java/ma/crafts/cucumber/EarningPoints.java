package ma.crafts.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber",
        strict = true,
        plugin = {"html:target/cucumber/earning-points.html"},
        tags = {"@earning-points"})
public class EarningPoints {
}

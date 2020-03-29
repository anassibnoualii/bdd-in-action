package ma.crafts.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.model.FrequentFlyerStatus;
import org.assertj.core.api.Assertions;

public class EarningStatusSteps {
    int points;

    @Given("Joe is a (.*) Frequent Flyer member$")
    public void joeIsAInitialStatusFrequentFlyerMember(FrequentFlyerStatus flyerStatus) {
    }

    @And("he has (\\d+) status points$")
    public void heHasInitialStatusPointsStatusPoints(int points) {
        this.points = points;
    }

    @When("he earns (\\d+) extra status points$")
    public void heEarnsExtraPointsExtraStatusPoints(int points) {
        this.points = this.points + points;
    }

    @Then("he should have a status of (.*)$")
    public void heShouldHaveAStatusOfFinalStatus(FrequentFlyerStatus flyerStatus) {
        Assertions.assertThat(FrequentFlyerStatus.statusLevelFor(this.points))
                .isEqualTo(flyerStatus);
    }
}

package ma.crafts.bdd.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.model.FrequentFlyer;
import ma.crafts.bdd.model.FrequentFlyerStatus;
import org.assertj.core.api.Assertions;

public class EarningStatusSteps {
    FrequentFlyer frequentFlyer ;

    @Given("Joe is a (.*) Frequent Flyer member$")
    public void joeIsAInitialStatusFrequentFlyerMember(FrequentFlyerStatus flyerStatus) {
        frequentFlyer = new FrequentFlyer.Builder()
                .withStatus(flyerStatus)
                .withFirstName("Joe")
                .withLastName("Joe")
                .build();
    }

    @And("he has (\\d+) status points$")
    public void heHasInitialStatusPointsStatusPoints(int points) {
        frequentFlyer.setStatusPoints(points);
    }

    @When("he earns (\\d+) extra status points$")
    public void heEarnsExtraPointsExtraStatusPoints(int points) {
        frequentFlyer.addExtraPoints(points);
    }

    @Then("he should have a status of (.*)$")
    public void heShouldHaveAStatusOfFinalStatus(FrequentFlyerStatus flyerStatus) {
        Assertions.assertThat(FrequentFlyerStatus.statusLevelFor(frequentFlyer.getStatusPoints()))
                .isEqualTo(flyerStatus);
    }
}

package ma.crafts.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.service.EarningService;
import ma.crafts.bdd.service.EarningServiceImpl;
import org.assertj.core.api.Assertions;

public class EarningPointsSteps {
    private EarningService earningService = new EarningServiceImpl();
    private int distance;

    @Given("the flying distance between Sydney and Melbourne is {int} km")
    public void theFlyingDistanceBetweenSydneyAndMelbourneIsKm(int distance) {
        this.distance = distance;
    }

    @And("I am a standard Frequent Flyer member")
    public void iAmAStandardFrequentFlyerMember() {

    }

    @Then("I should earn {int} points")
    public void iShouldEarnPoints(int points) {
        Assertions.assertThat(earningService.calculate(distance)).isEqualTo(points);

    }

    @When("I fly from Sydney to Melbourne on {string}")
    public void iFlyFromSydneyToMelbourneOn(String date) {
    }
}

package ma.crafts.bdd.cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.cucumber.http.RestClient;
import ma.crafts.bdd.model.Route;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import static ma.crafts.bdd.cucumber.utils.DataTransform.objectToClass;
import static ma.crafts.bdd.cucumber.utils.DataTransform.objectToJson;

public class EarningPointsSteps {

    private Route route;
    @Autowired
    private RestClient restClient;

    @Given("the flying distance between {string} and {string} is {long} km")
    public void theFlyingDistanceBetweenSYDAndMELIsKm(String departure, String destination, long distance) {
        route = new Route.Builder()
                .withDeparture(departure)
                .withDestination(destination)
                .withDistance(distance).build();
    }

    @And("I am a standard Frequent Flyer member")
    public void iAmAStandardFrequentFlyerMember() {

    }

    @Then("I should earn {int} points")
    public void iShouldEarnPoints(int points) {
        long result = objectToClass(restClient.postContent("/flights/calculatePoints", objectToJson(route)).getBody(), Long.class);
        Assertions.assertThat(result).isEqualTo(points);

    }

    @When("I fly from Sydney to Melbourne on {string}")
    public void iFlyFromSydneyToMelbourneOn(String date) {
    }
}

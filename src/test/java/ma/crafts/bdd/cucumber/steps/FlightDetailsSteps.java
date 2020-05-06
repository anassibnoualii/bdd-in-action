package ma.crafts.bdd.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.BddApplicationTests;
import ma.crafts.bdd.cucumber.http.RestClient;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;

import static ma.crafts.bdd.cucumber.utils.DataTransform.objectToJson;

public class FlightDetailsSteps extends BddApplicationTests {
    private String flightNumber;
    private Object response;

    @Autowired
    private RestClient restClient;

    @Given("I need to know the details of flight number {string}")
    public void iNeedToKnowTheDetailsOfFlightNumberFH(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @When("I request the details about this flight")
    public void iRequestTheDetailsAboutThisFlight() {
        response = restClient.getContent("/flights/" + flightNumber).getBody();
    }

    @Then("I should receive the following:$")
    public void iShouldReceiveTheFollowing(String expectedResponse) throws  JSONException {
        JSONAssert.assertEquals(expectedResponse, objectToJson(response),false);
    }
}

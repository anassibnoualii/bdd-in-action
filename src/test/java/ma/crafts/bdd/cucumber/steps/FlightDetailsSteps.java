package ma.crafts.bdd.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.BddApplicationTests;
import ma.crafts.bdd.cucumber.http.RestClient;
import ma.crafts.bdd.model.Flight;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static ma.crafts.bdd.cucumber.utils.DataTransform.objectToClass;

public class FlightDetailsSteps extends BddApplicationTests {
    private String flightNumber;
    private Flight flight;

    @Autowired
    private RestClient restClient;

    @Given("I need to know the details of flight number {string}")
    public void iNeedToKnowTheDetailsOfFlightNumberFH(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @When("I request the details about this flight")
    public void iRequestTheDetailsAboutThisFlight() {
        flight = objectToClass(restClient.getContent("/flights/" + flightNumber).getBody(), Flight.class);
    }

    @Then("I should receive the following:$")
    public void iShouldReceiveTheFollowing(DataTable data) {
        List<Map<String, String>> map = data.asMaps(String.class, String.class);
        Assertions.assertThat(flight.getFlightNumber()).isEqualTo(map.get(0).get("flightNumber"));
        Assertions.assertThat(flight.getDeparture().getCode()).isEqualTo(map.get(0).get("departure"));
        Assertions.assertThat(flight.getDestination().getCode()).isEqualTo(map.get(0).get("destination"));
        Assertions.assertThat(flight.getTime()).isEqualTo(map.get(0).get("time"));
    }
}

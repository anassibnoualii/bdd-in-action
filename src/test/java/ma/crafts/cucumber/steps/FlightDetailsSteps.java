package ma.crafts.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ma.crafts.bdd.model.Flight;
import ma.crafts.bdd.service.FlightService;
import ma.crafts.bdd.service.FlightServiceImpl;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Map;

public class FlightDetailsSteps {
    private String flightNumber;
    private Flight flight;
    private FlightService flightService = new FlightServiceImpl();


    @Given("I need to know the details of flight number {string}")
    public void iNeedToKnowTheDetailsOfFlightNumberFH(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @When("I request the details about this flight")
    public void iRequestTheDetailsAboutThisFlight() {
        flight = flightService.findFlightByFlightNumber(flightNumber);
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

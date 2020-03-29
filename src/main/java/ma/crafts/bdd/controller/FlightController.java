package ma.crafts.bdd.controller;

import ma.crafts.bdd.model.Flight;
import ma.crafts.bdd.service.FlightService;
import ma.crafts.bdd.service.FlightServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/flights")
public class FlightController {

    private FlightService flightService = new FlightServiceImpl();

    @GetMapping("/{flightNumber}")
    ResponseEntity<Flight> findFlightByFlightNumber(@PathVariable("flightNumber") String flightNumber) {
        return new ResponseEntity<>(flightService.findFlightByFlightNumber(flightNumber), HttpStatus.OK);
    }
}

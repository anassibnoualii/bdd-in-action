package ma.crafts.bdd.controller;

import ma.crafts.bdd.model.Flight;
import ma.crafts.bdd.model.Route;
import ma.crafts.bdd.service.EarningService;
import ma.crafts.bdd.service.EarningServiceImpl;
import ma.crafts.bdd.service.FlightService;
import ma.crafts.bdd.service.FlightServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private FlightService flightService = new FlightServiceImpl();
    private EarningService earningService = new EarningServiceImpl();

    @GetMapping("/{flightNumber}")
    ResponseEntity<Flight> findFlightByFlightNumber(@PathVariable("flightNumber") String flightNumber) {
        return new ResponseEntity<>(flightService.findFlightByFlightNumber(flightNumber), HttpStatus.OK);
    }

    @PostMapping("/calculatePoints")
    ResponseEntity<Long> calculateEarnedPoints(@RequestBody Route route) {
        return new ResponseEntity<>(earningService.calculate(route), HttpStatus.OK);
    }
}

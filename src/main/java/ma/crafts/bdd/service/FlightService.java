package ma.crafts.bdd.service;

import ma.crafts.bdd.model.Flight;

public interface FlightService {
    Flight findFlightByFlightNumber(String flightNumber);
}

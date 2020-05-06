package ma.crafts.bdd.service;

import ma.crafts.bdd.dto.FlightDto;

public interface FlightService {
    FlightDto findFlightByFlightNumber(String flightNumber);
}

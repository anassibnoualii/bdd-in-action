package ma.crafts.bdd.service;

import ma.crafts.bdd.dto.FlightDto;
import ma.crafts.bdd.mapper.FlightToFlightDto;
import ma.crafts.bdd.model.Airport;
import ma.crafts.bdd.model.Flight;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FlightServiceImpl implements FlightService {
    @Override
    public FlightDto findFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flight -> Objects.equals(flightNumber,flight.getFlightNumber()))
                .map(FlightToFlightDto.INSTANCE)
                .findFirst()
                .orElse(null);
    }
    List<Flight> flights = Arrays.asList(
            new Flight.Builder()
                    .withFlightNumber("FH-101")
                    .withDeparture(new Airport.Builder().withCode("MEL").withName("MEL").build())
                    .withDestination(new Airport.Builder().withCode("SYD").withName("SYD").build())
                    .withTime("06:00")
                    .build(),
            new Flight.Builder()
                    .withFlightNumber("FH-102")
                    .withDeparture(new Airport.Builder().withCode("SYD").withName("SYD").build())
                    .withDestination(new Airport.Builder().withCode("HKG").withName("HKG").build())
                    .withTime("11:55")
                    .build()
    );
}

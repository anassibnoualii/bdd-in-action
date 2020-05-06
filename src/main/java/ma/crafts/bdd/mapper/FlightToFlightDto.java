package ma.crafts.bdd.mapper;

import ma.crafts.bdd.dto.FlightDto;
import ma.crafts.bdd.model.Flight;

import java.util.function.Function;

public enum FlightToFlightDto implements Function<Flight, FlightDto> {
    INSTANCE;

    @Override
    public  FlightDto apply(Flight flight) {
        return new FlightDto.Builder()
                .withFlightNumber(flight.getFlightNumber())
                .withDeparture(flight.getDeparture().getName())
                .withDestination(flight.getDestination().getName())
                .withTime(flight.getTime())
                .build();
    }
}

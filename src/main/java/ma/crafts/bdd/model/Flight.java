package ma.crafts.bdd.model;

public class Flight {
    private  String flightNumber;
    private  Airport departure;
    private  Airport destination;
    private  String time;

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public static final class Builder {
        private String flightNumber;
        private Airport departure;
        private Airport destination;
        private String time;

        public Builder withFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withDeparture(Airport departure) {
            this.departure = departure;
            return this;
        }

        public Builder withDestination(Airport destination) {
            this.destination = destination;
            return this;
        }

        public Builder withTime(String time) {
            this.time = time;
            return this;
        }

        public Flight build() {
            Flight flight = new Flight();
            flight.destination = this.destination;
            flight.flightNumber = this.flightNumber;
            flight.time = this.time;
            flight.departure = this.departure;
            return flight;
        }
    }
}
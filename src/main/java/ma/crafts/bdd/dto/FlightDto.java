package ma.crafts.bdd.dto;

public class FlightDto {
    private String flightNumber;
    private String departure;
    private String destination;
    private String time;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public static final class Builder {
        private String flightNumber;
        private String departure;
        private String destination;
        private String time;

        public Builder withFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public Builder withDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder withTime(String time) {
            this.time = time;
            return this;
        }

        public FlightDto build() {
            FlightDto flightDto = new FlightDto();
            flightDto.setFlightNumber(flightNumber);
            flightDto.setDeparture(departure);
            flightDto.setDestination(destination);
            flightDto.setTime(time);
            return flightDto;
        }
    }
}

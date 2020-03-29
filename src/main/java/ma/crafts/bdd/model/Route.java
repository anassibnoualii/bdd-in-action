package ma.crafts.bdd.model;

public class Route {
    private String departure;
    private String destination;
    private Long distance;

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

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public static final class Builder {
        private String departure;
        private String destination;
        private Long distance;

        public Builder withDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public Builder withDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder withDistance(Long distance) {
            this.distance = distance;
            return this;
        }

        public Route build() {
            Route route = new Route();
            route.setDeparture(departure);
            route.setDestination(destination);
            route.setDistance(distance);
            return route;
        }
    }
}
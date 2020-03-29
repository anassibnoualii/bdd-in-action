package ma.crafts.bdd.model;

public class FrequentFlyer {

    private String frequentFlyerNumber;
    private String firstName;
    private String lastName;
    private FrequentFlyerStatus status;
    private int statusPoints;

    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public void setFrequentFlyerNumber(String frequentFlyerNumber) {
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FrequentFlyerStatus getStatus() {
        return status;
    }

    public void setStatus(FrequentFlyerStatus status) {
        this.status = status;
    }

    public int getStatusPoints() {
        return statusPoints;
    }

    public void setStatusPoints(int statusPoints) {
        this.statusPoints = statusPoints;
    }

    public void addExtraPoints(int points) {
        this.statusPoints = this.statusPoints + points;
    }

    public static final class Builder {
        private String frequentFlyerNumber;
        private String firstName;
        private String lastName;
        private FrequentFlyerStatus status;
        private int statusPoints;


        public Builder withFrequentFlyerNumber(String frequentFlyerNumber) {
            this.frequentFlyerNumber = frequentFlyerNumber;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withStatus(FrequentFlyerStatus status) {
            this.status = status;
            return this;
        }

        public Builder withStatusPoints(int statusPoints) {
            this.statusPoints = statusPoints;
            return this;
        }

        public FrequentFlyer build() {
            FrequentFlyer frequentFlyer = new FrequentFlyer();
            frequentFlyer.setFrequentFlyerNumber(frequentFlyerNumber);
            frequentFlyer.setFirstName(firstName);
            frequentFlyer.setLastName(lastName);
            frequentFlyer.setStatus(status);
            frequentFlyer.setStatusPoints(statusPoints);
            return frequentFlyer;
        }
    }
}

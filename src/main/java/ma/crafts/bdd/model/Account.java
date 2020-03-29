package ma.crafts.bdd.model;

public class Account {
    private  String owner;
    private  int points;
    private  int statusPoints;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getStatusPoints() {
        return statusPoints;
    }

    public void setStatusPoints(int statusPoints) {
        this.statusPoints = statusPoints;
    }


    public static final class Builder {
        private  String owner;
        private  int points;
        private  int statusPoints;

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder withPoints(int points) {
            this.points = points;
            return this;
        }

        public Builder withStatusPoints(int statusPoints) {
            this.statusPoints = statusPoints;
            return this;
        }

        public Account build() {
            Account account = new Account();
            account.setOwner(owner);
            account.setPoints(points);
            account.setStatusPoints(statusPoints);
            return account;
        }
    }
}
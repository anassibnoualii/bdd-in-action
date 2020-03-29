package ma.crafts.bdd.model;

public class Airport {
    private  String code;
    private  String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static final class Builder {
        private  String code;
        private  String name;

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Airport build() {
            Airport airport = new Airport();
            airport.setCode(code);
            airport.setName(name);
            return airport;
        }
    }
}

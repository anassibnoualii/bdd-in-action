package ma.crafts.bdd.service;

import ma.crafts.bdd.model.Route;

public class EarningServiceImpl implements EarningService {

    private static final int COEFFICIENT = 2;

    @Override
    public long calculate(Route route) {
        return route.getDistance() / COEFFICIENT;
    }
}

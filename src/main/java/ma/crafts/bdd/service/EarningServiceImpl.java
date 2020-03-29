package ma.crafts.bdd.service;

public class EarningServiceImpl implements EarningService {
    @Override
    public int calculate(int distance) {
        return distance / 2;
    }
}

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 4) return speed * 221;
        if (speed <= 8) return (0.90 * (speed * 221));
        if (speed == 9) return (0.80 * (speed * 221));
        return (0.77 * (speed * 221));
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}

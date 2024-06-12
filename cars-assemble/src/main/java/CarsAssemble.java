public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsProduced = speed * 221;
        double carsSuccessfullyProduced = 0;

        if (speed >= 1 & speed <= 4) {
            carsSuccessfullyProduced = carsProduced;
        } else if (speed >= 5 & speed <= 8) {
            carsSuccessfullyProduced = 0.9 * carsProduced;
        } else if (speed == 9) {
            carsSuccessfullyProduced = 0.8 * carsProduced;
        } else if (speed == 10) {
            carsSuccessfullyProduced = 0.77 * carsProduced;
        }
        return carsSuccessfullyProduced;
    }

    public int workingItemsPerMinute(int speed) {
        double carsSuccessfullyProduced = productionRatePerHour(speed);
        return (int) (carsSuccessfullyProduced / 60);
    }
}

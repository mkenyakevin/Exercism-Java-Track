public class ElonsToyCar {
    public int distance = 0;
    public int distanceDriven = 20;
    public int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery != 0) {
            distance += distanceDriven;
            battery = battery - 1;
        }

    }
}

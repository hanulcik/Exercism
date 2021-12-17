public class ElonsToyCar {
    private int distanceDriven = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        int battery = (100 - (distanceDriven / 20));
        if (battery == 0) return "Battery empty";
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (distanceDriven < 2000) distanceDriven += 20;
    }
}

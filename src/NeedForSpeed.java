class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    public int speed;
    public int batteryDrain;
    public int distanceDriven;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return (battery <= 0) ? true : false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) this.distanceDriven += speed;
        this.battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while (!car.batteryDrained()) car.drive();
        return (car.distanceDriven >= distance) ? true : false;
    }
}

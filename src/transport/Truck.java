package transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Truck of brand" + getBrand() + "started to move");
    }

    public void stopMoving(){
        System.out.println("Truck of brand" + getBrand() + "stopped to move");
    }

    @Override

    public void pitStop() {
        System.out.println("Pit stop by truck");
    }

    @Override
    public void bestRoundTime() {
        int minBound =90;
        int maxBound = 140;
        int bestTimeInMins = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("The best time by truck" + bestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound =90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Max speed by truck" + maxSpeed);

    }
}

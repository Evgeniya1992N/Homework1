package transport;

public class Bus extends Transport<DriverD>{

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Bus of brand" + getBrand() + "started to move");
    }

    public void stopMoving(){
        System.out.println("Bus of brand" + getBrand() + "stopped to move");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit stop by bus");
    }

    @Override
    public void bestRoundTime() {
        int minBound =80;
        int maxBound = 120;
        int bestTimeInMins = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("The best time by bus" + bestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound =80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Max speed by bus" + maxSpeed);

    }
}
//
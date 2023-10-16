package transport;

public class Auto extends Transport<DriverB>{


////////////////////////////////////////////////////////////////////////
    public Auto(String brand,
                String model,
                double engineVolume,
                DriverB driver) {
        super(brand, model, engineVolume, driver);

    }

    @Override
    public void startMoving(){
        System.out.println("Auto of brand" + getBrand() + "started to move");
        }

    public void stopMoving(){
        System.out.println("Auto of brand" + getBrand() + "stopped to move");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit stop by auto");
    }

    @Override
    public void bestRoundTime() {
        int minBound =120;
        int maxBound = 160;
        int bestTimeInMins = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("The best time by auto" + bestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound =120;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Max speed by auto" + maxSpeed);

    }
}




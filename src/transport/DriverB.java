package transport;

public class DriverB extends Driver{
    public DriverB(String name,
                   boolean hasLicence,
                   int experienceYears) {
        super(name, hasLicence, experienceYears);
    }

    @Override
    public void startMoving() {
        System.out.println("Driver of category B" + getName() + "startedMoving");

    }

    @Override
    public void stopMoving() {
        System.out.println("Driver of category B" + getName() + "stoppedMoving");
    }

    @Override
    public void refill() {
        System.out.println("Driver of category B" + getName() + "fills the car");

    }
}

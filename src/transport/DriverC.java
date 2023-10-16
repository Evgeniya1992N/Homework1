package transport;

public class DriverC extends Driver{
    public DriverC(String name,
                   boolean hasLicence,
                   int experienceYears) {
        super(name, hasLicence, experienceYears);
    }

    @Override
    public void startMoving() {System.out.println("Driver of category C" + getName() + "startedMoving");

    }

    @Override
    public void stopMoving() {System.out.println("Driver of category C" + getName() + "stoppedMoving");

    }

    @Override
    public void refill() { System.out.println("Driver of category C" + getName() + "fills the truck");

    }
}

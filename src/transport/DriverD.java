package transport;

public class DriverD extends Driver{
    public DriverD(String name,
                   boolean hasLicence,
                   int experienceYears) {
        super(name, hasLicence, experienceYears);
    }

    @Override
    public void startMoving() {System.out.println("Driver of category D " + getName() + "startedMoving");

    }

    @Override
    public void stopMoving() {System.out.println("Driver of category D" + getName() + "stoppedMoving");

    }

    @Override
    public void refill() {System.out.println("Driver of category  D" + getName() + "fills the bus");

    }
}

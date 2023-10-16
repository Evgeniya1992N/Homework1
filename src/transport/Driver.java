package transport;

public abstract class Driver {
    private String name;
    private boolean hasLicence;
    private int experienceYears;


    public String getName() {
        return name;
    }

    public boolean isHasLicence() {
        return hasLicence;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public Driver(String name, boolean hasLicence, int experienceYears) {
        this.name = name;
        this.hasLicence = hasLicence;
        this.experienceYears = experienceYears;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refill();

}

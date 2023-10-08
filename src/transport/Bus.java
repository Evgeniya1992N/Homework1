package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }
    @Override
    public String toString() {
        return "Bus: " + super.getBrand() +
                " model - " + super.getModel() +
                ",color - " + super.getColor() +
                ", country - " + super.getCountry() +
                ", speed - " + super.getMaxSpeed();


    }
}
//
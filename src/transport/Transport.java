package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     String color,
                     int year,
                     String country,
                     int maxSpeed) {

        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()){
            model = "default";
        }
        this.model = model;
        if (country == null || country.isEmpty()){
            country = "default";
        }
        this.country = country;
        setColor(color);
        if(year <= 0){
            year = 2000;
        }
        this.year =year;
        if(maxSpeed == 0){
            maxSpeed = 200;
        }
        setMaxSpeed(maxSpeed);
    }

    private void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0){
            maxSpeed = 200;
        }
        this.maxSpeed = maxSpeed;
    }

    private void setColor(String color) {
        if (color == null){
            color = "white";
        }
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

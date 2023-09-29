public class Auto {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
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

    public void setBrand(String brand) {
        if (brand == null){
            System.out.println("default");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null){
            System.out.println("default");
        }
        this.model = model;
    }

    public void setEngineVolume(int engineVolume) {
        if (engineVolume <= 0){
         this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null){
            this.color = "white";
        }
        this.color = color;
    }

    public void setYear(int year) {
        if (year <= 0){
            this.year = 2000;
        }
        this.year = year;
    }

    public void setCountry(String country) {
        if (country == null){
            System.out.println("default");
        }
        this.country = country;
    }

//переопределение toString:
    @Override
    public String toString() {
        return "Car: " + this.brand + " model - " + this.model + ", engine - " + this.engineVolume + ",color - " + this.color + ", color - " + this.color + ", country - " + this.country;

    }


}

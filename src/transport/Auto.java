package transport;
public class Auto {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String bodyType;
    private int registrationNumber;
    private final int capacityOfPassengers;
    private boolean tireType; //0 - summer, 1 - winter

    public Auto(String brand, String model, double engineVolume, String color, int year, String country, String gearBox, String bodyType, int registrationNumber, int capacityOfPassengers, boolean tireType) {

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.gearBox = gearBox;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.capacityOfPassengers = capacityOfPassengers;
        this.tireType = tireType;

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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public boolean getTireType() {
        return tireType;
    }

    public void setEngineVolume(int engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "white";
        }
        this.color = color;
    }


    public void setGearBox(String gearBox) {
        if (gearBox == null) {
            this.gearBox = "not stated";
        }
        this.gearBox = gearBox;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber == 0) {
            this.registrationNumber = 111;
        }
        this.registrationNumber = 111;
    }

    public void setTireType(boolean tireType) {
        this.tireType = tireType;
    }

    //переопределение toString:
    @Override
    public String toString() {
        return "Car: " + this.brand + " model - " + this.model + ", engine - " + this.engineVolume + ",color - " + this.color + ", color - " + this.color + ", country - " + this.country;

    }

    public String changeTires(int month) {
        String result;
        if (month < 1 || month > 12) {
            result = "Error. Month does not exist";
        } else if ((month > 3 && month < 10 && !this.tireType)) {
            result = "все ок";
        } else if ((month < 4 || month > 9 && this.tireType)) {
            result = "все ок";
        } else {
            result = "сменить шины на сезонные";
        }
        return result;
    }

    ;


    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        ;

        public boolean getRemoteEngineStart(int year) {
            year = getYear();
            if (year <= 2000 || year > 2030) {
                System.out.println("incorrect year");
            }
            return remoteEngineStart;
        }

            public boolean getKeylessAccess(int year) {
                year = getYear();
                if (year <= 2000 || year > 2030) {
                    System.out.println("incorrect year");
                }
                return keylessAccess;
            }
        }
    }

//new branch

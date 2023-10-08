package transport;

public class Auto extends Transport{
    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int capacityOfPassengers;
    private boolean summerTyres; //0 - summer, 1 - winter
    private Key key;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return keylessAccess;
        }

    @Override
    public String toString() {
        return (remoteEngineStart ? "удаленный запуск двигателя": "без удаленного запуска двигателя") + ", " +
                (keylessAccess?"бесключевой доступ":"бесключевой доступ отсутствует");
    }

}
    public Auto(String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String country,
                String gearBox,
                String bodyType,
                String registrationNumber,
                int capacityOfPassengers,
                boolean tireType,
                Key key,
                int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);

        setGearBox(gearBox);
        if (bodyType == null || bodyType.isEmpty()){
            bodyType = "sedan";
        }
        this.bodyType = bodyType;
        setRegistrationNumber(registrationNumber);
        if (capacityOfPassengers <= 0){
            capacityOfPassengers = 5;
        }
        this.capacityOfPassengers = capacityOfPassengers;
        this.summerTyres = summerTyres;
        setKey(key);

    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getGearBox(){
        return gearBox;
    }
    public void setGearBox(String gearBox) {
        if (gearBox == null || gearBox.isEmpty()) {
            this.gearBox = "not stated";
        }
        this.gearBox = gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "x000xx000";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey(){
        return key;
    }

    public void setKey(Key key){
        if (key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTires(int month) {
        if ((month >= 11 && month<=12)||(month>=1 && month <= 3)){
            summerTyres = false;
        }
        if (month >= 4 && month <= 10){
            summerTyres = true;
        }
    }

    //переопределение toString:
    @Override
    public String toString() {
        return "Car: " + super.getBrand() +
                " model - " + super.getModel() +
                ", engine - " + this.engineVolume +
                ",color - " + super.getColor() +
                ", country - " + super.getCountry() +
                ", gear - " + this.gearBox +
                ",body - " + this.bodyType +
                ", regNum - " + this.registrationNumber +
                ", capacity - " + this.capacityOfPassengers +
                (summerTyres ? "summer" : "winter") + "tire" + ", "+
                key +
                ", speed - " + super.getMaxSpeed();


    }
    }



import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

   for(int i = 1; i<=4; i++){
       DriverB driverB = new DriverB("Driver cat.B N" + i, true, 5+i);
       Auto auto = new Auto(
               "Auto brand N" + i,
               "Auto model N" + i,
               1.6,
               driverB);
       DriverD driverD = new DriverD("Driver cat.D N" + i, true, 7+i);
       Bus bus = new Bus(
               "Bus brand N" + i,
               "Bus model N" + i,
               i+0.5,
               driverD);
       DriverC driverC = new DriverC("Driver cat.C N" + i, true, 10+i);
       Truck truck = new Truck(
               "Truck brand N" + i,
               "Truck model N" + i,
               i+1,
               driverC);


       printInfo(auto);
       printInfo(bus);
       printInfo(truck);



   }
    }
    private static void printInfo(Transport<?> transport){
        System.out.println("водитель" + transport.getDriver().getName() +" А управляет автомобилем "+transport.getBrand()+ " и будет участвовать в заезде");
    }
}

//
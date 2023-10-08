import transport.Auto;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Auto lada = new Auto( "Lada","Granta", 1.7,"yellow" , 2015, "Russia", "5", "limo", 123455, 4, true);
        // Auto audi = new Auto( "Audi","A8", 3.0,"black" , 2020, "Germany");
       //  Auto bmw = new Auto( "BMW","Z8", 3.0,"black" , 2021, "Germany");
      //   Auto kia = new Auto( "Kia","Sportage", 2.4,"red" , 2018, "South Korea");
     //    Auto hyundai = new Auto( "Hyundai","Avante", 1.6,"orange" , 2016, "South Korea");

       // System.out.println(lada);
        Auto lada = new Auto("Lada",
                             "Granta",
                1.7,
                "yellow" ,
                2015,
                "Russia",
                "5",
                "limo",
                "123455",
                4,
                false,
                new Auto.Key(true, true),
                250);

        Auto kia = new Auto("KIA",
                "Sportage",
                2.4,
                null ,
                2009,
                "Korrea",
                "5",
                "kupe",
                "dw7jo",
                2,
                true,
                new Auto.Key(false, false),
                300);

        Bus miniVan = new Bus("Mercedec", "mini", "black", 2015, "USA", 240);
        Bus familyBus = new Bus("WV", "classic", "blue", 2021, "Swede", 260);
        Bus doubleDeck = new Bus("Volvo", "original", "red", 2023, "UK", 270);

        System.out.println(lada);
        lada.changeTires(4);
        System.out.println(lada);
        System.out.println(kia);

        System.out.println(miniVan);
        System.out.println(familyBus);
        System.out.println(doubleDeck);



    }


}

//
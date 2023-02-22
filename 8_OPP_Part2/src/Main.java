public class Main {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    COMPOSITION     //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      /*  ComputerCase theCase = new ComputerCase("2208","Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadPrograms("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    COMPOSITION CHALLENGE    //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      /*  SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    ENCAPSULATION    //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*/// No encapsulation principles
        Player player = new Player();
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

        System.out.println("-------------------");

        /// Encapsulation principles
        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial health is " + tim.healthRemaining());*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    ENCAPSULATION CHALLENGE   //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Printer printer = new Printer(80,4,true);
        printer.printPages(4);

        System.out.println(printer.getTonerLevel() + " " + printer.getPagesPrinted());*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    POLYMORPHISM    //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Movie theMovie = Movie.getMovie("Adventure","Star wars");
//        theMovie.watchMovie();

        /*Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter type (A for Adventure, C for Comedy, S for SciFi, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    CASTING WITH CLASSES, USING OBJECT AND VAR REFERENCES    //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    POLYMORPHISM CHALLENGE   //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("-".repeat(20));

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runRace(ferrari);
        System.out.println("-".repeat(20));

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",568,75);
        runRace(tesla);
        System.out.println("-".repeat(20));

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,8);
        runRace(ferrariHybrid);*/


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    OOP MASTER CHALLENGE   //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();

//        Burger burger = new Burger("REGULAR",4.0);
//        burger.addToppings("bacon","cheese","");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("bacon","cheese","mayo");
//        regularMeal.setDrinkSize("large");
//        regularMeal.printItemizedItem();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedItem();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chilli");
        deluxeMeal.addBurgerToppings("Avocado","Bacon","Lettuce","Cheese","Mayo");
        deluxeMeal.setDrinkSize("large");
        deluxeMeal.printItemizedItem();
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}

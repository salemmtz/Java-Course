public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setDoors(2);
//        car.setConvertible(true);
//        car.setColor("black");
//
//        System.out.println(car.getMake());
//
//        car.describeCar();


        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //// CONSTRUCTORS /////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////

       /* Account user = new Account();
//        Account user = new Account("12345", 1200.00, "Salem", "salem@gmail.com", "123456789");
        System.out.println(user.getAccountNumber());
        System.out.println(user.getAccountBalance());
        System.out.println(user.getCustomerName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());
//        user.setAccountNumber("12345");
//        user.setAccountBalance(1200);
//        user.setCustomerName("Salem");
//        user.setEmail("salem@gmail.com");
//        user.setPhoneNumber("123456789");

        user.depositFunds(1800);
        user.withdrawFunds(3000);

        System.out.println(user.getCustomerName());

        Account timsAccount = new Account("Tim","tim@gmail.com","12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name: " + timsAccount.getCustomerName());*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////  CONSTRUCTOR CHALLENGE  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Customer customer1 = new Customer("Salem",1000, "salem@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        Customer customer3 = new Customer("Salem","salem@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////  THE POJO  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        for (int i = 1; i<=5; i++){
//            Student s = new Student("S92300" + i, switch(i){
//                case 1 -> "Mary";
//                case 2 -> "Carol";
//                case 3 -> "Tim";
//                case 4 -> "Harry";
//                case 5 -> "Lisa";
//                default -> "Anonymous";
//            }, "05/11/1985", "Java Masterclass");
//            System.out.println(s);
//        }

        // THE RECORD
       /* for (int i = 1; i<=5; i++){
            LPAStudent s = new LPAStudent("S92300" + i, switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////  INHERITANCE  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"  ");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("Goldfish", 0.25,2,3);
        doAnimalStuff(goldie, "fast");*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////  THE TEXT BLOCK AND OTHER OPTIONS FORMATTING  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Builleted Lis:
                            \u2022 First Point
                                \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n",age);

        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n",(float)age);

        for(int i=1; i <= 100000; i*= 10){
            System.out.printf("Printing %6d %n",i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////  ANOTHER LOOK TO THE STRINGS  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l',3));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("Strings starts with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("Strings ends with World");
        }
        if(helloWorld.contains("World")){
            System.out.println("Strings contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }*/




        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////  THE STRINGBUILDER CLASS  ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");


    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
        System.out.println("-".repeat(16));
    }
}

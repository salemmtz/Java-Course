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



        /////////////////////////////////////////////////////////////////////////////////
        //// CONSTRUCTORS ///////////
        ////////////////////////////////////////////////////////////////////////////////

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



        ////////////////////////////////////////////////////////////////////////////////////////
        ////////////  CONSTRUCTOR CHALLENGE  ///////////
        ///////////////////////////////////////////////////////////////////////////////////////

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



        ////////////////////////////////////////////////////////////////////////////////////////
        ////////////  THE POJO  ///////////
        ///////////////////////////////////////////////////////////////////////////////////////

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



        ////////////////////////////////////////////////////////////////////////////////////////
        ////////////  INHERITANCE  ///////////
        ///////////////////////////////////////////////////////////////////////////////////////

        Animal animal = new Animal("Generic Animal", "Huge", 400);
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
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal,String speed){
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");


    }
}

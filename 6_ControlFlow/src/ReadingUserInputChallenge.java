import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        boolean isValidNumber = false;
//        int sum = 0;
//        int num = 0;
//            for (int i = 1; i <= 5; i++) {
//                System.out.println("Enter number #" + i);
//                do {
//                    try{
//                        num = checkNumber(scanner.nextLine());
//                        isValidNumber = num < 0 ? false : true;
//                    }catch(NumberFormatException badUserInput){
//                        System.out.println("Characters not allowed! Try again.");
//                    }
//                } while (!isValidNumber);
//                sum += num;
//            }

        double sum = 0;
        double num = 0;
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            try {
                num = Double.parseDouble(scanner.nextLine());
                counter++;
                sum +=num;
            } catch (NumberFormatException badUserInout) {
                System.out.println("Invalid number");
            }
        }


        System.out.println(sum);
    }

    public static int checkNumber(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) return -1;

        return num;
    }
}

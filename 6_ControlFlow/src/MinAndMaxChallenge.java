import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, enter any character to quit: ");
            try {
                int num = Integer.parseInt(scanner.nextLine());

                if (loopCount == 0 || num > maxValue) maxValue = num;
                if (loopCount == 0 || num < minValue) minValue = num;
                loopCount++;
            } catch (NumberFormatException invalidInput) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min value is: " + minValue);
            System.out.println("Max value is: " + maxValue);
        } else {
            System.out.println("No valid data entered");
        }
    }
}

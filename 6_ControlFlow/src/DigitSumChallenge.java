public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digist 123491 is: " + sumDigits( 123491));
    }

    public static int sumDigits(int num) {
        if (num < 0) return -1;

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}

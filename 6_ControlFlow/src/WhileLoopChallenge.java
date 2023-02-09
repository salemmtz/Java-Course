public class WhileLoopChallenge {
    public static void main(String[] args) {

        int i=4;
        int evenCount = 0;
        int oddCount = 0;

        while (i<=20) {
            i++;

            if(!isEvenNumber(i)){
                oddCount++;
                continue;
            }

            evenCount++;
            System.out.println(i);
            if(evenCount==5) break;
        }

        System.out.println("The count of even numbers is: " + evenCount);
        System.out.println("The count of odd numbers is: " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;
        return false;
    }
}

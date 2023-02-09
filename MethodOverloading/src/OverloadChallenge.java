public class OverloadChallenge {
    public static void main(String[] args) {
//        System.out.println(convertToCentimeters(1));
//        System.out.println(convertToCentimeters(5,8));

        System.out.println(getDurationString(10000));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(3602,59));
        System.out.println(getDurationString(65,45));
    }

    public static double convertToCentimeters(int heightInch) {
        return heightInch / 0.39370d;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch) {
        int inches = (heightFeet * 12) + heightInch;
        return convertToCentimeters(inches);
    }

    public static String getDurationString(int seconds) {
        if(seconds<0) return "Seconds should be greater or equal than zero";

        int remainingSec = seconds % 60;
        int min = seconds / 60;

        return getDurationString(min,remainingSec);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes<0 || seconds<0 || seconds>59) return "Minutes should be greater or equal than zero. Seconds should be between zero and fifty-nine";

        int remainingMin = minutes % 60;
        int hrs = minutes / 60;

        return hrs + "h " + remainingMin + "m " + seconds + "s";
    }
}

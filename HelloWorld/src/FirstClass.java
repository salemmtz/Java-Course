public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");

        double a=20.00, b= 80.00;
        double c = (a+b)*100.00;
        double d = c%40.00;
        boolean e = d==0 ? true : false;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        if(!e) System.out.println("Got some remainder");
    }
}

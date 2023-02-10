import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        float a = scan.nextFloat();
        System.out.print("Enter 2nd number : ");
        float b = scan.nextFloat();
        double sum = (a - b) * (a + b);
        System.out.println("A =?" + a);
        System.out.println("B =?" + b);
        System.out.println("(" + a + " - " + b + ")" + "(" + a + " + " + b + ")" + " = " + sum);
    }
}
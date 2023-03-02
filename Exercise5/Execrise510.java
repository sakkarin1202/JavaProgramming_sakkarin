import java.util.Scanner;

public class Execrise510 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width1 = scan.nextDouble();
        double long1 = scan.nextDouble();
        double width2 = scan.nextDouble();
        double long2 = scan.nextDouble();

        double sum1 = width1 * long1;
        double sum2 = width2 * long2;
        if (sum1 > sum2) {
            System.out.println("square area 1 > square area 2");
            System.out.println("square area 1 : " + sum1);
            System.out.println("square area 2 : " + sum2);
        } else {
            System.out.println("square area 2 > square area 1");
            System.out.println("square area 1 : " + sum1);
            System.out.println("square area 2 : " + sum2);
        }
    }
}
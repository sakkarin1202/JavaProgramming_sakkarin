import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("THB: ");
        double thb = input.nextDouble();
        double rate = 35.50;
        double usd = thb / rate;

        System.out.printf("usd : %.2f ", usd);
    }
}
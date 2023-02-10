import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("name :");
        double vat = 0.05;
        String name = scan.next();
        System.out.print("Price :");
        double price = scan.nextDouble();
        System.out.print("amount :");
        int amount = scan.nextInt();
        double total = price * amount;
        final double sum = total * vat;

        System.out.println(sum);
    }
}
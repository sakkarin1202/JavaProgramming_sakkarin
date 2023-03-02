import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Items;
        double itemPrice, total = 0.0, amountPaid, change;

        System.out.print("Enter the number of items: ");
        Items = scan.nextInt();
        for (int i = 1; i <= Items; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            itemPrice = scan.nextDouble();
            total += itemPrice;
        }
        System.out.print("Enter the amount paid: ");
        amountPaid = scan.nextDouble();

        change = amountPaid - total;

        System.out.println("Total price: " + total);
        System.out.println("Change: " + change);
    }
}
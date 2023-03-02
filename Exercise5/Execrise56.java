import java.util.Scanner;

public class Execrise56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usage;
        String customerType;

        System.out.print("Enter water usage (in liters): ");
        usage = input.nextInt();
        System.out.print("Enter customer type (Domestic or Commercial): ");
        customerType = input.next();

        double baseCharge = 100.0;
        double waterCharge;

        if (customerType.equalsIgnoreCase("Domestic")) {
            waterCharge = 0.5 * usage;
        } else if (customerType.equalsIgnoreCase("Commercial")) {
            waterCharge = 0.9 * usage;
        } else {
            System.out.println("Invalid customer type");
            return;
        }

        double totalCharge = baseCharge + waterCharge;
        System.out.printf("Total charge: %.2f baht", totalCharge);
    }
}
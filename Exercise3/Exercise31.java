import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your number");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("Zero");
        } else if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd Number");
        }
    }
}
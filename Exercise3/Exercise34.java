import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your number :");
        int x = scan.nextInt();
        System.out.print("Enter Your number :");
        int y = scan.nextInt();
        System.out.print("Enter Your number :");
        int z = scan.nextInt();

        int max = x;
        if (x > max) {
            max = x;
        }
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println(x + " " + y + " " + z);
        System.out.println(max);

    }
}
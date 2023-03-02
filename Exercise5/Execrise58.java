import java.util.Scanner;

public class Execrise58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        while (x > 99 && x <= 999) {
            if (x % 5 == 0 || x % 11 == 0 && x % 55 != 0) {

                System.out.println(x);
            }

            x++;
        }
    }
}
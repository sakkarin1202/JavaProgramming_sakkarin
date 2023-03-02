import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, even = 0, odd = 0;

        System.out.println("Enter number");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even Number" + even);
        System.out.println("Number of ood Number" + odd);
    }
}
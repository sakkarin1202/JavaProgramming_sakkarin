import java.util.Scanner;

public class Execrise45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int l = scan.nextInt();
        System.out.println("ความกว้าง = " + w);
        System.out.println("ความยาว = " + l);
        int area = w * l;
        System.out.print(area);
    }
}
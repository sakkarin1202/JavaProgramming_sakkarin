import java.util.Scanner;

public class Execrise59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthday_year = scan.nextInt();
        while (birthday_year <= 2566) {
            System.out.println("ท่านระบุข้อมูลผิด");
            break;
        }
        birthday_year++;

        int sum = 2566 - birthday_year;
        System.out.println("Name : " + name);
        System.out.println("Age : " + sum);
    }
}

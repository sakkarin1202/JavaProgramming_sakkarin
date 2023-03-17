import java.util.Scanner;

public class Execrise59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        String name = scan.nextLine();
        System.out.println("What year you ware born");
        int birthday_year = scan.nextInt();
        while (birthday_year >= 2566) {
            System.out.println("ท่านระบุข้อมูลผิด");
            break;
        }
        birthday_year++;

        int sum = 2566 - birthday_year;
        System.out.println("I'm : " + name);
        System.out.println("I'm : " + sum + "years old");
    }
}

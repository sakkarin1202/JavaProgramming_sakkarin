import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: 1.rectangle 2.triangle 3.round ");
        int geometric = input.nextInt();
        for (; geometric != 1 && geometric != 2 && geometric != 3;) {
            System.out.println("Enter number: 1.rectangle 2.triangle 3.round ");
            geometric = input.nextInt();
        }
        if (geometric == 1) {
            System.out.println("Enter wide");
            Double w = input.nextDouble();
            System.out.println("Enter long");
            Double l = input.nextDouble();
            Double result = w * l;
            System.out.println("square area " + result + " square centimeters");
        } else if (geometric == 2) {
            System.out.println("Enter base");
            Double b = input.nextDouble();
            System.out.println("Enter hight");
            Double h = input.nextDouble();
            Double result = 1 / 2 * b * h;
            System.out.println("triangle area " + result + " square centimeters");
        }

        else {
            System.out.println("Enter radius");
            Double r = input.nextDouble();
            Double result = 3.14 * (r * r);
            System.out.println("round area " + result + " square centimeters");
        }
    }
}
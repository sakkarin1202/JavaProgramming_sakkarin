import java.util.Scanner;

public class Exercise6 {
    // Method
    /**
     * Check number type and print out
     * 
     * @param num
     */
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    public void printType2(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else {
            System.out.println(num + "is odd");
        }
    }

    public void checkVowel(char w) {
        if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u' || w == 'A' || w == 'E' || w == 'I' || w == 'O'
                || w == 'U') {
            System.out.println("This character is a vowel");
        } else {
            System.out.println(" This character is not a vowel");
        }
    }

    public void checkChar(char w) {
        if (w >= 65 && w <= 90) {
            System.out.println("This charactor is Uppercase");
        } else if (w >= 97 && w <= 122) {
            System.out.println("This charactor is Lowercase");
        } else {
            System.out.println("This is not a letter");
        }
    }

    public void isPositive(int num, Scanner input) {
        // Scanner input = new Scanner();
        while (num <= 0) {
            System.out.println("กรุณากรอกจำนวนเต็มบวก");
            num = input.nextInt();
        }
        System.out.println("เป็นจำนวนเต็มบวก");

    }

    public void isOdd(int num, Scanner){
        do{
            System.out.println("กรุณากรอกจำนวนเลขคีย์บอร์ด");
             userInput = input.nextInt();
             if(userInput)
        }
    }

    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num = input.nextInt();
        // ex.printType1(num);
        // ex.printType2(num);
        // ex.isPositive(num, input);
    }

    // public static void main(String[] args) {
    // Exercise6 ex = new Exercise6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please enter a charactor");
    // String text = input.next();
    // char w = text.charAt(0);
    // // ex.checkVowel(w);
    // ex.checkChar(w);
    // }
}

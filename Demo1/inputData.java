import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Your surname");
        String surname = input.nextLine();
        System.out.print("nickname");
        String nickname = input.nextLine();
        System.out.print("Student ID");
        String StudentID = input.nextLine();
        System.out.print("Your major");
        String Yourmajor = input.nextLine();
        

        input.close();
        System.out.println("-----------------");
        System.out.println("Your Name is " + name + "" + surname);
        System.out.println("Your nickname is " + nickname );
        System.out.println("StudentID is " + StudentID);
        System.out.println("Your major is " + Yourmajor);
        
    }
}

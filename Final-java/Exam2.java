import java.util.Scanner;

public class Exam2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 || choice > 3){
            System.out.println("ต้องการคำนวนหาพื้นที่ของรูปทรงเรขาคณิตรูปทรงใด (1:สีเหลี่ยมผืนผ้า, 2:สามเหลี่ยม, 3:วงกลม) : ");
            choice = input.nextInt();
            if(choice <1 || choice >3);
            System.out.println("กรุณาระบุเลข 1,2 หรือ 3 เท่านั้น");
        }
        double area = 0.0;
        switch (choice) {
        case 1:
        System.out.println("กรุณาระบุความกว้างของสี่เหลี่ยมผืนผ้า");
        double width = input.nextDouble();
        System.out.println("กรุณาระบุความยาวของสี่เหลี่ยมผืนผ้า");
        double length = input.nextDouble();
        area = width * length;
            break;
        case 2:
        System.out.println("กรุณาระบุความยาวของฐานสามเหลี่ยม");
        double base = input.nextDouble();
        System.out.println("กรุณาระบุความสูงของสามเหลี่ยม");
        double height = input.nextDouble();

        area = 0.5 * base * height;
            break;
        case 3:
        System.out.println("ระบุรัศมีของวงกลม");
        double radius = input.nextDouble();
        area = 3.14 * radius * radius;    
            break;
         }
         System.out.println("พื้นที่ของรูปทรงเรขาคณิตเท่ากับ " + area + "ตาราง");
    }
}
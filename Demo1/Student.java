public class Student {
    public String name;
    public int age;
    public String group;

    public static void main(String[] args) {
        Student vick = new Student();
        // vick.name = "Vick1";
        // vick.age = 19;
        // vick.group = "65/45";

        // vick.printName();
        // vick.printAge();
        // vick.printGroup();

        vick.setData("Vick1", 19, "65/45");
        vick.getData();

    }

    public void setData(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;

    }

    public void getData() {
        System.out.println(
            this.name + " is " + this.age + " years old and is in group " + this.group
        );
    }

    public void printName() {
        System.out.println("Student name:\t" + this.name);
    }

    public void printAge() {
        System.out.println("Student age:\t" + this.age);
    }

    public void printGroup() {
        System.out.println("Student group:\t" + this.group);
    }

}

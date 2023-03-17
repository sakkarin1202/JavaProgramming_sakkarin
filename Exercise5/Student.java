public class Student {
    // Attributes
    int studentId;
    String name;
    String surename;
    String username;
    String password;

    // Method
    public void register(int studentId, String name, String surename, String username, String password) {
        // Method body
        this.studentId = studentId;
        this.name = name;
        this.surename = surename;
        this.password = password;
        this.username = username;
    }

    public boolean login(String username, String password) {
        // Method body
        if (this.username.equalsIgnoreCase(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void printStudent() {
        System.out.println("Name: " + this.name + " " + this.surename);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Username: " + this.username);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.printStudent();
        std1.register(12345, "Sakkarin", "Rodjit", "Sakkarin12", "123456");
        System.out.println("After register:");
        std1.printStudent();
        if (std1.login("Sakkarin12", "123456")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        Student std2 = new Student();
        std2.register(9999, "Thirayuth", "Baitoey", "thitoey", "123456");
        std2.printStudent();
    }
}
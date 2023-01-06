public class Car {
    /* Attributes */
    public int size;
    public String color;
    public String model;

    /* Main Method */
    public static void main(String[] args) {
        // moveForward();
        // moveBackward();
        // stop();
        // turnOnlight();
        // turnOfflight();
        Car blackCar = new Car();
        blackCar.color = "black";
        blackCar.model = "Honda";
        blackCar.size = 4;

        Car greenCar = new Car();
        greenCar.color = "green";
        greenCar.model = "Mazda";
        greenCar.size = 3;

        System.out.println("Car color:" + blackCar.color);
        System.out.println("Car model:" + blackCar.model);
        System.out.println("Car size:" + blackCar.size);
        blackCar.moveForward();

        System.out.println("Car color:" + greenCar.color);
        System.out.println("Car model:" + greenCar.model);
        System.out.println("Car size:" + greenCar.size);
        greenCar.stop();
    }
    /* Methods */

    public void moveForward() {
        System.out.println("move forward");
    }

    public void moveBackward() {
        System.out.println("move backward");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void turnOnlight() {
        System.out.println("turn on light");
    }

    public void turnOfflight() {
        System.out.println("turn off light");
    }

}
public class VariableScopeDemo {
    public int i; // object variable

    public void method1() {
        int j = 4; // local variable
        int k = 2; // another local variable
    }

    public void method2() {
        int j = 0; /// local variable
        System.out.println(j);
        // calling an object variable i
        // System.out.println(k);//illegal000.
    }

    public static void main(String[] args) {
        VariableScopeDemo v1 = new VariableScopeDemo();
        v1.method2();
    }
}
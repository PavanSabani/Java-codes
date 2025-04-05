package Exception_handling;

public class Example1 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        System.out.println("This code will be printed");
    }
}

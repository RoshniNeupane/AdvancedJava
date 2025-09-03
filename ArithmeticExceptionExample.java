//WAP to handle arithmetic exceptions when dividing two numbers.
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

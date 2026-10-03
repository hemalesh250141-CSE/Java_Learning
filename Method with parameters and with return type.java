public class Main {

    // 1. Method definition with parameters (int a, int b) and return type (int)
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returns the calculated value to the caller
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;

        // 2. Calling the method and passing arguments (num1, num2)
        // The returned value (40) is captured and stored in 'result'
        int result = addNumbers(num1, num2);

        // 3. Printing the stored result
        System.out.println("The sum is: " + result); 
    }
}

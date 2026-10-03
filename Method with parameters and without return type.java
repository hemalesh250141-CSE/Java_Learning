public class Main {

    // Method with parameters (String and int) and WITHOUT a return type (void)
    public static void printGreeting(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        // No return statement here!
    }

    public static void main(String[] args) {
        // Defining arguments to pass into the method
        String user = "Alice";
        int userAge = 25;

        // Calling the method and passing the arguments
        printGreeting(user, userAge);
    }
}

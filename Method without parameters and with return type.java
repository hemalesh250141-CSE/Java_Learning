public class Main {

    // 1. Method definition: No parameters (), returns a String
    public static String getGreeting() {
        return "Hello! Welcome to Java programming."; 
    }

    // 2. Method definition: No parameters (), returns an int
    public static int getRandomDiceRoll() {
        // Generates a random number between 1 and 6
        int roll = (int) (Math.random() * 6) + 1;
        return roll; 
    }

    public static void main(String[] args) {
        // Calling the methods and storing their returned values
        String message = getGreeting();
        int diceResult = getRandomDiceRoll();

        // Displaying the results
        System.out.println("Message: " + message);
        System.out.println("Dice Roll Result: " + diceResult);
    }
}

public class ArrayExample { 
public static void main(String[] args) { 
int[] scores = {75, 80, 85, 90, 95}; 
// Print all elements 
for (int i = 0; i < scores.length; i++) { 
System.out.println("Score " + (i+1) + ": " + scores[i]); 
} 
// Find sum 
int sum = 0; 
for (int score : scores) { 
sum += score; 
} 
System.out.println("Total: " + sum); 
} 
}

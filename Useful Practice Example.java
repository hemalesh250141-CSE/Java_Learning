public class StringPractice { 
public static void main(String[] args) { 
String input = "  Java is Fun  "; 
input = input.trim(); // "Java is Fun" 
if (input.contains("Java")) { 
System.out.println("Yes, it's about Java!"); 
} 
String[] words = input.split(" "); 
System.out.println("Words count: " + words.length); 
} 
} 

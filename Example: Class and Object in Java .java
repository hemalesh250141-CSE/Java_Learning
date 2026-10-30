class Student { 
// Fields (attributes) 
int rollNo; 
String name; 
// Method 
void displayInfo() { 
System.out.println("Roll No: " + rollNo); 
System.out.println("Name: " + name); 
} 
} 
// Main class 
public class Main { 
public static void main(String[] args) { 
// Creating object of Student 
Student s1 = new Student(); 
// Assign values 
s1.rollNo = 101; 
s1.name = "Alice"; 
// Call method 
s1.displayInfo(); 
} 
} 

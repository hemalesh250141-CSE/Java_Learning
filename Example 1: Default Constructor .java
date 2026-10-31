class Student { 
String name; 
int rollNo; 
// Default constructor 
Student() { 
name = "Unknown"; 
rollNo = 0; 
} 
void display() { 
System.out.println("Name: " + name); 
System.out.println("Roll No: " + rollNo); 
} 
} 
public class Main { 
public static void main(String[] args) { 
Student s = new Student(); // constructor called 
s.display(); 
} 
} 

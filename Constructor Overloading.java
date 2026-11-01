class Student { 
String name; 
int rollNo; 
// Default constructor 
Student() { 
name = "Not Set"; 
rollNo = 0; 
} 
// Overloaded constructor 
Student(String n, int r) { 
name = n; 
rollNo = r; 
} 
void display() { 
System.out.println("Name: " + name); 
System.out.println("Roll No: " + rollNo); 
} 
} 
public class Main { 
public static void main(String[] args) { 
Student s1 = new Student(); 
Student s2 = new Student("Bob", 202); 
s1.display(); 
s2.display(); 
} 
} 

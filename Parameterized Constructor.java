class Student { 
String name; 
int rollNo; 
// Parameterized constructor 
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
Student s = new Student("Alice", 101); 
s.display(); 
} 
} 

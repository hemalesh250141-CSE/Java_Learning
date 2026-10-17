public class MethodDemo { 
// no parameters, no return 
void sayHello() { 
System.out.println("Hello!"); 
} 
// with parameter, no return 
void displayAge(int age) { 
System.out.println("Age: " + age); 
} 
// no parameter, with return 
String getGreeting() { 
return "Good Morning!"; 
} 
// with parameter and return 
int multiply(int x, int y) { 
return x * y; 
} 
public static void main(String[] args) { 
MethodDemo obj = new MethodDemo(); 
obj.sayHello(); // no param, no return 
obj.displayAge(20); // param, no return 
String greet = obj.getGreeting(); // no param, with return 
System.out.println(greet); 
int result = obj.multiply(4, 5); // param and return 
System.out.println("Product: " + result); 
} 
} 

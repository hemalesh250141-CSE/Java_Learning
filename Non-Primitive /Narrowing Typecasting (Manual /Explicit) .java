public class TypeCastingExample { 
public static void main(String[] args) { 
// Widening (int to double) 
int num = 100; 
double d = num; 
System.out.println("Widening: " + d); 
// Narrowing (double to int) 
double pi = 3.14159; 
int approxPi = (int) pi; 
System.out.println("Narrowing: " + approxPi); 
} 
}

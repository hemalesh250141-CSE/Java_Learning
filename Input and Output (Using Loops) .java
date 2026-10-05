import java.util.Scanner; 
public class TwoDArrayExample { 
public static void main(String[] args) { 
int[][] arr = new int[2][3]; // 2 rows, 3 columns 
Scanner sc = new Scanner(System.in); 
// Input 
System.out.println("Enter 6 elements:"); 
for (int i = 0; i < 2; i++) { 
for (int j = 0; j < 3; j++) { 
arr[i][j] = sc.nextInt(); 
} 
} 
// Output 
System.out.println("2D Array:"); 
for (int i = 0; i < 2; i++) { 
for (int j = 0; j < 3; j++) { 
System.out.print(arr[i][j] + " "); 
} 
System.out.println(); 
} 
} 
} 

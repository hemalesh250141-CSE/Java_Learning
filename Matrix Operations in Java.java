import java.util.Scanner; 
public class MatrixOperations { 
static Scanner sc = new Scanner(System.in); 
// Read matrix from user 
static int[][] readMatrix(int rows, int cols) { 
int[][] mat = new int[rows][cols]; 
System.out.println("Enter elements of matrix (" + rows + "x" + cols 
+ "):"); 
for (int i = 0; i < rows; i++) 
for (int j = 0; j < cols; j++) 
mat[i][j] = sc.nextInt(); 
return mat; 
} 
// Display matrix 
static void printMatrix(int[][] mat) { 
for (int[] row : mat) { 
for (int val : row) 
System.out.print(val + "\t"); 
System.out.println(); 
} 
} 

//Sum of all elements: 
int sum = 0; 
for (int i = 0; i < rows; i++) { 
    for (int j = 0; j < cols; j++) { 
        sum += arr[i][j]; 
    } 
} 
System.out.println("Sum = " + sum); 
//Sum of each row: 
for (int i = 0; i < rows; i++) { 
    int rowSum = 0; 
    for (int j = 0; j < cols; j++) { 
        rowSum += arr[i][j]; 
    } 
    System.out.println("Sum of row " + i + ": " + rowSum); 
} 
//Transpose of matrix: 
int[][] transpose = new int[cols][rows]; 
for (int i = 0; i < rows; i++) { 
    for (int j = 0; j < cols; j++) { 
        transpose[j][i] = arr[i][j]; 
    } 
} 

    static double[][] divideMatrices(int[][] a, int[][] b) { 
        int rows = a.length, cols = a[0].length; 
        double[][] result = new double[rows][cols]; 
 
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                result[i][j] = (b[i][j] != 0) ? (double) a[i][j] / b[i][j] : 0;  
        return result; 
    } 
 
    static void printMatrix(double[][] mat) { 
        for (double[] row : mat) { 
            for (double val : row) 
                System.out.printf("%.2f\t", val); 
            System.out.println(); 
        } 
    } 

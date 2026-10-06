    static int[][] multiplyMatrices(int[][] a, int[][] b) { 
        int rows1 = a.length, cols1 = a[0].length, cols2 = b[0].length; 
        int[][] result = new int[rows1][cols2]; 
 
        for (int i = 0; i < rows1; i++) 
            for (int j = 0; j < cols2; j++) 
                for (int k = 0; k < cols1; k++) 
                    result[i][j] += a[i][k] * b[k][j]; 
 
        return result; 
    }

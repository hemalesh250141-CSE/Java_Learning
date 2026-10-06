 static int[][] transposeMatrix(int[][] mat) { 
        int rows = mat.length, cols = mat[0].length; 
        int[][] trans = new int[cols][rows]; 
 
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                trans[j][i] = mat[i][j]; 
 
        return trans; 
    }

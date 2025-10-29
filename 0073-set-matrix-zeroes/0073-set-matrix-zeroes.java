class Solution {
    public void setZeroes(int[][] matrix) {
        int[] rowZ = new int[matrix.length];
        int[] colZ = new int[matrix[0].length];
        
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == 0){
                    rowZ[i] = 1;
                    colZ[j] = 1;
                }
            }
        }

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(rowZ[i] == 1 || colZ[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
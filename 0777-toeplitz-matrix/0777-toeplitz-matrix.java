class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row=matrix.length;
        int colm=matrix[0].length;
        for(int i=0;i<row-1;i++){
           for(int j=0;j<colm-1;j++){
               if(matrix[i][j]!=matrix[i+1][j+1]){
                 return false;
                }
            }
        }
        return true;
              
           
        
    }
}
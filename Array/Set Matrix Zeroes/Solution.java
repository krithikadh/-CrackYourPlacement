class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int row[]= new int[m];
        int col[]= new int[n];
        for(int i=0;i<m;i++){
            row[i]=0;
        }
        for(int i=0;i<n;i++){
            col[i]=0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

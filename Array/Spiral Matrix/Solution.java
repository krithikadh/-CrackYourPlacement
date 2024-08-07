class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0,col=-1,x=1;
        List<Integer> ans=new ArrayList<>();
        while(m>0 && n>0){
            for(int i=0;i<n;i++){
                col+=x;
                ans.add(matrix[row][col]);
            }
            m--;
            for(int i=0;i<m;i++){
                row+=x;
                ans.add(matrix[row][col]);
            }
            n--;
            x*=-1;
        }
        return ans;
    }
}

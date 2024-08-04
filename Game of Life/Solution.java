class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int a=0;
                for(int k=0;k<8;k++){
                    int ni=i+dx[k];
                    int nj=j+dy[k];
                    if(ni>=0 && ni<m && nj>=0 && nj<n && Math.abs(board[ni][nj])==1){
                        a++;
                    }
                }
                if(board[i][j]==1 && (a<2 || a>3)){
                    board[i][j]=-1;
                }
                if(board[i][j]==0 && a==3){
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==-1){
                    board[i][j]=0;
                }
                if(board[i][j]==2){
                    board[i][j]=1;
                }
            }
        }
    }
}

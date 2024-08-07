class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n=points.length;
        int max=Integer.MIN_VALUE;
        int res=0,mod=0,flag=1;
        for(int i=0;i<n-1;i++)
        {
            if(flag<i+1)
                flag=i+1;
            for(int j=flag;j<n;j++) 
            {
                mod=points[i][0]-points[j][0]; 
                if(mod<0)
                    mod=-mod;
                if(mod>k)
                    break;
                res=points[i][1]+points[j][1]+mod;
                if(max<res)
                {
                    max=res;
                    flag=j-1;
                }
            }
        }
        return max;
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            if(i>x){
                return false;
            }
            x=Math.max(x,i+nums[i]);
            if(x>=n-1){
                return true;
            }
        }
        return false;
    }
    
}

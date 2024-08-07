class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==k){
                    a++;
                }
            }
        }   
        return a;   
    }
}

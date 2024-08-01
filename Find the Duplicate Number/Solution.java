class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int a=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                a+=nums[i];
                break;
            }
        }
        return a;
    }
}

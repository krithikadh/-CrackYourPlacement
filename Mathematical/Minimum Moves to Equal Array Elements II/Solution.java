class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            c+=Math.abs(num-mid);
        }
        return c;
    }
}

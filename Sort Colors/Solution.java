class Solution {
    public void sortColors(int[] nums) {
        int numsSize=nums.length;
        for(int i=0;i<numsSize;i++){
        for(int j=0;j<numsSize;j++){
            if(nums[i]<nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    }
}

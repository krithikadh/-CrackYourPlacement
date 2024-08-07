class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==a){
                c++;
            }else{
                c--;
                if(c==0){
                    a=nums[i];
                    c=1;
                }
            }
        }
        return a;
    }
}

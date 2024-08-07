class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[]=new int[k];
        int sum=0,c=0;
        arr[0]=1;
        for(int i : nums){
            sum=(i+sum)%k;
            if(sum<0){
                sum+=k;
            }
            c+=arr[sum];
            arr[sum]+=1;
        }
        return c;
    }
}

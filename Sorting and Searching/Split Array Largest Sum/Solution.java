class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countsub(nums,mid)>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public int countsub(int []arr,int lim){
        int arrcount=1;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum+arr[i]>lim){
                arrcount++;
                sum=arr[i];
            }
            else sum+=arr[i];
        }
        return arrcount;
    }
}

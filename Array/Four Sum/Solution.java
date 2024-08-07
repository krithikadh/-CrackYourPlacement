class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-4;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=nums.length-3;j++){
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);
                        list.add(li);
                        k++;
                        l--;
                        while(k<l&&nums[k]==nums[k-1]) k++;
                        while(k<l&&nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return list;
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                set.add(nums[i]);
            }
        }
        List<Integer> list=new ArrayList<Integer>(set);
        return list;
    }
}

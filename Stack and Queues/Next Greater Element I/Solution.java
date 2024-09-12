class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] arr=new int[n1];
        Arrays.fill(arr,-1);
        int found=0,i=0,j=0;
        for(i=0;i<n1;i++)
        {
            found=0;
            for(j=0;j<n2;j++)
            {
                if(nums1[i]==nums2[j]) {found = 1;}
                if(nums2[j]>nums1[i] && found ==1)
                {
                    arr[i]=nums2[j];
                    break;
                }
            }
        }
        return arr;
    }
}

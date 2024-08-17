class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] arr = new long[n];
        long a = 1,b = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = a;
            a *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            arr[i] *= b;
            b *= nums[i];
        }
        return arr;
    }
}

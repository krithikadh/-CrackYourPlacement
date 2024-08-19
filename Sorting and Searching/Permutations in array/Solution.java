class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] < k) {
                return false;
            }
        }
        return true;
    }
}

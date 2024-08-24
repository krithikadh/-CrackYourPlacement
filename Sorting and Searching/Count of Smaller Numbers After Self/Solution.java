class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] counts = new Integer[n];
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
            counts[i] = 0;
        }
        mergeSort(nums, indices, counts, 0, n - 1);
        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(int[] nums, int[] indices, Integer[] counts, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, indices, counts, left, mid);
        mergeSort(nums, indices, counts, mid + 1, right);
        merge(nums, indices, counts, left, mid, right);
    }

    private void merge(int[] nums, int[] indices, Integer[] counts, int left, int mid, int right) {
        int[] tempIndices = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, rightCounter = 0;
        while (i <= mid && j <= right) {
            if (nums[indices[j]] < nums[indices[i]]) {
                tempIndices[k] = indices[j];
                rightCounter++;
                j++;
            } else {
                tempIndices[k] = indices[i];
                counts[indices[i]] += rightCounter;
                i++;
            }
            k++;
        }
        while (i <= mid) {
            tempIndices[k] = indices[i];
            counts[indices[i]] += rightCounter;
            i++;
            k++;
        }
        while (j <= right) {
            tempIndices[k++] = indices[j++];
        }
        for (int p = 0; p < tempIndices.length; p++) {
            indices[left + p] = tempIndices[p];
        }
    }
}

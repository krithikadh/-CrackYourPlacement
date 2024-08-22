class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(nums[i], i);
        }
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || nums[i] == sortedNums[i]) {
                continue;
            }
            int cycleLength = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(sortedNums[j]);
                cycleLength++;
            }
            if (cycleLength > 1) {
                swaps += cycleLength - 1;
            }
        }
        return swaps;
    }
}

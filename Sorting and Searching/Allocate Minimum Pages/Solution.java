class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        if (m > n) return -1;
        long sum = 0;
        int maxPages = Integer.MIN_VALUE;
        for (int pages : arr) {
            sum += pages;
            maxPages = Math.max(maxPages, pages);
        }
        long low = maxPages;
        long high = sum;
        long result = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canAllocate(arr, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    
    private static boolean canAllocate(int[] arr, int n, int m, long maxPages) {
        int studentsRequired = 1;
        long currentPageSum = 0;
        for (int i = 0; i < n; i++) {
            if (currentPageSum + arr[i] > maxPages) {
                studentsRequired++;
                currentPageSum = arr[i];
                if (studentsRequired > m) {
                    return false;
                }
            } else {
                currentPageSum += arr[i];
            }
        }
        return true;
    }
};

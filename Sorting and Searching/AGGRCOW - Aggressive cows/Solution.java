import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static boolean canPlaceCows(int[] stalls, int n, int c, int minDist) {
        int count = 1;
        int lastPosition = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];
                if (count == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int largestMinimumDistance(int[] stalls, int n, int c) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlaceCows(stalls, n, c, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }   
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] stalls = new int[n];
            for (int i = 0; i < n; i++) {
                stalls[i] = sc.nextInt();
            }           
            System.out.println(largestMinimumDistance(stalls, n, c));
        }
        sc.close();
    }
}

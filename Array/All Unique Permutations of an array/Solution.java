class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(arr);
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        permute(arr,0,n,set);
        ans.addAll(set);
        Collections.sort(ans,(a, b) -> {
            for(int i=0;i<a.size();i++) {
                if(!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return ans;
    }

    private static void permute(ArrayList<Integer> arr, int start, int n, HashSet<ArrayList<Integer>> set) {
        if (start==n) {
            set.add(new ArrayList<>(arr));
            return;
        }
        for (int i=start;i<n;i++) {
            Collections.swap(arr,start,i);
            permute(arr,start+1,n,set);
            Collections.swap(arr,start,i);
        }
    }
};

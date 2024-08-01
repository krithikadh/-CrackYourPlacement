class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long x=Long.MAX_VALUE;
        for (int i=0;i+m-1<n;i++){
            long diff=a.get(i+m-1)-a.get(i);
            if(diff<x){
                x=diff;
            }
        }
        return x;
    }
}

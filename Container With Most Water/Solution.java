class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0,a=0,b=n-1;
        while(a<b){
            max=Math.max(max,(b-a) * Math.min(height[a],height[b]));
            if(height[a]<height[b]){
                a++;
            }else{
                b--;
            }
        }
        return max;        
    }
}

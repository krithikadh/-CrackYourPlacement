class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=n;i++){
            int a = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && a<heights[stack.peek()]){
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                int area = heights[top]*width;
                max = Math.max(max,area);
            }
            stack.push(i);
        }
        return max;
    }
}

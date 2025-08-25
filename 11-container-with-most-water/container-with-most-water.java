class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int l = 0, r = n - 1;

        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int area = (r - l) * minHeight;
            max = Math.max(max, area);

            // Move pointer of the smaller height
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
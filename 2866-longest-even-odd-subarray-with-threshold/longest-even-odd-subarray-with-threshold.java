class Solution {
    int threshold;

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        this.threshold = threshold;
        int l = 0;
        int n = nums.length;

        while (l < n) {

            if (!isEven(nums[l]) || !isLessOrEqualThanThresHold(nums[l])) {
                l++;
                continue;
            }

            int r = l + 1;

            while (r < n && isLessOrEqualThanThresHold(nums[r]) && isDifferent(nums[r], nums[r - 1])) {
                r++;
            }

            max = Math.max(max, r - l);
            l = r ; // expand the window reduces time complexity 

        }

        return max;

    }

    private boolean isDifferent(int num1, int num2) {
        return num1 % 2 != num2 % 2;
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private boolean isLessOrEqualThanThresHold(int num) {
        return num <= threshold;
    }
}
import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // sort the array
        Arrays.sort(nums);
        // kth largest = element at (length - k)
        return nums[nums.length - k];
    }
}

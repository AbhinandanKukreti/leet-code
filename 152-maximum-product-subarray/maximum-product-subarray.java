class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0];
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            
            if (current < 0) {
                // Swap because multiplying by negative flips signs
                int temp = max_so_far;
                max_so_far = min_so_far;
                min_so_far = temp;
            }
            
            max_so_far = Math.max(current, current * max_so_far);
            min_so_far = Math.min(current, current * min_so_far);
            
            max_product = Math.max(max_product, max_so_far);
        }
        
        return max_product;
    }
}

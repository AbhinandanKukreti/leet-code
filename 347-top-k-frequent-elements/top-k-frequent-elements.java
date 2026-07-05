import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Min Heap
        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> count.get(a) - count.get(b)
        );

        // Keep only top k elements
        for (int n : count.keySet()) {
            heap.offer(n);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        
        // Step 1: sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        // We’ll use a temporary array to hold merged intervals
        int[][] temp = new int[intervals.length][2];
        int idx = 0;  // index for temp
        
        // Put first interval in temp
        temp[0] = intervals[0];
        
        // Step 2: loop through intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = temp[idx];
            int[] curr = intervals[i];
            
            if (curr[0] <= prev[1]) {  
                // Overlap → merge
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                // No overlap → move forward
                idx++;
                temp[idx] = curr;
            }
        }
        
        // Step 3: copy merged part into result array
        int[][] result = new int[idx + 1][2];
        for (int i = 0; i <= idx; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}

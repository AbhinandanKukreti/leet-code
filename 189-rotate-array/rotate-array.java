class Solution {
     public static void reverseArray(int[] arr,int i, int k) {
        

        while (i < k) {
            // Swap elements at start and end
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;

            // Move pointers
            i++;
            k--;
        }
        }
       public void rotate(int[] nums, int k) {
        k= k%nums.length;  
       reverseArray(nums,0,nums.length -k-1);
       reverseArray(nums,nums.length-k,nums.length-1);
       reverseArray(nums,0,nums.length-1);
       
    }
}

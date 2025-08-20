class Solution {
    int normalMaxsum(int arr[] ,int n){
        int res =arr[0];
        int maxEnding = arr[0];
        for(int i=1; i< arr.length; i++){
            maxEnding =Math.max(arr[i],maxEnding + arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public int maxSubarraySumCircular(int[] nums) {
     int max_Normal = normalMaxsum(nums, nums.length);
     if(max_Normal <0){
        return max_Normal;
     }
     int arr_Sum =0;
     for(int i=0 ; i< nums.length; i++){
        arr_Sum += nums[i];
        nums[i]= -nums[i];

     }
     int max_circular = arr_Sum + normalMaxsum(nums, nums.length);
     return Math.max(max_circular, max_Normal);
        
    }
}
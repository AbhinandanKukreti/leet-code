class Solution {
    private int[] sumLeft;
    private int[] sumRight;
    public int pivotIndex(int[] nums) {
    sumLeft = new int[nums.length];
    sumRight = new int[nums.length];
    sumLeft[0]=nums[0];
    sumRight[nums.length-1]= nums[nums.length-1];
    for(int i=1;i<nums.length;i++){
      sumLeft[i] = sumLeft[i-1]+nums[i];
    }
    for(int i=nums.length-2;i>=0;i--){
        sumRight[i] = sumRight[i+1]+ nums[i];
    }
   
    for(int i=0;i<nums.length;i++){
        if(sumLeft[i] == sumRight[i]){
            return i;
        }
    }
     return -1;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num : nums){
            if(map.get(num)==null){
                map.put(num,1);
            }
            else{
                int s=map.get(num)+1;
                map.put(num,s);
            }
        }
        int max=Integer.MIN_VALUE;
        int major=nums[0];
        for(int i:map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                major=i;
            }
        }
        return major;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
     //create a hashset to store element from an array
       HashSet<Integer> seenNumbers = new HashSet<>();
    //itrate through through every element in that array
    for(int num : nums){
        if(seenNumbers.contains(num)){
            return true;
        }
        seenNumbers.add(num);
    }
        return false;
    }
}
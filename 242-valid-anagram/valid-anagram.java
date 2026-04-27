class Solution {
    public boolean isAnagram(String s, String t) {
        //chechk the length 
        if(s.length() != t.length()){
            return false;
        }
        int[] charCounts = new int[26];
        //initialize array of size 26
        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i)- 'a']++;
            charCounts[t.charAt(i)- 'a']--;

        }
        //check if all counts are zero
        for(int counts : charCounts){
            if(counts != 0){
                return false;
            }
        }
        return true;
    }
}
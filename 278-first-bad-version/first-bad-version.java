/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int r = n;
        int l =1;
         int mid;
        while(l<r){
           mid =((r-l)/2 + l);
            if(isBadVersion(mid)){
                r= mid;  
            }
            else{
                l= mid +1;
            }
        }
        return l;
    }
}
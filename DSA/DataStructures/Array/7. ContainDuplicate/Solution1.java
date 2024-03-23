// https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        

        HashSet<Integer>  numSet = new HashSet<>();
        for(int i : nums) {
            if(numSet.contains(i)) {
                return true;
            } else {
                numSet.add(i);
            }
        }
        return false;
    }
}
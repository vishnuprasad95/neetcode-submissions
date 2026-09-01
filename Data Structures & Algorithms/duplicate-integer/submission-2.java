class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int a : nums)
        {
            if(mySet.contains(a))
            return true;
            else mySet.add(a);
        }
        return false;
        
    }
}
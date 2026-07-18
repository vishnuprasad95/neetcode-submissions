class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> testSet = new HashSet<>(100);
        boolean returnvalue  = false;
        for(int i =0;i<nums.length;i++)
        {
            if(testSet.contains(nums[i]))
            {
                returnvalue=true;
                break;
            }
            else
            {   
                testSet.add(nums[i]);
            }
        }
        return returnvalue;
    }
}
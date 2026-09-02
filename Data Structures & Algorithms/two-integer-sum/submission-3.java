class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<>();
        int[] resultArray = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(result.containsKey(target-nums[i]))
            {
                resultArray[0]=result.get(target-nums[i]);
                resultArray[1]=i;
                return resultArray;
            }
            else
            result.put(nums[i],i);
        }
        return resultArray;
    }
}

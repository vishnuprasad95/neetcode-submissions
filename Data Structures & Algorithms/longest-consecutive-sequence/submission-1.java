class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        int maxLength= 0;
        for(int num:nums)
        {
            mySet.add(num);
        }
        for(int num:nums)
        {
            if(!mySet.contains(num-1))
            {
                //Yes this can be start.Find the size of consecutive sequence
                int length=1;
                int current = num;
                while(mySet.contains(current+1))
                {
                    length++;
                    current++;
                }
                if(length>maxLength)
                maxLength=length;
            }
        }
        return maxLength;
    }
}

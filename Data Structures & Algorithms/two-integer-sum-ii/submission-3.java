class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(myMap.containsKey(target-numbers[i]))
            {
               result[0]=myMap.get(target-numbers[i])+1;
               result[1]=i+1;
            }
            else
            {
                myMap.put(numbers[i],i);
            }
        }
        return result;
        
    }
}

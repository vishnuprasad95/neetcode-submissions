class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int num : nums) {
            if (myMap.containsKey(num)) {
                myMap.put(num, myMap.get(num) + 1);
            } else
                myMap.put(num, 1);
        }
        List<Integer>[] myArray = new ArrayList[nums.length+1];
        for (Map.Entry<Integer, Integer> entry :myMap.entrySet()) {
            List<Integer> currentList = myArray[entry.getValue()];
            if (currentList == null) {
               List<Integer> myList = new ArrayList<>(); 
               myList.add(entry.getKey());
               myArray[entry.getValue()]=myList;
            }
            else
            {
                currentList.add(entry.getKey());
                myArray[entry.getValue()]=currentList;
            }
        }
        int l=0;
        for(int i=myArray.length-1;i>0 && k>0;i--)
        {
          List<Integer> currentList = myArray[i];
          if(currentList !=null)
          {
          for(int num:currentList)
          {
            result[l]=num;
            l++;
            k--;
          }  
          }
        }
        return result;
    }
}

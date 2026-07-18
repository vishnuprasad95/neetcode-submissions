class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mymap = new HashMap<>();
        for(int num:nums)
        {
           mymap.put(num, mymap.getOrDefault(num,0)+1);
        }
        List<Integer>[] myBuckets = new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:mymap.entrySet())
        {
            int number = entry.getKey();
            int frequency=entry.getValue();
            if(myBuckets[frequency] ==null){
                myBuckets[frequency]= new ArrayList<>();
            }
            myBuckets[frequency].add(number);
        }
        int[] result = new int[k];
        int index =0;
       for (int i = myBuckets.length - 1; i >= 0; i--) {
        

             if (myBuckets[i] != null) {

                for (int num : myBuckets[i]) {

                        result[index++]=num;
                    if(index==k)
                    return result;

                    }
            }
        }
        return result;

        
    }
}


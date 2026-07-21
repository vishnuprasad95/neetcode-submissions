class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        char[] myArray = s.toCharArray();
        int left =0;
        int leng=0;
        for(int right=0;right<myArray.length;right++)
        {
            while(mySet.contains(myArray[right]))
            {
              mySet.remove(myArray[left]);
              left++;  
            }
            mySet.add(myArray[right]);
            if(mySet.size()>leng)
            leng=mySet.size();

        }
        return leng;
    }
}

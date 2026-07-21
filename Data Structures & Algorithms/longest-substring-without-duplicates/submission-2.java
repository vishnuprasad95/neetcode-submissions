class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] car = s.toCharArray();
        int maxSize=0;
        for (int i = 0; i < car.length; i++)
            for (int j = i; j < car.length; j++) {
                Set<Character> mySet = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    if (mySet.contains(car[k]))
                    break;
                else
                    mySet.add(car[k]);
                }
                if(mySet.size()>maxSize)
                maxSize=mySet.size();
            }
            
        return maxSize;
    }
}

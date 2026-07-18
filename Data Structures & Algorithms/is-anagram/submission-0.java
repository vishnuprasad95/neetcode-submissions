class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    return false;
    char[] myChar= s.toCharArray();
    Map<Character,Integer> myMap = new HashMap<>();
    for(char a: myChar)
    {
             if(myMap.containsKey(a))
            {
               int count= myMap.get(a);
               myMap.put(a,++count);
            }
            else myMap.put(a,1);
    }
    myChar = t.toCharArray();
    for(char a :myChar)
    {
        if(myMap.containsKey(a))
        {
            int count =myMap.get(a);
            if (count ==0)return false;
            myMap.put(a,--count);
            if(count==0)
            myMap.remove(a);
        }
        else return false;
    }
    return true;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

               if(s.length()!=t.length())
            return false;
        Map<Character,Integer> myMap = new HashMap<>();
        char[] Sarray = s.toCharArray();
        char[] Tarray= t.toCharArray();
        for(char a : Sarray)
        {
        if(myMap.containsKey(a))
            myMap.put(a,myMap.get(a)+1);
        else
            myMap.put(a,1);
        }

        for(char b : Tarray)
        {
            if(myMap.containsKey(b))
                if(myMap.get(b)==0)
                    return  false;
                else myMap.put(b,myMap.get(b)-1);
            else return  false;
        }
        return  true;

    }
}

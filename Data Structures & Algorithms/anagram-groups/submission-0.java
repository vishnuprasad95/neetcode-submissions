class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mymap = new HashMap<>();
        for( String str:strs)
        {
            String sortedString =sort(str);
            
            if(mymap.containsKey(sortedString))
            {
                mymap.get(sortedString).add(str);
            }
            else
            {
            List<String> myList = new ArrayList<>();
            myList.add(str);
            mymap.put(sortedString,myList);
            }
        }
        return new ArrayList<>(mymap.values());
    }
    private String sort(String input)
    {
        char[] myArray = input.toCharArray();
        Arrays.sort(myArray);
        return new String(myArray);
    }
}

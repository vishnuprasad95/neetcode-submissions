class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mymap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            int[] array = new int[26];
            for (char ch : charArray) {
                ch = Character.toLowerCase(ch);
                array[ch-'a']++;
            }
            String key = "";
            StringBuilder myString = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                myString.append(array[i]);
                myString.append(",");
            }
            String keyString = myString.toString();
            if (mymap.containsKey(keyString)) { 
                mymap.get(keyString).add(str);
            } else
            {
                mymap.put(keyString, new ArrayList<>());
                mymap.get(keyString).add(str);
            }
        }
       List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : mymap.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        char[] myArray = s.toCharArray();
        int maxLength = 0;
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        for (int right = 0; right < s.length(); right++) {
            freq.put(myArray[right], freq.getOrDefault(myArray[right], 0) + 1);
            maxFreq = getMax(maxFreq, freq.getOrDefault(myArray[right], 0));
            while (right - left + 1 - maxFreq > k) {
                freq.put(myArray[left], freq.get(myArray[left]) - 1);
                if (freq.get(myArray[left]) == 0)
                    freq.remove(myArray[left]);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public int getMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}

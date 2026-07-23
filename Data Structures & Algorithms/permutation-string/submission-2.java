class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        int[] freqS1= new int[26];
        int[] freqWindow= new int[26];
        char[] s1Array= s1.toCharArray();
        char[] s2Array= s2.toCharArray();
        int right=s1Array.length;
        for(char a:s1Array)
        {
            freqS1[a-'a']++;
        }
        for(int i=0;i<s1Array.length;i++)
        {
            freqWindow[s2Array[i]-'a']++;
        }
        if(Arrays.equals(freqS1,freqWindow))
          return true;
        for(int left=0;right<s2.length();)
        {
          freqWindow[s2Array[left]-'a']--;
          left++;
          freqWindow[s2Array[right]-'a']++;
          right++;
          if(Arrays.equals(freqS1,freqWindow))
          return true;
        }
        return false;

    }
}

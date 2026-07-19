class Solution {
    public boolean isPalindrome(String s) {
        char[] myArray = s.toCharArray();
        int left=0;
        int right=myArray.length-1;
        while(left<right)
        {
            while(!isValidChar(myArray[left]) && left<right)
             left++;
            while(!isValidChar(myArray[right]) && left < right)
             right--;
            if(Character.toLowerCase(myArray[left])!=Character.toLowerCase(myArray[right]))
            return false;
            left ++;
            right --;
        }
        return true;

    }
    public boolean isValidChar(char a)
    {
        return Character.isLetterOrDigit(a);
    }
}

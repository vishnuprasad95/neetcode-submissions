class Solution {
    public boolean isPalindrome(String s) {
        char[] myArray = s.toCharArray();
        int left = 0;
        int right = myArray.length - 1;
        while (left < right) {
            while(left<right && !Character.isLetterOrDigit(myArray[left]))
            left++;
            while(left<right &&!Character.isLetterOrDigit(myArray[right]))
            right--;
            char charleft=Character.toLowerCase(myArray[left]);
            char charright =Character.toLowerCase(myArray[right]);
            if ( charleft!=charright) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}

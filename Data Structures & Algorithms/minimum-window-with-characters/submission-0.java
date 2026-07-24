class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] window = new int[128];

        int required = 0;

        // Build need[] and count unique characters
        for (char c : t.toCharArray()) {
            if (need[c] == 0) {
                required++;
            }
            need[c]++;
        }

        int formed = 0;

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            // Expand window
            window[rightChar]++;

            // Requirement for this character satisfied?
            if (window[rightChar] == need[rightChar]) {
                formed++;
            }

            // Shrink while still valid
            while (formed == required) {

                // Update best answer
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                // Remove left character
                window[leftChar]--;

                // Did we break a requirement?
                if (window[leftChar] < need[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}
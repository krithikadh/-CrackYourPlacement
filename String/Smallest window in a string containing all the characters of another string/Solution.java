class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int[] hashP = new int[26];
        int[] hashS = new int[26];
        for (int i = 0; i < p.length(); i++) {
            hashP[p.charAt(i) - 'a']++;
        }
        int start = 0, minLength = Integer.MAX_VALUE, startIndex = -1;
        int count = 0;
        for (int end = 0; end < s.length(); end++) {
            hashS[s.charAt(end) - 'a']++;
            if (hashP[s.charAt(end) - 'a'] != 0 && hashS[s.charAt(end) - 'a'] <= hashP[s.charAt(end) - 'a']) {
                count++;
            }
            if (count == p.length()) {
                while (hashP[s.charAt(start) - 'a'] == 0 || hashS[s.charAt(start) - 'a'] > hashP[s.charAt(start) - 'a']) {
                    if (hashS[s.charAt(start) - 'a'] > hashP[s.charAt(start) - 'a']) {
                        hashS[s.charAt(start) - 'a']--;
                    }
                    start++;
                }
                int windowLength = end - start + 1;
                if (windowLength < minLength) {
                    minLength = windowLength;
                    startIndex = start;
                }
            }
        }
        if (startIndex == -1) {
            return "-1";
        }
        return s.substring(startIndex, startIndex + minLength);
    }
}

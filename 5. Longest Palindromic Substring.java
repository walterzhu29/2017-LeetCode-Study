class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;
        String result = "";
        int maxLen = 0;
        for(int i = 1; i < s.length(); i++){
            int start = i, end = i;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            if(end - start - 1 > maxLen){
                maxLen = end - start - 1;
                result = s.substring(start + 1, end);
            }
            start = i - 1;
            end = i;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            if(end - start - 1 > maxLen){
                maxLen = end - start - 1;
                result = s.substring(start + 1, end);
            }
        }
        return result;
    }
}
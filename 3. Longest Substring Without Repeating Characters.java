class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, start = 0, end = 0;
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        for(; end < s.length(); end++){
            if(hash.containsKey(s.charAt(end)) && hash.get(s.charAt(end)) >= start)
            {
                start = hash.get(s.charAt(end)) + 1;
            }
            hash.put(s.charAt(end), end);  
            result = Math.max(result, end - start + 1);
            
        }
        return result;
    }
}
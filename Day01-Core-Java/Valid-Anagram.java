/*
Leetcode 2242. Valid Anagram
Time Complexity  : O(n)
Space Complexity : O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())   
            return false;

        int[] chars = new int[26];

        for (char c : s.toCharArray())
            chars[c - 'a']++;

        for (char c : t.toCharArray()) {
            if (chars[c - 'a'] == 0) 
                return false;
            chars[c - 'a']--;
        }

        return true;
    }
}


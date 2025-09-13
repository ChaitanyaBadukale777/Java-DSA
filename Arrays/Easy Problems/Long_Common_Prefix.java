class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String first = strs[0];
        int len = first.length();

        for(int i = 0; i < len; i++) {
            char c = first.charAt(i);

            for(int j = 1; j< strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        
        return first;
    }
}



// Time Complexity: O(n * m) where n is number of strings and m is length of the first string
// Space Complexity: O(1)

// Approach : Vertical Scanning.


// Dry Example Walkthrough

// Input: ["flower","flow","flight"
// i=0, c='f' → check → all words have 'f'.
// i=1, c='l' → check → all words have 'l'.
// i=2, c='o' → "flight" has 'i' → mismatch → return "fl".

// Output → "fl" ✅
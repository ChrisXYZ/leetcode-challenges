package Strings.easy.longestSubString;

/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        String test = "";
        for (int i = 0; i < s.length(); i++) {
            if (output < test.length()) {
                output = test.length();
            }
            if (test.contains(String.valueOf(s.charAt(i)))) {
                test = test.substring(test.indexOf(s.charAt(i)) + 1);
            }
            test = test + s.charAt(i);
        }

        if (output < test.length()) {
            output = test.length();
        }
        return output;
    }

    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        System.out.println(longestSubString.lengthOfLongestSubstring(" "));
        System.out.println(longestSubString.lengthOfLongestSubstring("bbbbb"));
        System.out.println(longestSubString.lengthOfLongestSubstring("dvdf"));
        System.out.println(longestSubString.lengthOfLongestSubstring("pwwkew"));
        System.out.println(longestSubString.lengthOfLongestSubstring("abcabcbb"));
    }
}


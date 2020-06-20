package Strings._003_Longest_Substring_Without_Repeating_Characters;

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


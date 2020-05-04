package Strings.easy.firstuniquecharacterinastring;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 *
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterinaString {

    private static int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        int index;

        for (char character : s.toCharArray()) {
            index = character - 'a';
            alphabet[index] = alphabet[index] + 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}

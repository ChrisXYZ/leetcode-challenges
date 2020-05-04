package Strings.easy.validanagram;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {

    private static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        if(s.length() != t.length()) return false;


        for (char character : s.toCharArray()) {
            alphabet[character - 'a'] = alphabet[character - 'a'] + 1;  // "Populate" the alphabet array
        }

        for (char character : t.toCharArray()) {
            alphabet[character - 'a'] = alphabet[character - 'a'] - 1; // "Depopulate" the alphabet array
        }
        for(int difference : alphabet){  //"Check" if there are any which are not zero.
            if(difference!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aaaa", "aaaa"));
    }
}
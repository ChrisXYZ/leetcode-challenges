package Strings._387_First_Unique_Character_in_a_String;

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

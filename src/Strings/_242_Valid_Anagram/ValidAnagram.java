package Strings._242_Valid_Anagram;

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
package Strings.reversestring;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input
 * array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 **/
public class ReverseString {

    private static void reverseString(char[] s) {
        int rightHalf = s.length / 2 + 1;
        int leftHalf = s.length / 2 - 1;

        if(s.length%2 == 0){
            rightHalf = s.length / 2;
        }

        while (leftHalf > -1) {
            char temp = s[leftHalf];
            s[leftHalf] = s[rightHalf];
            s[rightHalf] = temp;
            leftHalf--;
            rightHalf++;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'H','a','n','n','a','h'};
        reverseString(charArray);
    }
}

// GOOD OPTIMISATION

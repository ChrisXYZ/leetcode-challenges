package string._344_Reverse_String;

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

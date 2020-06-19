package Strings.parseAndBalanceBrackets;

public class ParseAndBalanceBrackets {

    public static void main(String[] args) {
        String input = "><";
        System.out.println(solution(input));

    }


    public static String solution(String angles) {
        String appendToEnd = "";
        String appendToStart = "";
        for (int i = 0; i < angles.length(); i++) {
            if (angles.charAt(i) == '>') {
                if (appendToEnd.length() == 0) {
                    appendToStart = appendToStart + "<";
                } else {
                    appendToEnd = appendToEnd.substring(0, appendToEnd.length() - 1);
                }
            } else {
                appendToEnd = appendToEnd + ">";
            }

        }
        return (appendToStart + angles + appendToEnd);
    }
}
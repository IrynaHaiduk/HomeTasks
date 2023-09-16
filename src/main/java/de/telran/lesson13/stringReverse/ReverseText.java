package de.telran.lesson13.stringReverse;

public class ReverseText {
    public String returnReverseString (String userString) {
        int userStringLength = userString.length();
        String reverseString = "";

        for (int i = userStringLength - 1 ; i >= 0; i--) {
            reverseString += userString.charAt(i);
        }

        return reverseString;
    }
}

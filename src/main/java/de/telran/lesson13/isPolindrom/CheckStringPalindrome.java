package de.telran.lesson13.isPolindrom;

public class CheckStringPalindrome {
    public boolean isPalindrome(String checkText) {
        String updateText = checkText.replace(" ", "");
        updateText = updateText.toLowerCase();

        int textLength = updateText.length();

        for (int i = 0; i < textLength / 2; i++) {
            if (updateText.charAt(i) != updateText.charAt(textLength - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

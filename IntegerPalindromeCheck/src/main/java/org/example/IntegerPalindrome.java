package org.example;

public class IntegerPalindrome {

    public boolean CheckPalindrome(Integer input) {

        String str = input.toString();

        for (int i = 0; i < (str.length() / 2); i++) {

            if (str.charAt(i) != (str.charAt(str.length() - 1 - i))) {

                return false;

            }

        }

        return true;

    }

}

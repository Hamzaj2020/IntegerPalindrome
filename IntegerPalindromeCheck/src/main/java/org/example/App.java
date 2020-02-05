package org.example;
/**
 * Unit test for simple App.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestIntegerPalindrome {

    private IntegerPalindrome integerPalindromeChecker = new IntegerPalindrome();

    @Test
    public void TestThatValidEvenLengthPalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome(4004));
    }

    @Test
    public void TestThatValidOddLengthPalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome(24589));
    }

    @Test
    public void TestThatInvalidEvenLengthPalindromeReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome(2203));
    }

    @Test
    public void TestThatInvalidOddLengthPalindromeReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome(24588));
    }

    @Test
    public void TestThatSingleDigitNumberReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome(7));
    }

    @Test
    public void TestThatNullNumberReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome(null));
    }

    @Test
    public void TestMaxIntReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void TestMaxIntValueReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome(2147483647));
    }

    @Test
    public void TestMaxIntPlusOneHundredReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome(Integer.MAX_VALUE + 100));
    }

    @Test
    public void TestLongPalindromeCastAsIntReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome((int) 300000000000003L));
    }

    @Test
    public void TestNegativePalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome(-2002));
    }

    @Test
    public void TestThatFloatCastAsIntValidPalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.CheckPalindrome((int) 7000007F));
    }

    @Test
    public void TestThatFloatCastAsIntInvalidPalindromeReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.CheckPalindrome((int) 3300003F));
    }

}
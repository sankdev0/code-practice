package com.sankdev.reverseinteger;

import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        // 2147483647 | -2147483648
        int a = -56329;
        System.out.println(reverse(a));
    }

    public static int reverse(int integer){
        int lastDigit;
        int reverse = 0;
        try {
            while (integer != 0) {
                lastDigit = integer % 10;
                reverse = Math.addExact(Math.multiplyExact(reverse, 10), lastDigit);
                integer = integer / 10;
            }
        } catch (ArithmeticException exception) {
            return 0;
        }

        return reverse;
    }
}

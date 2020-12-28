package com.sankdev.reverseinteger;

class Solution {
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        int reverse = 0;
        int lastDigit;
        try {
            while (x > 0) {
                lastDigit = x % 10;
                reverse = Math.addExact(Math.multiplyExact(reverse, 10), lastDigit);
                x = x / 10;
            }
        } catch (ArithmeticException e){
            return 0;
        }
        if(isNegative){
            reverse = -reverse;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int x = 2_111_111_145;
        System.out.println(reverse(x));
        System.out.printf(" %d | %d ", Integer.MAX_VALUE, Integer.MIN_VALUE);

    }
}
package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversNumber = 0;
        for (int i = 0; i < 3; i++) {
            int digit = number % 10;
            reversNumber = reversNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(reversNumber);
    }
}

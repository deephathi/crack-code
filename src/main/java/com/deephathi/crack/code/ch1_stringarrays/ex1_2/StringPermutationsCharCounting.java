package com.deephathi.crack.code.ch1_stringarrays.ex1_2;

public class StringPermutationsCharCounting implements StringPermutations {

    private static final int EXTENDED_ASCII_LENGTH = 256;

    @Override
    public boolean isFirstStringPermutationOfSecond(String first, String second) {
        boolean result = true;

        if (first.length() == second.length()) {
            first = first.toLowerCase();
            second = second.toLowerCase();

            int[] countArr = new int[EXTENDED_ASCII_LENGTH];

            for (Character strChar : first.toCharArray()) {
                countArr[strChar] = countArr[strChar] + 1;
            }

            for (Character strChar : second.toCharArray()) {
                countArr[strChar] = countArr[strChar] - 1;
                if (countArr[strChar] < 0) {
                    result = false;
                }
            }
        }

        return result;
    }
}

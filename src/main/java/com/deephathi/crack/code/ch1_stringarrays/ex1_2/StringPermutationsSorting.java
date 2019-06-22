package com.deephathi.crack.code.ch1_stringarrays.ex1_2;

import java.util.Arrays;

public class StringPermutationsSorting extends AbstractStringPermutations {

    @Override
    public boolean isFirstStringPermutationOfSecond(String first, String second) {

        boolean result = false;

        if (first.length() == second.length()) {
            String[] firstAr = first.split("");
            String[] secondAr = second.split("");
            Arrays.sort(firstAr, String. CASE_INSENSITIVE_ORDER);
            Arrays.sort(secondAr, String.CASE_INSENSITIVE_ORDER);
            String sortedFirst = String.join("", firstAr);
            String sortedSecond = String.join("", secondAr);
            result = sortedFirst.equalsIgnoreCase(sortedSecond);
        }

        return result;
    }
}

package com.deephathi.crack.code.ch1_stringarrays.ex1_2;

import java.util.HashMap;
import java.util.Map;

public class StringPermutationsHashing extends AbstractStringPermutations {
    @Override
    public boolean isFirstStringPermutationOfSecond(String first, String second) {

        boolean result = false;

        if (first.length() == second.length()) {
            Map<Character, Integer>  charCountFirst = new HashMap<>();
            Map<Character, Integer>  charCountSecond = new HashMap<>();

            this.fillInMap(first.toLowerCase(), charCountFirst);
            this.fillInMap(second.toLowerCase(), charCountSecond);

            result = charCountFirst.equals(charCountSecond);
        }

        return result;

    }

    private void fillInMap(String strVal, Map<Character, Integer> counterMap) {
        for (Character strChar : strVal.toCharArray()) {
            Integer count = counterMap.getOrDefault(strChar, 0);
            counterMap.put(strChar, ++count);
        }
    }
}

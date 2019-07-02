package com.deephathi.crack.code.ch1_stringarrays.ex1_4;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationCheckerByCharCountings extends AbstractPalindromePermutationChecker {

    @Override
    public boolean isPalindromePermutations(String input) {

        return checkPalindrome(getCharacterCounts(input));

    }

    private Map<Character, Integer> getCharacterCounts(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        String effectiveStr = input.toLowerCase().replaceAll("\\s+","");
        for (Character strChar : effectiveStr.toCharArray()) {
            if (charCountMap.containsKey(strChar)) {
                charCountMap.put(strChar, charCountMap.get(strChar) + 1);
            } else {
                charCountMap.put(strChar, 1);
            }
        }
        return charCountMap;
    }

    private boolean checkPalindrome(Map<Character, Integer> charCountMap) {
        boolean result = true;
        int oddCount = 0;
        for (Map.Entry<Character, Integer> charCountEntry : charCountMap.entrySet()) {
            if (charCountEntry.getValue() % 2 != 0) {
                oddCount++;
            }
        }

        if(oddCount > 1) {
            result = false;
        }
        return result;
    }
}

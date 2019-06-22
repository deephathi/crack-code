package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharsHashing extends AbstractUniqueChars {
    @Override
    public boolean areAllCharsUnique(String incomingStr) {

        boolean result = true;

        Set<Character> charSet = new HashSet<>();

        for (Character ch : incomingStr.toCharArray()) {
            if (charSet.contains(ch)) {
                result = false;
                break;
            } else {
                charSet.add(ch);
            }
        }

        return result;
    }
}

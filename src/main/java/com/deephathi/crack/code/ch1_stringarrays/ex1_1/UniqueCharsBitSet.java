package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

import java.util.BitSet;

public class UniqueCharsBitSet extends AbstractUniqueChars {


    @Override
    public boolean areAllCharsUnique(String incomingStr) {


        checkStringLength(incomingStr.length(), EXTENDED_ASCII_LENGTH);

        boolean result = true;

        BitSet storage = new BitSet(EXTENDED_ASCII_LENGTH);

        for (char strChar : incomingStr.toCharArray()) {
            if (storage.get(strChar)) {
                result = false;
                break;
            } else {
                storage.set(strChar);
            }
        }

        return result;

    }

}

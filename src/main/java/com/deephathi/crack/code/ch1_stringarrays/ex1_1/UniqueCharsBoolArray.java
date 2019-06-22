package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

/**
 * Thi class does a health assumption that the charset being used is a EXTENDED_ASCII with the length of 256. For unicode strings,
 * this program will not work.
 */
public class UniqueCharsBoolArray extends AbstractUniqueChars {

    @Override
    public boolean areAllCharsUnique(String incomingStr) {

        checkStringLength(incomingStr.length(), EXTENDED_ASCII_LENGTH);

        boolean result = true;
        boolean[] bitVector = new boolean[EXTENDED_ASCII_LENGTH];
        for (Character stringChar : incomingStr.toCharArray()) {
            checkStringLength(stringChar, EXTENDED_ASCII_LENGTH - 1);
            if (bitVector[stringChar]) {
                result = false;
                break;
            } else {
                bitVector[stringChar] = true;
            }
        }
        return result;
    }

}

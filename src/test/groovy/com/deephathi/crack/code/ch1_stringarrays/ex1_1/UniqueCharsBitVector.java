package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

/**
 * Thi class does a health assumption that the charset being used is a EXTENDED_ASCII with the length of 256. For unicode strings,
 * this program will not work.
 */
public class UniqueCharsBitVector implements UniqueChars {
    private static final int EXTENDED_ASCII_LENGTH = 256;

    @Override
    public boolean areAllCharsUnique(String incomingStr) {

        if(incomingStr.length() > EXTENDED_ASCII_LENGTH) {
            throw new UnsupportedOperationException("this method does not support not extended ascii string");
        }

        boolean result = true;
        boolean[] bitVector = new boolean[EXTENDED_ASCII_LENGTH];
        for (Character stringChar : incomingStr.toCharArray()) {
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

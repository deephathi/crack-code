package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

/**
 * This class works for string containing lower case a to z
 */
public class UniqueCharsBitVector extends AbstractUniqueChars {
    @Override
    public boolean areAllCharsUnique(String incomingStr) {

        boolean result = true;
        int checker = 0;

        for (char strChar : incomingStr.toCharArray()) {

            checkCharLowerCase(strChar);
            int index = strChar - 'a';
            int place = 1 << index;
            if ((checker &  place) > 0) {
                result = false;
                break;
            } else {
                checker |= place;
            }
        }

        return result;
    }

    private void checkCharLowerCase(char strChar) {
        if (strChar < 97|| strChar > 122) {
            throw new UnsupportedOperationException("Only lowercase a to z are supported");
        }
    }

}

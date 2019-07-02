package com.deephathi.crack.code.ch1_stringarrays.ex1_3;

public class InPlaceCharArrSpaceEncodings extends AbstractSpaceEncodings {
    @Override
    public String encodeString(String str) {
        String trimmedString = str.trim();
        int orgLen = trimmedString.length();
        int spaceCount = calculateSpaceCount(trimmedString);

        int newLen = orgLen + (spaceCount * 2);

        char[] newCharArr = replaceInPlace(trimmedString, orgLen, newLen);

        return new String(newCharArr);

    }

    private char[] replaceInPlace(String trimmedString, int orgLen, int newLen) {
        char[] newCharArr = new char[newLen];
        for (int count = orgLen - 1; count >= 0; count--) {
            if (trimmedString.charAt(count) == ' ') {
                newCharArr[newLen - 1] = '0';
                newCharArr[newLen - 2] = '2';
                newCharArr[newLen - 3] = '%';
                newLen -= 3;
            } else {
                newCharArr[newLen - 1] = trimmedString.charAt(count);
                newLen -= 1;
            }
        }
        return newCharArr;
    }

    private int calculateSpaceCount(String str) {
        int spaceCount = 0;
        for (char strChar : str.toCharArray()) {
            if (strChar == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}

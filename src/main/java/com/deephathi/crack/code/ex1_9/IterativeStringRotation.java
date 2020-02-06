package com.deephathi.crack.code.ex1_9;

import java.util.Arrays;

public class IterativeStringRotation implements StringRotation {

    @Override
    public boolean isRotation(String org, String rotated) {
        if (org.length() != rotated.length()) {
            return false;
        }

        int len = org.length();
        int cutOffCount = -1;

        for (int orgCount = 0; orgCount < len; orgCount++) {
            for (int rotateCount = 0; rotateCount < len; rotateCount++) {
                if (orgCount < len && org.charAt(orgCount) == rotated.charAt(rotateCount)) {
                    cutOffCount = orgCount;
                    orgCount++;
                }
            }

        }

        if (cutOffCount != -1) {
            String leftPart = rotated.substring(cutOffCount);
            String rightPart = rotated.substring(0, cutOffCount);
            return iSubstring(org, leftPart + rightPart);
        }
        return false;
    }

    private static boolean iSubstring(String s1, String s2) {
        return s1.contains(s2);
    }
}

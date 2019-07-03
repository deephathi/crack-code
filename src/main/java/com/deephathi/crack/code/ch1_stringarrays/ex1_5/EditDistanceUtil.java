package com.deephathi.crack.code.ch1_stringarrays.ex1_5;

public class EditDistanceUtil {

    public boolean areEditAway(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.equals(str2)) {
            return true;
        }

        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        int editDistance = getEditDistance(str1, str2);


        return editDistance <= 1;

    }

    private int getEditDistance(String str1, String str2) {
        int editDistance = 0;

        int count1 = 0;
        int count2 = 0;

        int len1 = str1.length();
        int len2 = str2.length();

        while (count1 <  len1 && count2 < len2) {

            char str1Char = str1.charAt(count1);
            char str2Char = str2.charAt(count2);

            if (str1Char == str2Char) {
                count1++;
                count2++;
            } else {

                if (++editDistance > 1) {
                    break;
                }
                if (len1 < len2) {
                    count2++;
                } else if (len2 < len1) {
                    count1++;
                } else {
                    count1++;
                    count2++;
                }
            }
        }

        if (count1 < len1) {
            editDistance += updateEditDistance(str1, count1);
        }

        if (count2 < len2) {
            editDistance += updateEditDistance(str2, count2);
        }

        return editDistance;
    }

    private int updateEditDistance(String str, int count1) {
        String remaining = str.substring(count1);
        return remaining.length();
    }
}

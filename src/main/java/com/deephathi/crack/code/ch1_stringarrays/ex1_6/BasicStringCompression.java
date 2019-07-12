package com.deephathi.crack.code.ch1_stringarrays.ex1_6;

public class BasicStringCompression {

    public String compress(String str) {
        char prevChar = '\0';
        int prevCharCount = 0;
        StringBuilder strBuild = new StringBuilder();
        for (char strChar : str.toCharArray())  {
            if (prevChar == '\0') {
                prevChar = strChar;
                prevCharCount++;
            } else if(strChar == prevChar) {
                prevCharCount++;
            } else {
                strBuild.append(prevChar).append(prevCharCount);
                prevChar = strChar;
                prevCharCount = 1;
            }
        }
        strBuild.append(prevChar).append(prevCharCount);
        String result = strBuild.toString();
        return (str.length() <= result.length()) ? str : result;
    }

}

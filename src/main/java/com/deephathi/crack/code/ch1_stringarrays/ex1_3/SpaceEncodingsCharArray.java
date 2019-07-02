package com.deephathi.crack.code.ch1_stringarrays.ex1_3;

public class SpaceEncodingsCharArray extends AbstractSpaceEncodings {
    @Override
    public String encodeString(String str) {
        StringBuilder resultBuilder = new StringBuilder();
        for (Character strChar : str.trim().toCharArray()) {
            if(strChar.equals(' ')) {
                resultBuilder.append("%20");
            } else {
                resultBuilder.append(strChar);
            }
        }
        return resultBuilder.toString();
    }
}

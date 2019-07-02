package com.deephathi.crack.code.ch1_stringarrays.ex1_3;

public class SpaceEncodingsReplaceAll extends AbstractSpaceEncodings {
    @Override
    public String encodeString(String str) {
        return str.trim().replace(" ", "%20");
    }
}

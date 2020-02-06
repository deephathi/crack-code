package com.deephathi.crack.code.ex1_9;

public class ConcatStringRotation implements StringRotation {

    @Override
    public boolean isRotation(String org, String rotated) {
        String extendedRotated = rotated + rotated;
        return extendedRotated.contains(org);
    }
}

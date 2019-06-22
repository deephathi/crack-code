package com.deephathi.crack.code.ch1_stringarrays.ex1_1;

public abstract class AbstractUniqueChars implements UniqueChars {

    protected static final int EXTENDED_ASCII_LENGTH = 256;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    protected void checkStringLength(int length, int extendedAsciiLength) {
        if (length > extendedAsciiLength) {
            throw new UnsupportedOperationException("this method does not support not extended ascii string");
        }
    }
}

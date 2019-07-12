package com.deephathi.crack.code.ch1_stringarrays.ex1_6

import spock.lang.Specification

class BasicStringCompressionTest extends Specification {

    def "when a string has repeated characters, then repeasted characters should be replaced by numbers of times a character has repeated"() {

        setup:
        def stringCompression = new BasicStringCompression()

        when:
            def result = stringCompression.compress(str)

        then:

            result == cmpStr

        where:

            str           |  cmpStr
            "aabcccccaaa" | "a2b1c5a3"
            "aawqerccccdddeeeggggggg" | "a2w1q1e1r1c4d3e3g7"
            "aabcccccaaad" | "a2b1c5a3d1"

    }

    def "when the compressed string is not smalled than the original one, the the original string should be returned"() {
        setup:
        def stringCompression = new BasicStringCompression()

        when:
        def result = stringCompression.compress(str)

        then:

        result == cmpStr

        where:

        str    |  cmpStr
        "abcd" | "abcd"
        "aabbbcdefghi" | "aabbbcdefghi"
    }
}

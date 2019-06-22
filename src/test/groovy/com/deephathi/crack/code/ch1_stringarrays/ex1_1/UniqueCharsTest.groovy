package com.deephathi.crack.code.ch1_stringarrays.ex1_1

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class UniqueCharsTest extends Specification {

    def "when all characters are unique the all char unique method returns true with #uniqueCharImpl"() {
        setup:
            def uniqueCharsHashing = uniqueCharImpl
        when:
            def result = uniqueCharsHashing.areAllCharsUnique("asdfgh")

        then:
            result == true
        where:
        uniqueCharImpl             ||_
        new UniqueCharsHashing()   ||_
        new UniqueCharsBoolArray() ||_
        new UniqueCharsBitVector() ||_
        new UniqueCharsBitSet()    ||_

    }

    def "when all chars are not unique then the method would return false with #uniqueCharImpl"() {
        setup:
            def uniqueChars = uniqueCharImpl
        when:
        def result = uniqueChars.areAllCharsUnique("aqwerta")

        then:
            result == false
        where:
                uniqueCharImpl             ||_
                new UniqueCharsHashing()   ||_
                new UniqueCharsBoolArray() ||_
                new UniqueCharsBitVector() ||_
                new UniqueCharsBitSet()    ||_
    }
}

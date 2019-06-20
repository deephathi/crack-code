package com.deephathi.crack.code.ch1_stringarrays.ex1_1

import spock.lang.Specification

class UniqueCharsTest extends Specification {

    def "when all characters are unique the all char unique method returns true"() {
        setup:
            def uniqueCharsHashing = uniqueCharImpl
        when:
            def result = uniqueCharsHashing.areAllCharsUnique("asdfgh")

        then:
            result == true
        where:
        uniqueCharImpl               ||_
        new UniqueCharsHashing()     ||_
        new UniqueCharsBitVector()   ||_

    }

    def "when all chars are not unique then the method would return false"() {
        setup:
            def uniqueChars = uniqueCharImpl
        when:
        def result = uniqueChars.areAllCharsUnique("aqwerta");

        then:
            result == false
        where:
                uniqueCharImpl              ||_
                new UniqueCharsHashing()    ||_
                new UniqueCharsBitVector()  ||_
    }
}

package com.deephathi.crack.code.ex1_9

import spock.lang.Specification

class StringRotationTest extends Specification {

    def "test if second string a rotation of first"() {
        setup:
            String input1 = "waterbottle"
            String input2 = "erbottlewat"

        when:
            boolean result = new ConcatStringRotation().isRotation(input1, input2)

        then:
            result
    }
}

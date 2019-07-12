package com.deephathi.crack.code.ch1_stringarrays.ex1_5

import spock.lang.Specification
import spock.lang.Unroll

class OneEditDistanceUtilTest extends Specification {

    @Unroll
    def "checks whether two words are an edit away with #str1 and #str2 and result #rslt"() {

        setup:
            OneEditDistanceUtil editDistance = new OneEditDistanceUtil()

        when:
            def result = editDistance.areEditAway(str1, str2)

        then:
            result == rslt

        where:
            str1   | str2   | rslt
            "pale" | "ple"  | true
            "pales"| "pale" | true
            "pale" | "pales"| true
            "pale" | "bale" | true
            "pale" | "bake" | false

    }
}

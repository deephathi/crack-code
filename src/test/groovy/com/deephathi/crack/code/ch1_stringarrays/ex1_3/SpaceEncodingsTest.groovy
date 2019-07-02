package com.deephathi.crack.code.ch1_stringarrays.ex1_3

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class SpaceEncodingsTest extends Specification {

    def "returns an encoded string with %20 when the string has spaces in it with #spaceEncodingsImpl"() {
        setup:
            SpaceEncodings spaceEncodings = spaceEncodingsImpl

        when:
            def result = spaceEncodings.encodeString("Welcome to the future !!!        ")

        then:
            result == "Welcome%20to%20the%20future%20!!!"

        where:
            spaceEncodingsImpl             |_
            new SpaceEncodingsReplaceAll() |_
            new SpaceEncodingsCharArray()  |_
            new InPlaceCharArrSpaceEncodings() |_
    }
}

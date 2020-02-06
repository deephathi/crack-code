package com.deephathi.crack.code.ch1_stringarrays.ex1_8

import spock.lang.Specification

/**
 * Zero Matix : If an element is zero then its entire row and column should be zero
 */
class ZeroMatrixTest extends Specification {

    def "it sets rows and columns zero successfully"() {

        setup:
            ZeroMatrix zeroMatrix = new ZeroMatrix()
            int[][] intMat = [[1, 0, 3], [4, 7, 9], [0, 1, 2], [5, 0, 8]]
            int[][] expectedResult = [[0, 0, 0], [0, 0, 9], [0, 0, 0], [0, 0, 0]]
        when:
            zeroMatrix.setZeros(intMat);

        then:
            expectedResult == intMat

    }
}

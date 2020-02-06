package com.deephathi.crack.code.ch1_stringarrays.ex1_7

import spock.lang.Specification

/**
 * The question is 'Rotate a square matrix in place clockwise for this case for 90 degrees'
 */
class ClockwiseNintyDegreeMatrixRotationTest extends Specification {

    def "It rotates the image successfully"() {

        setup:
        int[][] arr = new int[3][3]
        arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        int[][] expectedRotatedArr = new int[3][3]
        RawMatrixRotation matrixRotation = new RawMatrixRotation();
        expectedRotatedArr = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

        when:
        int[][] rotatedArr = new OneByOneMatrixRotation().rotate(arr);

        then:
        expectedRotatedArr == rotatedArr
    }
}

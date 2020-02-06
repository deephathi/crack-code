package com.deephathi.crack.code.ch1_stringarrays.ex1_7;

public class OneByOneMatrixRotation implements MatrixRotation {
    @Override
    public int[][] rotate(int[][] intMat) {
        validateInputMatrix(intMat);


        int len = intMat.length;
        int rotateTimes = len/2;

        for (int rotatorCount = 0; rotatorCount < rotateTimes; rotatorCount++) {
            int begin = rotatorCount;
            int end = (len - 1) - rotatorCount;

            for (int arrCount = begin; arrCount < end; arrCount++) {
                int temp = intMat[begin][arrCount];
                intMat[begin][arrCount] = intMat[end - arrCount][begin];
                intMat[end - arrCount][begin] = intMat[end][end - arrCount];
                intMat[end][end - arrCount] = intMat[arrCount][end];
                intMat[arrCount][end] = temp;
            }
        }

        return intMat;
    }

    private void validateInputMatrix(int[][] intMat) {
        if (intMat.length != intMat[0].length) {
            throw new IllegalArgumentException("the matrix has to be square in order to be rotated in place");
        }
    }
}

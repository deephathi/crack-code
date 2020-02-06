package com.deephathi.crack.code.ch1_stringarrays.ex1_7;

public class RawMatrixRotation implements MatrixRotation {
    @Override
    public int[][] rotate(int[][] intMat) {
        int[][] resultMat = new int[intMat.length][intMat[0].length]; // this is not in place as we are creating a new matrix
        int rowLen = intMat.length;
        int colLen = intMat[0].length;


        for (int rowCount = 0, colCount = 0; rowCount < rowLen - 1 && colCount < colLen - 1; rowCount++, colCount++) {
            int minRow = rowCount;
            int maxRow = rowLen - 1 - rowCount;

            int minCol = colCount;
            int maxCol = colLen - 1 - colCount;

            for (int selectedCol = minRow; selectedCol <= maxRow; selectedCol++) {
                int index = intMat[minRow][selectedCol];
                resultMat[selectedCol][maxCol] = index;
            }

            for (int selectedRow = minCol; selectedRow <= maxCol; selectedRow++) {
                int index = intMat[selectedRow][maxCol];
                resultMat[maxRow][maxRow - selectedRow] = index;
            }

            for (int selectedCol = maxRow; selectedCol >= minRow; selectedCol--) {
                int index = intMat[maxRow][selectedCol];
                resultMat[selectedCol][minCol] = index;
            }

            for (int selectedRow = maxCol; selectedRow >= minCol; selectedRow--) {
                int index = intMat[selectedRow][minCol];
                resultMat[minRow][maxRow - selectedRow] = index;
            }
        }


        return resultMat;
    }
}

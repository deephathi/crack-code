package com.deephathi.crack.code.ch1_stringarrays.ex1_8;

public class ZeroMatrix {

    public void setZeros(int[][] zeroMatrix) {
        int[] rowKeeper = {-1, -1, -1};
        int[] colKeeper = {-1, -1, -1};

        updateRolColKeepers(zeroMatrix, rowKeeper, colKeeper);

        setRowsZeros(zeroMatrix, rowKeeper);

        setColsZeros(zeroMatrix, colKeeper);
    }

    private void updateRolColKeepers(int[][] zeroMatrix, int[] rowKeeper, int[] colKeeper) {
        int rowFillCount = 0;
        int colFillCount = 0;

        int rowLen = zeroMatrix.length;
        int colLen = zeroMatrix[0].length;

        for (int rows = 0; rows < rowLen; rows++) {
            for (int cols = 0; cols < colLen; cols++) {
                if (zeroMatrix[rows][cols] == 0) {
                    rowKeeper[rowFillCount++] = rows;
                    colKeeper[colFillCount++] = cols;
                }
            }
        }
    }

    private void setColsZeros(int[][] zeroMatrix, int[] colKeeper) {
        int rowLen = zeroMatrix.length;
        for (int colNum : colKeeper) {
            if (colNum == -1) {
                break;
            }
            for (int rows = 0; rows < rowLen; rows++) {
                zeroMatrix[rows][colNum] = 0;
            }
        }
    }

    private void setRowsZeros(int[][] zeroMatrix, int[] rowKeeper) {
        int colLen = zeroMatrix[0].length;
        for (int rowNum : rowKeeper) {
            if (rowNum == -1) {
                break;
            }
            for (int cols = 0; cols < colLen; cols++) {
                zeroMatrix[rowNum][cols] = 0;
            }
        }
    }
}

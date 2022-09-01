package com.example.matrixmultiplication;

public class MatrixMultiplication {
    private final Matrix matrix1;
    private final Matrix matrix2;
    private Matrix matrix3;


    public MatrixMultiplication(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = new Matrix(matrix1);
        this.matrix2 = new Matrix(matrix2);
        this.matrix3 = new Matrix(this.matrix1.getRow(), this.matrix2.getCol());
    }

    void matrixMultiplication() {
       if (matrix1.getCol() == matrix2.getRow()) {
           matrix3 = new Matrix(matrix1.getRow(), matrix2.getCol());
           for (int i = 0; i < matrix1.getRow(); i++) {
               for (int j = 0; j < matrix2.getCol(); j++) {
                   for (int k = 0; k < matrix1.getCol(); k++) {
                       matrix3.getMatrix()[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];
                   }
               }
           }
       }
    }

    void printMatrix() {
        for (int i = 0; i < matrix3.getRow(); i++) {
            for (int j = 0; j < matrix3.getCol(); j++) {
                System.out.print(matrix3.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
package com.example.matrixmultiplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix1 = setMatrix(in);
        int[][] matrix2 = setMatrix(in);

        MatrixMultiplication matrixMultiplication = new MatrixMultiplication(matrix1, matrix2);
        matrixMultiplication.matrixMultiplication();
        matrixMultiplication.printMatrix();
    }

    private static int[][] setMatrix(Scanner in) {
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

}

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
//    Program to multiply a matrix;
    public static int[][] inputMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = input.nextInt();
        System.out.print("Enter number of column : ");
        int column = input.nextInt();
        int[][]Matrix = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.printf("Enter element of row[%d] column[%d] : ",(i+1) , (j+1));
                Matrix[i][j] = input.nextInt();
            }
        }
        return Matrix;
    }
    public static void addMatrix(int[][]m1, int[][]m2){
        int count = 0;
        int [][]sumMatrix = new int[m1.length][m1[0].length];
        for(int i = 0 ; i < m1.length;i++){
            for(int j = 0;j< m1[0].length ; j++){
                sumMatrix[i][j] = m1[i][j]+ m2[i][j];
                count++;
            }
        }
        System.out.println("----------MATRIX ADDITION----------");
        printMatrix(sumMatrix);
        System.out.printf("Total number of addition are : %d",count);
    }
    public static void mulMatrix(int[][] A, int[][] B) {

        int r1 = A.length;        // rows of A
        int c1 = A[0].length;     // columns of A
        int r2 = B.length;        // rows of B
        int c2 = B[0].length;     // columns of B
        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix multiplication not possible.");
        }
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("-------------Matrix Multiplication-----------");
        printMatrix(result);
    }

    public static void printMatrix(int[][]m){
        for(int i = 0; i < m.length ; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][]m1 = inputMatrix();
        int[][]m2 = inputMatrix();
        addMatrix(m1,m2);
        mulMatrix(m1,m2);
    }
}
package assignment4;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row size for MatrixA: ");
		int rowsA=sc.nextInt();
		System.out.print("Enter column size for MatrixA: ");
		int colsA=sc.nextInt();
		System.out.print("Enter row size for MatrixB: ");
		int rowsB=sc.nextInt();
		System.out.print("Enter column size for MatrixB: ");
		int colsB=sc.nextInt();
		if(colsA!=rowsB) {
			System.out.println("Number of columns in A and number of rows B must be equal to do matrix multiplication");
		}
		int[][]matrixA=new int[rowsA][colsA];
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsA;j++) {
				System.out.print("Enter element at position ["+i+"]["+j+"]:");
				matrixA[i][j]=sc.nextInt();
			}
		}
		int[][]matrixB=new int[rowsB][colsB];
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<colsB;j++) {
				System.out.print("Enter element at position ["+i+"]["+j+"]:");
				matrixB[i][j]=sc.nextInt();
			}
		}
		int[][]resultMatrix=new int[rowsA][colsB];
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsB;j++) {
				for(int k=0;k<colsA;k++) {
					resultMatrix[i][j]+=matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		System.out.println("The MatrixA is:");
		for(int i=0;i<rowsA;i++) {
			for(int j=0;j<colsA;j++) {
				System.out.print(matrixA[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The MatrixB is:");
		for(int i=0;i<rowsB;i++) {
			for(int j=0;j<colsB;j++) {
				System.out.print(matrixB[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after Multiplication:");
		for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
	}

}

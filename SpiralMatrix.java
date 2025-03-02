package assignment4;
import java.util.Scanner;
public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Matrix:");
		int N=sc.nextInt();
		int[][] spiralMatrix=new int[N][N];
		int value=1;
		int topRow=0,bottomRow=N-1,leftCol=0,rightCol=N-1;
		while(topRow<=bottomRow && leftCol<=rightCol) {
			for(int i=leftCol;i<=rightCol;i++) {
				spiralMatrix[topRow][i]=value++;
			}
			topRow++;
			for(int i=topRow;i<=bottomRow;i++) {
				spiralMatrix[i][rightCol]=value++;
			}
			rightCol--;
			if(topRow<=bottomRow) {
				for(int i=rightCol;i>=leftCol;i--) {
					spiralMatrix[bottomRow][i]=value++;
				}
				bottomRow--;
			}
			if(leftCol<=rightCol) {
				for(int i=bottomRow;i>=topRow;i--) {
					spiralMatrix[i][leftCol]=value++;
				}
				leftCol++;
			}
		}
		System.out.println("Spiral Matrix:");
	    for (int i = 0; i < N; i++) {
	    	for (int j = 0; j < N; j++) {
	    		System.out.printf("%3d ", spiralMatrix[i][j]);
	        }
	        System.out.println();
	    }
	    sc.close();
	}

}

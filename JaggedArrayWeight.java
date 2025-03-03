package assignment4;
import java.util.Scanner;
public class JaggedArrayWeight {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the number of persons (N): ");
        int N = scanner.nextInt();
        int[][] weights = new int[N][];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int numWeights = scanner.nextInt();
            weights[i] = new int[numWeights];
        }
        enterWeights(weights, scanner);
        System.out.print("Enter the person number (1 to N) to find their minimum weight: ");
        int person = scanner.nextInt();
        int minWeight = findMinWeight(weights, person - 1); 
        System.out.println("Minimum weight of person " + person + " is: " + minWeight);
        scanner.close();
	}
	
	 public static void enterWeights(int[][] weights, Scanner scanner) {
	        for (int i = 0; i < weights.length; i++) {
	            System.out.println("Enter weights for person " + (i + 1) + ":");
	            for (int j = 0; j < weights[i].length; j++) {
	                System.out.print("Weight " + (j + 1) + ": ");
	                weights[i][j] = scanner.nextInt();
	            }
	        }
	    }
	 public static int findMinWeight(int[][] weights, int personIndex) {
	        int minWeight = weights[personIndex][0];
	        for (int weight : weights[personIndex]) {
	            if (weight < minWeight) {
	                minWeight = weight;
	            }
	        }
	        return minWeight;
	    }

}

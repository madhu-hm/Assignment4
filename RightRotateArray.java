package assignment4;
import java.util.Arrays;
import java.util.Scanner;
public class RightRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("arr["+i+"] =");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the number of positions to rotate:");
		int position=sc.nextInt();
		if(position>size) {				//to handle edge cases
			position=position%size;
		}
		int[]rotatedArray=new int[size];
		for(int i=0;i<size;i++) {
			rotatedArray[(i+position)%size]=arr[i];
		}
		System.out.println("Rotated Array");
		System.out.print(Arrays.toString(rotatedArray));
		sc.close();
	}

}

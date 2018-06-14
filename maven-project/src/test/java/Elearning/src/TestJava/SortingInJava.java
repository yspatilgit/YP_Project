package TestJava;

import java.util.Arrays;

public class SortingInJava {
	private static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0 ;
		for (int i=0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				if (arr[j-1]> arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int array[] = {9, -5, 7, 0, -6, -4, 3};
		System.out.println("Before ");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		bubbleSort(array);
		System.out.println("After ");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		
	}	

}

/**	
//Array sort program	
public static void main(String[] args) {
	int array[] = {2, -2, 0, 7, 3};
	Arrays.sort(array);	
	int index = Arrays.binarySearch(array, 7);
	printArray("Sorted array", array);	
	System.out.println("found 7 @ "+ index );
}

private static void printArray(String message, int array[]) {
	System.out.println(message + ": [length: " + array.length + "]");
	
	for(int i=0; i<array.length; i++) {
		if (i != 0) {
			System.out.print(", ");
		}
		System.out.print(array[i]);
	}
		System.out.println();
}
**/
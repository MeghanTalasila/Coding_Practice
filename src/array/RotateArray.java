package array;

import java.util.Scanner;

/**
 * 
 * @author Madhu Meghana Talasila
 * Description: Rotate an array f n elements to the right by k steps
 * 
 * For example wit n=7 and k=3 the array [1 2 3 4 5 6 7] is rotated to [5 6 7 1 2 3 4]
 * 
 * Solution: Reverse
 */
public class RotateArray {
	public static void main(String args[]){
		int k = 3;
		int[] arr = {1, 2, 3, 4, 5};
		arr = rotateArray(arr, k);
		
		System.out.println("");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static int[] rotateArray(int[] arr, int k) {
		int length = arr.length;
		if(length==0 || length==1)
			return arr;
		
		int rotateLength = k%length;
		
		arr = reverse(arr, 0, length-rotateLength);
		arr = reverse(arr, length-rotateLength, length);
		arr = reverse(arr, 0, length);
		
		return arr;		
	}

	private static int[] reverse(int[] arr, int start, int end) {
		int i = start;
		int j = end-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		return arr;
	}
}

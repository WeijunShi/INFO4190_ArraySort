
import java.io.*;
import java.util.*;
//student name: Weijun Shi
//Id: 100408663
//INFO4190

public class InsertionSortExercise {
	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		InsertionSort.insertionSort(arr1);// sorting array using insertion sort

		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}

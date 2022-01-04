package Sort;

import java.io.*;

public class SelectionSorting {

	/*
	 * Reads a file with integers and creates an array.
	 * Returns an array comprising of integers from the file read.
	 * 
	 * @precondition  file consists data of type int.
	 * @param file  A file that consists of integers.
	 * @param aSize  The size of the array that needs to be created.
	 * @throws IOException  
	 * @throws FileNotFoundException  if file is not found.
	 * @return  an array of type int.
	 */
	public int[] ReadFile(File file, int aSize) throws IOException {
		int[] array = new int[aSize];
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				for (int counter = 0; counter < aSize; counter++) {
					array[counter] = Integer.parseInt(br.readLine());
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return array;
	}

	/*
	 * Sorts the given array using selection sort method.
	 * finds the largest element in the array and moves that item to the end of the array,
	 * i.e. makes it the (n-1)th element in the array where n is the length of the array.
	 * repeats process until array is sorted.
	 * prints "Array Sorted by Selection Sort!!!" after method is executed.
	 * 
	 * @param a  array of randomly sorted integers
	 * @param n  size of array.
	 */
	public void selectionSort(int[] a, int n) {
		for (int i = n - 1; i >= 1; i--) {
			int max = i;
			for (int j = 0; j < i; j++) {
				if (a[j] >= a[max]) {
					max = j;
				}
				swap(a, i, max);
			}
		}
		System.out.println("Array Sorted by Selection Sort!!!");
	}

	/*
	 * Swaps array elements between two array indices.
	 * 
	 * @param a  array whose elements need to be swapped at specified indices.
	 * @param i  first index at which the element needs to be swapped.
	 * @param j  second index at which the element needs to be swapped.
	 */
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	/*
	 * Prints the given array's elements horizontally.
	 * 
	 * @param a  an array that needs to be printed.
	 */
	public void printArray(int[] a) {

		System.out.println("This is the array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

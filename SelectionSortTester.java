package Sort;

import java.io.File;
import java.io.IOException;

public class SelectionSortTester {

	/*
	 * create new instance of SelectionSorting
	 * read a file with data of type int and pass into array.
	 * sort the data and print sorted array.
	 */
	public static void main(String[] args) throws IOException {
		SelectionSorting sS = new SelectionSorting();
		File file = new File(
				"C:\\Users\\taran\\Desktop\\CS146\\HW2 - Iterataive sorting\\SelectionSorter\\bin\\arr2-1.txt");
		int[] SSarr = sS.ReadFile(file, 50);
		sS.selectionSort(SSarr, 50);
		sS.printArray(SSarr);
	}
}

package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 16, 14, 8, 7, 2, 4, 10, 9, 3, 1 };
		quickSort(array, 0, array.length-1 );
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int med = partition(array, start, end);
			quickSort(array, start, med - 1);
			quickSort(array, med + 1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int x = array[end];
		int j = start;
		for (int i = start; i <end; i++) {
			if (array[i] <= x) {
				swap(array, i, j);
				j++;
			}
		}
		swap(array, j, end);
		return j;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}

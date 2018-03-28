package sort;
/**
 * 
 * @author JayMining
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int [] array= {16,14,8,7,2,4,10,9,3,1};
		//int [] array= {};
		heapSort(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	/**
	 * 堆排序
	 * @param array
	 */
	private static void heapSort(int[] array) {
		if(array==null) {
			return;
		}
		buildHeap(array);
		int heapsize=array.length;
		for(int i=array.length;i>=1;i--) {
			swap(array, i-1, 0);
			heapsize--;
			maxHeap(array, 0, heapsize);
		}
	}
	/**
	 * 建立大根堆
	 * @param array
	 */
	private static void buildHeap(int[] array) {
		int med=array.length/2;
		for(;med>0;med--) {
			maxHeap(array,med-1,array.length);
		}
	}
	/**
	 * 维护堆的性质
	 * @param array
	 * @param med
	 */
	private static void maxHeap(int[] array, int med,int heapsize) {
		int l=2*med+1;
		int r=2*med+2;
		int largest;
		if(l<heapsize && array[l]>array[med] ) {
			largest=l;
		}else {
			largest=med;
		}
		if(r<heapsize && array[r]>array[largest] ) {
			largest=r;
		}
		if(largest!=med) {
			swap(array,med,largest);
			maxHeap(array, largest,heapsize);
		}
	}

	private static void swap(int[] array, int med, int largest) {
		int temp=array[med];
		array[med]=array[largest];
		array[largest]=temp;
	}

}

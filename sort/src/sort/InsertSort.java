package sort;
/**
 * 
 * @author JayMining
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int [] array= {4,2,1};
		insertsort(array);
		printArray(array);
	}
	public static void insertsort(int [] array) {
		int len=array.length;
		for(int i=1;i<len;i++) {
			int j;
			int temp=array[i];
			for(j=i-1;(j>=0)&&(array[j]>temp);j--) {
				array[j+1]=array[j];
			}
			array[j+1]=temp;
		}
	}
	public static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}

package sort;

public class MergeSort {
	public static void main(String[] args) {
		int [] array= {3,1};
		mergeSort(array, 0, array.length-1);
		InsertSort.printArray(array);
	}

	public static void mergeSort(int[] array, int p, int r) {
		if(r<0) {
			return;
		}
		int medium = (p + r) / 2;
		if (p!=r) {
			mergeSort(array, p, medium);
			mergeSort(array, medium + 1, r);
			merge(array, p, medium, r);
		}
	}

	private static void merge(int[] array, int p, int medium, int r) {
		int prelen=medium-p+1;
		int postlen=r-medium;
		int len=r-p+1;
		int [] pre=new int[prelen+1]; 
		int [] post =new int[postlen+1];
		for(int i=0;i<prelen;i++) {
			pre[i]=array[p+i];
		}
		pre[prelen]=Integer.MAX_VALUE;
		for(int j=0;j<postlen;j++) {
			post[j]=array[medium+1+j];
		}
		post[postlen]=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		for(int k=0;k<len;k++) {
			if(pre[i]<post[j]) {
				array[p+k]=pre[i];
				i++;
			}
			if(pre[i]>post[j]) {
				array[p+k]=post[j];
				j++;
			}
		}
	}
}

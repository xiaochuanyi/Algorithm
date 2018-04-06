package sort;

public class heapsort {
	public static void heap(int[] arr){
		if(arr == null || arr.length < 2){
			return;
		}
		for(int i = 0;i < arr.length;i++){//使得数组成为一个大根堆
			heapinsert(arr,i);
		}
		int size = arr.length;
		swapnumber(arr, 0,--size );
		while(size > 0){//每次把大根堆最大的值跟数组的最后一个值交换，然后长度减一，再使得变化后的数组成为一个大根堆
			heapfy(arr,0,size);
			swapnumber(arr, 0, --size);
		}
	}
	public static void heapinsert(int[] arr,int i){
		while(arr[i] < arr[(i-1)/2]){
			swapnumber(arr, i,(i-1)/2);
			i = (i-1)/2;
		}
	}
	public static void heapfy(int[] arr,int i,int size){//使得把最大的数交换到数组最后的堆再变为大根堆
		int l = i*2 + 1;
		while(l < size){
			int	largest = l + 1 < size && arr[l+1] > arr[l] ? l+1:l;//如果有右孩子，那么下标为左右孩子大的哪一个
			largest = arr[largest] > arr[i] ? largest : i;
			if(largest == i){
				break;
			}
			swapnumber(arr, i, largest);
			i = largest;
			l = i*2 + 1;
		}
		 
	}
	public static void swapnumber(int arr[],int a,int b){
		if(a!=b){
			arr[a] = arr[a]^arr[b];
			arr[b] = arr[a]^arr[b];
			arr[a] = arr[a]^arr[b];			
		}
	}
}

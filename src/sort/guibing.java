package sort;
/*
 * 归并排序
 */
public class guibing {
	public static void mergesort(int[] arr){
		if(arr==null||arr.length < 2){
			return;
		}
		mergesort(arr,0,arr.length-1);
	}
	/*
	 * 递归函数
	 */
	public static void mergesort(int[] arr,int L,int R){
		if(L==R){
			return;
		}
		int mid = (L+R)/2;
		mergesort(arr,L,mid);
		mergesort(arr,mid+1,R);
		merge(arr,L,mid,R);
	}
	/*
	 * 使用外排，对两个已经有序的数组合并使其有序
	 */
	public static void merge(int[] arr,int L,int mid,int R){
		int[] help = new int[R-L+1];
		int i = 0;
		int p1=L;
		int p2=mid+1;
		while(p1 <= mid&&p2 <= R){
			help[i++] = arr[p1]>arr[p2]?arr[p1++]:arr[p2++];//外排算法
		}
		while(p1 <= mid){
			help[i++] = arr[p1++];//在外排指向的越界之后，把之后还未放入help数组的有序的值放入help中
		}
		while(p2 <= R){
			help[i++] = arr[p2++];//在外排指向的越界之后，把之后还未放入help数组的有序的值放入help中
		}
		for(i = 0;i < help.length;i++){//将合并后的有序数组放回arr数组中
			arr[L+i] =help[i];
		}
	}
}

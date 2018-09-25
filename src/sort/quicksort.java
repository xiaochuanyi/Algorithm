package sort;
public class quicksort {
	public static void quicksort(int[] arr){
		 quick(arr,0,arr.length-1);
	}
	public static void quick(int[] arr,int l,int r){//递归主函数
		if(l<r){
		int curr = Math.random() * (r - l + 1) + l;
		int[] help = partition(arr,curr,r);
		quick(arr,l,help[0]-1);
		quick(arr,help[1]+1,r);
			}
		}
	public static int[] partition(int[] arr,int l,int r){//把小于数组最右那个数的数放在左边，大于放右边
		int index = l;
		int less = l-1;
		int more = r;
		while(index < more){
			if(arr[index] < arr[r]){
				swapnumber(arr,index++,++less);
			}else if(arr[index] > arr[r]){
				swapnumber(arr,--more,index);
			}else{
				index++;
			}
		}
		swapnumber(arr, more, r);//因为数组最右的数一直没动，所以放完了会把它和大于它的数组的最左的一个数交换
		return new int[] {less+1,more};
		 
	}
	public static void swapnumber(int arr[],int a,int b){
		if(a!=b){
			arr[a] = arr[a]^arr[b];
			arr[b] = arr[a]^arr[b];
			arr[a] = arr[a]^arr[b];			
		}
	}
}

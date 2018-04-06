package sort;
public class quicksort {
	public static void quicksort(int[] arr){
		 quick(arr,0,arr.length-1);
	}
	public static void quick(int[] arr,int l,int r){//�ݹ�������
		if(l<r){
		swapnumber(arr, r,(int)(arr.length *Math.random()));
		int[] help = partition(arr,l,r);
		quick(arr,l,help[0]-1);
		quick(arr,help[1]+1,r);
			}
		}
	public static int[] partition(int[] arr,int l,int r){//��С�����������Ǹ�������������ߣ����ڷ��ұ�
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
		swapnumber(arr, more, r);//��Ϊ�������ҵ���һֱû�������Է����˻�����ʹ�����������������һ��������
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

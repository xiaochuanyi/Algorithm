package sort;

public class heapsort {
	public static void heap(int[] arr){
		if(arr == null || arr.length < 2){
			return;
		}
		for(int i = 0;i < arr.length;i++){//ʹ�������Ϊһ�������
			heapinsert(arr,i);
		}
		int size = arr.length;
		swapnumber(arr, 0,--size );
		while(size > 0){//ÿ�ΰѴ��������ֵ����������һ��ֵ������Ȼ�󳤶ȼ�һ����ʹ�ñ仯��������Ϊһ�������
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
	public static void heapfy(int[] arr,int i,int size){//ʹ�ð��������������������Ķ��ٱ�Ϊ�����
		int l = i*2 + 1;
		while(l < size){
			int	largest = l + 1 < size && arr[l+1] > arr[l] ? l+1:l;//������Һ��ӣ���ô�±�Ϊ���Һ��Ӵ����һ��
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

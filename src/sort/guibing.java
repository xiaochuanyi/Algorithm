package sort;
/*
 * �鲢����
 */
public class guibing {
	public static void mergesort(int[] arr){
		if(arr==null||arr.length < 2){
			return;
		}
		mergesort(arr,0,arr.length-1);
	}
	/*
	 * �ݹ麯��
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
	 * ʹ�����ţ��������Ѿ����������ϲ�ʹ������
	 */
	public static void merge(int[] arr,int L,int mid,int R){
		int[] help = new int[R-L+1];
		int i = 0;
		int p1=L;
		int p2=mid+1;
		while(p1 <= mid&&p2 <= R){
			help[i++] = arr[p1]>arr[p2]?arr[p1++]:arr[p2++];//�����㷨
		}
		while(p1 <= mid){
			help[i++] = arr[p1++];//������ָ���Խ��֮�󣬰�֮��δ����help����������ֵ����help��
		}
		while(p2 <= R){
			help[i++] = arr[p2++];//������ָ���Խ��֮�󣬰�֮��δ����help����������ֵ����help��
		}
		for(i = 0;i < help.length;i++){//���ϲ������������Ż�arr������
			arr[L+i] =help[i];
		}
	}
}

package smallsum;
/*
 * ��С��
 */
public class smallsum {
	public static int mergesort(int[] arr,int l,int r){
		if(l==r){
			return 0;
		}
		int mid = l +((r-l)>>1);//�����ͬ��(l+r)/2,Ϊ�˷�ֹl+r������ȣ����Բ���l+(r-l)/2.��(r-l)/2���൱��r-l����һλ
		return mergesort(arr,l,mid)+mergesort(arr,mid+1,r)+merge(arr,l,mid,r);
	}
	public static int merge(int[] arr,int l,int mid,int r){
		int p1 = l;
		int p2 = mid+1;
		int count = 0;
		int i = 0;
		int[] help = new int[r-l+1];
		while(p1 <= mid && p2 <= r){
			count += arr[p1] < arr[p2] ? (r-p2+1)*arr[p1]:0;
			help[i++] = arr[p1] < arr[p2] ? arr[p1++]:arr[p2++];
		}
		while(p1 <= mid){
			help[i++] = arr[p1++];
		}
		while(p2 <= r){
			help[i++] = arr[p2++];
		}
		for(i = 0;i <help.length;i++){
			arr[l+i] = help[i];
		}
		return count;
		
	}
}

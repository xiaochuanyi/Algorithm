package sort;

public class swap {
	/*
	 * ^������� a=a���b
	 * �ڶ���ʱ����b=bȥ���a����ʱa=a���b��ô����b���a���b�͵���a
	 * ������ʱ��a���ǵ���a���b����ô����������a���b�����b����a
	 * ��ɽ�������
	 */
	public static void swapnumber(int arr[],int a,int b){
		if(a!=b){
			arr[a] = arr[a]^arr[b];
			arr[b] = arr[a]^arr[b];
			arr[a] = arr[a]^arr[b];			
		}
	}
	
}

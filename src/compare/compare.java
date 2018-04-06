package compare;

import java.util.Arrays;

import sort.insert;
/*
 * �Ƚ���
 */
public class compare {
	/*
	 * ����һ�����������ֵ���������
	 */
	public static int[] getrandom(int maxsize,int maxvalue){
		//����һ���������Ϊmaxsize������
		int[] arr = new int[(int) ((maxsize+1)*Math.random())];
		for(int i = 0;i < arr.length ;i++){
			//�����鸳ֵ������ֵΪ-maxvalue��+maxvalue
			arr[i] = (int) ((maxvalue+1)*Math.random());
		}
		return arr;
		
	}
	/*
	 * �ж������Ƿ���ȫ��ͬ�ķ���
	 */
	public static boolean isEqual(int arr1[],int arr2[] ){
		if((arr1==null&&arr2!=null) ||(arr1!=null&&arr2==null)){
			return false;
		}
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i=0;i < arr1.length;i++){
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;		
	}
	public static int[]  copy(int[] arr1){
		if(arr1==null){
			return null;
		}
		int[] arr2 =new int[arr1.length];
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
		return arr2;
	}
	/*
	 * ��������ͨ��һ��һ��������ȷ�ķ�����һ�����Է�����������Ƚϣ���αȽ��Դﵽ����Ŀ��
	 */
	public static void  compare(){
		int testTime = 100;
		int maxsize = 100;
		int maxvalue = 100;
		boolean success = true;
		insert in = new insert();
		for(int i = 0;i < testTime;i++){
			int[] arr1  = getrandom(maxsize, maxvalue);
			int[] arr2 = copy(arr1);
			Arrays.sort(arr1);
			in.insert(arr2,arr2.length);
			if(!isEqual(arr1, arr2)){
				success = false;
				for(int x = 0;x < arr1.length;x++){
					System.out.println(arr1[x]+","+arr2[x]);
				}
				break;
			}
		}
		System.out.println(success);
	}
}

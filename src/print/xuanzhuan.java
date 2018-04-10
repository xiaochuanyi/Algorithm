package print;
/*
 * ʵ��һ��������ת
 */
public class xuanzhuan {
	public static void print(int[][] arr){
		int tr = 0;
		int tc = 0;
		//���Ͻǵ�����
		int dr = arr.length-1;
		int dc = arr[0].length-1;
		//���½ǵ�����
		while(tr < dr){
			printdge(arr,tr++,tc++,dr--,dc--);
		}
	}
/*
 * ÿ����תһȦ����ת������Ȧ�����
 */
	private static void printdge(int[][] arr,int tr,int tc,int dr,int dc) {
		int times = dc -tc;//һ���ж��ٸ���������ת�������ȥһ�����ĸ���
		int temp = 0;
		for(int i = 0; i != times;i++){
			//ʵ�ֽ���
			temp = arr[tr][tc + i];
			arr[tr][tc + i] = arr[dr-i][tc] ;
			arr[dr-i][tc] = arr[dr][dc - i];
			arr[dr][dc - i] = arr[tr + i][tc];
			 arr[tr + i][tc] = temp;
		}
		
	}
}

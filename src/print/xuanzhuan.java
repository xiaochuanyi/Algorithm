package print;
/*
 * 实现一个数组旋转
 */
public class xuanzhuan {
	public static void print(int[][] arr){
		int tr = 0;
		int tc = 0;
		//左上角的坐标
		int dr = arr.length-1;
		int dc = arr[0].length-1;
		//右下角的坐标
		while(tr < dr){
			printdge(arr,tr++,tc++,dr--,dc--);
		}
	}
/*
 * 每次旋转一圈，旋转完所有圈即完成
 */
	private static void printdge(int[][] arr,int tr,int tc,int dr,int dc) {
		int times = dc -tc;//一行有多少个数，则旋转这个数减去一的数的个数
		int temp = 0;
		for(int i = 0; i != times;i++){
			//实现交换
			temp = arr[tr][tc + i];
			arr[tr][tc + i] = arr[dr-i][tc] ;
			arr[dr-i][tc] = arr[dr][dc - i];
			arr[dr][dc - i] = arr[tr + i][tc];
			 arr[tr + i][tc] = temp;
		}
		
	}
}

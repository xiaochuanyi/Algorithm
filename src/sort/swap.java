package sort;

public class swap {
	/*
	 * ^代表异或 a=a异或b
	 * 第二步时就是b=b去异或a，此时a=a异或b那么久是b异或a异或b就等于a
	 * 第三步时，a还是等于a异或b，那么第三步就是a异或b再异或b就是a
	 * 完成交换功能
	 */
	public static void swapnumber(int arr[],int a,int b){
		if(a!=b){
			arr[a] = arr[a]^arr[b];
			arr[b] = arr[a]^arr[b];
			arr[a] = arr[a]^arr[b];			
		}
	}
	
}

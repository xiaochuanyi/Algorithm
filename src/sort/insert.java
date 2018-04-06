package sort;
/*
 * ²åÈëÅÅĞò
 */
public class insert {
	public int[] insert(int[] arr,int length){
		if(arr==null||arr.length < 2){
			return arr;
		}
		for(int i=1;i<length;i++){
			for(int j = i-1; j>=0&&arr[j]>arr[j+1];j-- ){
					swap.swapnumber(arr, j,j+1);
			}
		}
		return arr;
		
	}
}

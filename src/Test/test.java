package Test;

import org.junit.Test;

import print.xuanzhuanprint;

public class test {
	@Test
	public void test1(){
		int arr[][] = new int[3][3];
		for(int i = 0; i <= 2;i++){
			for(int x = 0; x <= 2;x++){
				arr[i][x] = i;
			}
		}
		xuanzhuanprint x = new xuanzhuanprint();
		x.print(arr);
	}
}

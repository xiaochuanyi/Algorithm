package src.swapmethod;

import org.junit.Test;

import sort.heapsort;

public class test {
	@Test
	public void test(){
		int arr[] = {1,2,4,3};
		heapsort.heap(arr);
		for(int a : arr){
			System.out.println(a);
		}
		
	}
}

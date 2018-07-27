package Test;

import sort.guibing;
import sort.quicksort;

public class Test12 {
	public static void main(String[] args) {
		int arr[] = {2,5,6,10,8,5,9,3,7};
		guibing.mergesort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

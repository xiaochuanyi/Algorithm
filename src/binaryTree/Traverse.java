package binaryTree;
/**
 * 二叉树的先序，中序，后序遍历递归算法
 * @author xiaoyi
 *
 */
public class Traverse {
	/**
	 * 二叉树的先序遍历递归算法
	 * @param head
	 */
	public static void preOrderRecur(Node head){
		if(head == null){
			return;
		}
		System.out.println(head.value +"");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	/**
	 * 中序遍历递归
	 * @param head
	 */
	public static void inOrderRecur(Node head){
		if(head == null){
			return;
		}
		inOrderRecur(head.left);
		System.out.println(head.value +"");
		inOrderRecur(head.right);
	}
	/**
	 * 后序遍历递归
	 * @param head
	 */
	public static void posOrderRecur(Node head){
		if(head == null){
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.println(head.value +"");
	}
}

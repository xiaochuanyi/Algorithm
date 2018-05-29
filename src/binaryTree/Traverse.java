package binaryTree;

import java.util.Stack;

/**
 * 二叉树的先序，中序，后序遍历递归算法和非递归算法
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
	/**
	 * 前序遍历非递归
	 */
	public static void preOrderUnrecur(Node head){
		if(head != null){
			Stack<Node> stack = new Stack<Node>();
			stack.push(head);
			while( !stack.isEmpty()){
				head = stack.pop();
				System.out.println(head.value + "");
				if(head.right != null){
					stack.push(head.right);
				}
				if(head.left != null){
					stack.push(head.left);
				}
			}
		}
	}
	/**
	 * 中序遍历非递归
	 * @param head
	 */
	public static void inOrderUnrecur(Node head){
		if(head != null){
			Stack<Node> stack = new Stack<Node>();
			while(!stack.isEmpty() || head != null){
				if(head != null){
					stack.push(head);
					head = head.left;
				}
				else{
					head = stack.pop();
					System.out.println(head.value + "");
					head = head.right;
				}
			}
		}
	}
	/**
	 * 非递归后序遍历,顺序是左右中，和中右左是相反的
	 * 那么用栈压入左右中，然后再打印时放入另一个栈中，再依次弹出就是后序的了
	 * @param head
	 */
	public static void posOrderUnrecur(Node head){
		if(head != null){
			Stack<Node> stack = new Stack<Node>();
			Stack<Node> stack1 = new Stack<Node>();
			stack.push(head);
			while(!stack.isEmpty()){
				head = stack.pop();
				stack1.push(head);
				if(head.left != null){
					stack.push(head.left);
				}
				if(head.right !=null){
					stack.push(head.right);
				}
			}
			while(!stack1.isEmpty()){
				head = stack1.pop();
				System.out.println(head.value + "");
			}
	}			
	}
}

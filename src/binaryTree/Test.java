package binaryTree;

public class Test {
	@org.junit.Test
	public void test1(){
	Node head = new Node(2);
	head.left = new Node(3);
	head.right = new Node(4);
	head.left.left = new Node(5);
	head.left.right = new Node(6);
	head.right.left = new Node(7);
	head.right.right = new Node(8);
	System.out.println("前序");
	Traverse.preOrderRecur(head);
	System.out.println("中序");
	Traverse.inOrderRecur(head);
	System.out.println("后序");
	Traverse.posOrderRecur(head);
	}
}

package ListNode;

import org.junit.Test;

/*
 * ·´×ªÁ´±í²âÊÔ
 */
public class NodeTest {
	@Test
	public void test(){
	Node node0 = new Node(5);
	Node node1 = new Node(6);
	Node node2 = new Node(7);
	Node node3 = new Node(8);
	node0.next = node1;
	node1.next = node2;
	node2.next = node3;
	node3.next = null;
	Node node = node0;
	while(node != null){
		System.out.println(node);
		node = node.next;
	}
	Node getnode = ReverseListNode.reverse(node0);
	while(getnode != null){
		System.out.println(getnode);
		getnode = getnode.next;
	}
	}
}

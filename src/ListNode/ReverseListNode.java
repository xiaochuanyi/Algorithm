package ListNode;

public class ReverseListNode {
	public static Node reverse(Node head){
		Node pnode = null;//��ǰ�ڵ��ǰһ���ڵ�
		Node node = head;//��ǰ�ڵ�
		Node anode = head.next;//��ǰ�ڵ�ĺ�һ���ڵ�
		if(head == null || head.next == null)
			return head;
		while(node.next != null){
			node.next = pnode;
			pnode = node;
			node = anode;
			anode = anode.next;
		}
		
		node.next = pnode;
		return node;
		
	}
}

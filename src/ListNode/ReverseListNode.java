package ListNode;

public class ReverseListNode {
	public static Node reverse(Node head){
		Node pnode = null;//当前节点的前一个节点
		Node node = head;//当前节点
		Node anode = head.next;//当前节点的后一个节点
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

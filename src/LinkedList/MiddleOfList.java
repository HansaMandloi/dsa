package LinkedList;

class LinkedNode {
	int val;
	LinkedNode next;

	LinkedNode(int x) {
		val = x;
		next = null;
	}
}
public class MiddleOfList {

	public static LinkedNode middleEle(LinkedNode head) {

		LinkedNode slow = head, fast = head;
		while(fast!=null) {
			if(fast.next == null) return slow;
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow;
	}
	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(10);
		LinkedNode second = new LinkedNode(10);
		LinkedNode third = new LinkedNode(10);
		LinkedNode fourth = new LinkedNode(10);
		LinkedNode fifth = new LinkedNode(40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		LinkedNode res = middleEle(head);
		System.out.println(res.val);
	}
}

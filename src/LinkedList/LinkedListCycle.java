package LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {

		ListNode slow = head, fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(10);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
//		fourth.next = second;  //it Create Cycle
		fourth.next = null;
		
		System.out.println(hasCycle(head));
		

	}

}

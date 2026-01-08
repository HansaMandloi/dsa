package LinkedList;

class Node{
	int data;
	Node next;
	Node(int  data){
		this.data = data;
		this.next = null;
	}
}
public class InsertAtBeginning {

	static Node insertAtBeginning(Node head,int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		return newNode;
	}
	static void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Node head = null;
		head = insertAtBeginning(head, 10);
		head = insertAtBeginning(head, 20);
		head = insertAtBeginning(head, 30);
		printList(head);
		
		
		
		

	}

}

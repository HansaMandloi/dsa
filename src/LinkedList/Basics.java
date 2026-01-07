package LinkedList;

public class Basics {
	
	public static class Node{
		
		int data;     //value
		Node next;		//address of next node
		
		Node(int data)
		{
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(6);
		Node c = new Node(7);
		Node d = new Node(8);
		Node e = new Node(9);
		
		a.next = b;       //contain address of b          //a->b
		System.out.println(a.next = b);
		System.out.println(b);
		
		System.out.println(a.next.data);        // print 6 without b
		
		b.next = c;     //a->b->c
		c.next = d;       //a->b->c->d
		d.next = e;    //a->b->c->d->e
	}

}

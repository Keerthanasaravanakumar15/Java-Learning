class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class LinkedList{
	Node head=null;
	void insertbeg(int d) {
		Node newnode=new Node(d);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
		void display() {
//			System.out.println(head.data);
//			System.out.println(head.next.data);
//			System.out.println(head.next.next.data);
//			System.out.println(head.next.next.next.data);
			Node temp =head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
	}

}
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		obj.insertbeg(10);
		obj.insertbeg(20);
		obj.insertbeg(30);
		obj.insertbeg(40);
		obj.display();
	}

}


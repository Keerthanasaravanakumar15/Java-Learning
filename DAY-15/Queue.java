class nodes{
	int data;
	nodes next;
	nodes(int d) {
		data=d;
		next=null;
	}
}
class linkqueue{
	nodes head=null;
	void enqueue(int d) {
		nodes newnode = new nodes(d);
		if(head==null) {
			head=newnode;
		}
		else {
			nodes temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	void dequeue() {
		if(head==null) {
			System.out.println(-1);
			return;
		}
		head=head.next;
	}
	void peek() {
		if(head==null) {
			System.out.println("empty");
		}
	}
	void display() {
		nodes temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkqueue obj = new linkqueue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.display();
		System.out.println("----------------------------");
		obj.dequeue();
		obj.display();
	}

}


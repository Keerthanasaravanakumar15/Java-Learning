class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class stackkk{
	Node head = null;
	void push(int d) {
		Node newnode = new Node(d);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.next = head;
		}
	}
	void pop() {
		if(head==null) {
			System.out.println(-1);
			return;
		}
		else {
			head = head.next;
		}
	}
	void peek() {
		if(head==null) {
			System.out.println(-1);
			return;
		}
		System.out.println("Peek :"+head.data);
	}
	void isempty() {
		if(head==null) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
}
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackkk obj = new stackkk();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.display();
		System.out.println("_________________");
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.display();
		obj.peek();
		obj.isempty();
	}

}



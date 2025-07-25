class Nodes{
	int data;
	Nodes prev;
	Nodes next;
	Nodes(int d){
		data=d;
		prev=null;
		next=null;
	}
}
class doubly{
	Nodes head=null;
	void insertbeg(int d){
		Nodes newnode = new Nodes(d);
		if(head==null) {
			head = newnode;
		}
		else {
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	void display() {
		Nodes temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void reverse() {
		Nodes temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
}
public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly obj=new doubly();
		obj.insertbeg(10);
		obj.insertbeg(20);
		obj.reverse();
	}

}


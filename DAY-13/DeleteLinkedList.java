class number{
	int data;
	number next;
	number(int d){
		data=d;
		next=null;
	}
}
class DeleteList{
	number head=null;
	void insertbeg(int d) {
		number newnode=new number(d);
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
			number temp =head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
	}
		void delbeg() {
			if(head==null) {
				System.out.println("nothing");
				return;
			}
			head = head.next;
		}

}
public class DeleteLinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteList obj = new DeleteList();
		obj.insertbeg(10); 
		obj.insertbeg(20);
		obj.insertbeg(30);
		obj.insertbeg(40);
		obj.display();
		System.out.println("--------------------");
		obj.delbeg();
		obj.display();
	}

}



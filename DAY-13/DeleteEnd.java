class del{
	int data;
	del next;
	del(int d){
		data=d;
		next=null;
	}
}
class enddelete{
	del head = null;
	void endinsert(int n) {
		del newdig = new del(n);
		if(head==null) {
			head = newdig;
		}
		else {
			del temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next=newdig;
		}
	  }
	void view() {
		del temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void delete()
	{
		del temp = head;
		if(head==null) {
			System.out.println("empty");
			return;
		}
		else if(head.next==null) {
			head = null;
		}
		else {
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
}
public class DeleteEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enddelete obj = new enddelete();
		obj.endinsert(20);
		obj.endinsert(30);
		obj.view();
		
	}

}


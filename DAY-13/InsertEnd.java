class digit{
	int data;
	digit next;
	digit(int n){
		data =n;
		next =null;
	}
}
class endinsert{
	digit head = null;
	void insertend(int n) {
		digit newnum = new digit(n);
		if(head==null) {
			head = newnum;
		}
		else {
			digit temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next= newnum;
		}
	}
	void display() {
		digit temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
public class InsertEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		endinsert obj = new endinsert();
		obj.insertend(20);
		obj.insertend(30);
		obj.display();
	}

}


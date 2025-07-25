import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node(int n){
		data=n;
		next=null;
	}
}
class even{
	Node head=null;
	void insert(int n) {
		Node newnode = new Node(n);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	void evencheck() {
		Node temp = head;
		while(temp!=null) {
			if(temp.data%2==0) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}
}
public class EvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		even obj = new even();
		for(int i=0;i<size;i++) {
			obj.insert(sc.nextInt());
		}
		obj.evencheck();
	}

}


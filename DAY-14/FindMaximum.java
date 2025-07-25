import java.util.Scanner;
class node{
	int data; 
	node next;
	node(int n){
		data=n;
		next=null;
	}
}
class maximum{
	node head=null;
	void insertbeg(int n) {
		node newnode = new node(n);
		if(head==null) {
			head = newnode;	
		}
		else {
			newnode.next =head;
			head = newnode;
		}
		
	}
	void display() {
		node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void max() {
		int max=head.data;
		node temp = head.next;
		while(temp!=null) {
			if(max<temp.data) {
				max = temp.data;
			
			}
			temp = temp.next;
		}
		System.out.println(max);
	}
}
public class FindMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		maximum obj = new maximum();
		for(int i=0;i<size;i++) {
			obj.insertbeg(sc.nextInt());
		}
		obj.max();
	}

}


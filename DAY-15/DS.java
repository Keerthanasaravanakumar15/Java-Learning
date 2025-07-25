import java.util.Scanner;
class node{
	int data;
	node next;
	node(int n){
		data=n;
		next=null;
	}
}
class sumtwo{
	node head =null;
	void insert(int n) {
		node newnode = new node(n);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.next=head;
			head = newnode;
		}
	}
	void two(int num) {
		node temp=head;
		while(temp!=null) {
			node temp2 = head.next;
			while(temp2!=null) {
				if(temp.data+temp2.data==num) {
					System.out.println(temp.data+" "+temp2.data);
					return;
				}
				temp2 = temp2.next;
			}
			temp=temp.next;
	}
}
}
public class DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sumtwo obj = new sumtwo();
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			obj.insert(sc.nextInt());
		}
		System.out.println("enter num: ");
		int num = sc.nextInt();
		obj.two(num);
		}
	
	}




import java.util.Scanner;
class average{
	int data;
	average next;
	average(int n){
		data=n;
		next=null;
	}
}
class avg{
	average head=null;
	void sum(int n) {
		average newnode = new average(n);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	void add() {
		int add=head.data;
		int sum=0;
		int count=0;
		average temp = head;
		while(temp!=null) {
			sum += temp.data;
			count++;
			temp = temp.next;
			
		}
		System.out.println(sum/count);
		
	}
}
public class AverageSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		avg obj = new avg();
		for(int i=0;i<size;i++) {
			obj.sum(sc.nextInt());
		}
		obj.add();
	}

}


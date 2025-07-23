import java.util.Scanner;
public class CountZero {
	static void number(int a[],int size,int count) {
		for(int i=0; i<size;i++) {
			if(a[i]==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		number(a,size,0);
	}

}


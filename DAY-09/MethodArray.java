import java.util.Scanner;
public class MethodArray {
	static void number(int a[],int size) {
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		number(a,size);
	}

}

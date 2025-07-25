import java.util.Scanner;
public class ysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("---------------------------");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j && i<=j%2 || i+j==size-1) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

	
}


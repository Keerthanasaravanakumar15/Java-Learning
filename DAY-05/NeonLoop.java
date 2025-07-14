import java.util.Scanner;
public class NeonLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int size = sc.nextInt();
		int sq;
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
				sq=arr[i]*arr[i];
				int sum =0;
				while(sq>0)
				{
				sum=sum+sq%10;
				sq/=10;
				}
				if(arr[i]==sum) {
					System.out.println(arr[i]);
				}
		}
	}
}



import java.util.Scanner;
public class sumofthreefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum =0;
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(arr[i]%3==0 || arr[i]%5==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}


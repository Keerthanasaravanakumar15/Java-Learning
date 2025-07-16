import java.util.Scanner;
public class Diagnol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(),sum1=0,sum2=0;
		int a[][] = new int[row][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(i==j) {
					sum1 += a[i][j];
				}
			} //i+j==row-1
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(i+j==row-1) {
					sum2 += a[i][j];
				}
			}
	}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum1-sum2);
	}
}



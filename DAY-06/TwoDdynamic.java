import java.util.Scanner;
public class TwoDdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		int a[][] = new int[row][col];
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
			for(int i=1;i<=num2;i++) {
				int mul = num1*i;
				System.out.println(num1+"*"+i+"="+mul);
//			
		}
	}

}


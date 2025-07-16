import java.util.Scanner;
public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int a[][] = new int[row][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			if(i%2==0) {
				for(int j=0;j<row;j++) {
					System.out.print(a[i][j]+" ");
				}
			}
			else {
				for(int j=row-1;j>=0;j--) {
							System.out.print(a[i][j]+" ");
						}
					}
			System.out.println();
				}
		
			}
		
			
		

	

}


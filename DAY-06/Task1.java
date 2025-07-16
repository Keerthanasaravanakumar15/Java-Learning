import java.util.Scanner;

public class Task1 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(),total=0;
		int a[][] = new int[row][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				 total += a[i][j];
			}
		}
		System.out.println(total);
	}
	}


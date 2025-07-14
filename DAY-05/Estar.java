import java.util.Scanner;
public class Estar {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
//		E
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(j==0|| i==0||i==n-1||i==n/2) {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
		
		//F
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0||j==0||i==n/2||j==n-1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();	
//
//		}
		
		//A
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(j==0|| i==0||i==n/2) {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();	
//
//		}
		
		//SQUARE
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0||j==0||i==n-1||j==n-1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();	
//
//		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j || i+j==n-1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();	
//
//		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||i+j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();	

		}
	}
	
	
}

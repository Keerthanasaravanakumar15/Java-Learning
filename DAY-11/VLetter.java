import java.util.Scanner;
public class VLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num1 = size-2;
		int num2 = size-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<num2;j++) {
				if(i==j && i<=size || j+i==size+num1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}

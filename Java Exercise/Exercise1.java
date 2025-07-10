//Calculate total mark and average
import java.util.Scanner;
public class Exercise1 {
	public static void main(String...kee) {
		Scanner cal = new Scanner(System.in);
		System.out.print("Enter Tamil Mark : ");
		int tam = cal.nextInt();
		System.out.print("Enter English Mark : ");
		int eng = cal.nextInt();
		System.out.print("Enter Maths Mark : ");
		int mat = cal.nextInt();
		System.out.print("Enter Science Mark : ");
		int sci = cal.nextInt();
		System.out.print("Enter Social Mark : ");
		int soc = cal.nextInt();
		int total = tam + eng + mat+sci+soc;
		int avg = total/5;
		System.out.println("The Total of three mark is : "+total);
		System.out.println("The Average of three mark is : "+avg);
		System.out.print("The Grade is : ");
		System.out.print((avg >= 90 ) ? "A" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : "Fail");
		
	}
}

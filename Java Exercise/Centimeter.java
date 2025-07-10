
import java.util.Scanner;
//Meter to centimeter conversion 
public class Centimeter {
	public static void main(String...kee) {
		Scanner cal = new Scanner(System.in);
		System.out.print("Enter the value of meter : ");
		int meter = cal.nextInt();
		int centi = meter*100;
		System.out.println("Centimetr of "+meter+" meter is : "+centi+"cm");
	}
}

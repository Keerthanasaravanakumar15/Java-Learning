import java.util.Scanner;
public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a type of movie you want 1.Rom 2.Crime 3.Comedy 4.Action : ");
		int movie = sc.nextInt();
		if(movie == 1) {
			System.out.println("Watch OK Kanmani");
		}
		else if (movie == 2) {
			System.out.println("Watch Eleven");
		}
		else if (movie == 3) {
			System.out.println("Watch F.R.I.E.N.D.S");
		}
		else if (movie == 4) {
			System.out.println("Watch Vada Chennai");
		}
		else {
			System.out.println("Invalid Output");
		}
	}

}


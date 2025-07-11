import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter : ");
		char letter = sc.next().charAt(0);
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
		{
			System.out.println("The Entered Letter is Vowel");
		}
		else {
			System.out.println("The Entered Letter is Consonant");
		}

	}

}


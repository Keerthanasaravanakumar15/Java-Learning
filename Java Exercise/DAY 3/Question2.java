import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		//CONVERT UPPERCASE TO LOWERCASE WITHOUT PREDEFINED
		System.out.print("Enter a Letter in lower case : ");
		char letter = val.next().charAt(0);
		System.out.println((char)(letter-32));
		// CONVERT LOWERCASE TO UPPERCASE WITHOUT PREDEFINED
		System.out.print("Enter a Letter in upper case : ");
		char let = val.next().charAt(0);
		System.out.print((char)(let+32));
		//use "^" instead of + and - 
		
	}

}


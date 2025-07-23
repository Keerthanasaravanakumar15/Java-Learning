import java.util.Scanner;
class error extends Exception{
	error(String er){
		super (er);
	}
}
public class PalindromeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String reverse ="";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
			System.out.print(name.charAt(i));
		}
		System.out.println();
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			try {
				throw new error("This is not palindrome");
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
	}

}


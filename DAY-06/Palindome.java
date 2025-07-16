import java.util.Scanner;
public class Palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String reverse="";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse + name.charAt(i);
			System.out.print(name.charAt(i));
		}
		System.out.println();
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println(name +" is palindrome");
		}
		else {
			System.out.println(name +" is not palindrome");
		}
		
	}

}

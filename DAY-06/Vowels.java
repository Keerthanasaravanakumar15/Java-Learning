import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name = sc.nextLine();
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if((ch=='a') ||(ch=='e') ||(ch=='i') ||(ch=='o')||(ch=='u') || (ch=='A') ||(ch=='E') ||(ch=='I') ||(ch=='O')||(ch=='U')) {
				System.out.print(ch+" ");
			}
		}
	}

}


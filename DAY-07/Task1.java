import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		char ch[] = val.toCharArray();
		char letter = ch[0];
		//int num = Integer.parseInt(String.valueOf(ch[1]));
		int num = ch[1]-'0'; //ch = 5 -> 53 ; 0=48 ; 53-48=5
		for(int i=1;i<=num;i++) {
			System.out.print(letter);
		}
	}

}


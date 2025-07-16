import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		char ch[] = val.toCharArray();
		for(int i=1;i<ch.length;i+=2) {
			int digit = ch[i]-'0';
				for(int j=0;j<digit;j++) {
					System.out.print(ch[i-1]);
				}
		}
			
	}

}

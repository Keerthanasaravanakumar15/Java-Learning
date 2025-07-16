import java.util.Scanner;
public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char ch[] = word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='*';
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='*') {
				System.out.print(ch[i]);
			}
		}
		
	}

}

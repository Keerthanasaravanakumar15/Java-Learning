import java.util.Scanner;
public class RemoveNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char letter[] = word.toCharArray();
		for(int i=0;i<letter.length;i++) {
			if((letter[i]>48)&&(letter[i]<57)) {
				continue;
		}
			System.out.print(letter[i]);
		}
	}

}

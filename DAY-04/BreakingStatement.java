import java.util.Scanner;
public class BreakingStatement {
  public static void main(String[] args) {
		// Breaking Statement - Break,continue,return
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				continue;//Break; //return;
			}
			else {
				System.out.println(i);
			}
		}
	}
}

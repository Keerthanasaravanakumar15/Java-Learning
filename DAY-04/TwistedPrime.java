import java.util.Scanner;
public class TwistedPrime {

	public static void main(String[] args) {
		// Twisted Prime Number
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
			if(c==2) {
				int r=0;
				while(n>0) {
					r=r*10+n%10;
					n/=10;
				}
				c=0;
			  
				if(r%i==0) {
					c++;
				}
			  System.out.println((c==2)?"TPN":"NPN");
			}
			else {
				System.out.println("NPN");
			}
		}
		}
	}




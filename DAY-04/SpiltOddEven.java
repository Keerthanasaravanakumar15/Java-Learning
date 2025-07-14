import java.util.Scanner;
public class SpiltOddEven {

	public static void main(String[] args) {
		// SPILIT WHOLE NUMBER INTO ODD AND EVEN
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int reverse=0;
		int n1=0,n2=0;
		while(n!=0){
			reverse=reverse*10+n%10;
			n/=10;
		}
		while(reverse >0) {
			int k=reverse%10;
			if(k%2==0) {
				n1 = n1*10+k;
			}
			else {
				n2 = n2*10+k;
			}
			reverse/=10;
		}
		System.out.println("Even Numbers are : "+n1+"\n"+"Odd Numbers are : "+n2);

	}

}

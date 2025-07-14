import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// REVERSE DIGIT
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit : ");
		int n = sc.nextInt();
		int count = 0;
		while(n>0) {					//reverse =0
			int sum = n%10;				//while(n!=0){
			count = count*10+sum;		//reverse=reverse*10+n%10;
			n=n/10;						//n/=10
		}
		System.out.print("The reversed of your enter digit is : "+count); //reverse
	}

}


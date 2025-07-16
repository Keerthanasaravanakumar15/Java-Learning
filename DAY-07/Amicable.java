import java.util.Scanner;
public class Amicable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum2=0;
		int sum1=0;
		for(int i=1;i<num1;i++) {
			if(num1%i==0) {
				sum1 += i;
			}
		}
		System.out.println(sum1);
		
		
		for(int i=1;i<num2;i++) {
			if(num2%i==0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		
		if((num1==sum2)&&(num2==sum1)) {
			System.out.println("Amicable");
		}
		else {
			System.out.println("Not Amicable");
		}

	}

}


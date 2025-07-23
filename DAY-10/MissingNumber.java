import java.util.Scanner;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num =0;
		int val[] = new int[size];
		for(int i=0;i<size;i++) {
			val[i]=sc.nextInt();
		}
		for(int i=0;i<val.length;i++) {
			if(val[i+1]-val[i]==1) {
				continue;
			}
			else {
				num = val[i]+1;
				break;
			}
		}
		System.out.println(num);
	}

}


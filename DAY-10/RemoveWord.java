import java.util.Scanner;
public class RemoveWord {
		void sent(String a,String word) {
			String arr[] = a.split(" ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(word)) {
					continue;
				}
			System.out.print(arr[i]+" ");
			}
		}
		public static void main(String...args) {
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			String word = sc.next();
			RemoveWord obj = new RemoveWord();
			obj.sent(a, word);
			
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String sen1 = sc.nextLine();
//		String a[] = sen1.split(" ");
//		String word = sc.next();
//		for(int i=0;i<a.length;i++) {
//			if(a[i].equals(word)) {
//				continue;
//			}
//			System.out.print(a[i]+" ");
//		}
	}

}



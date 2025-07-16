public class Split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hi hello hello hi";
		String b[]=a.split(" ");                        
		for(int i=0;i<b.length;i++) {
			if(b[i].equals("hello")) {
				b[i]="*";
			}
		}
		for(String i:b) {
			System.out.print(i);
		}

	}

}

//if(b[i].equals("hello")) {
//	System.out.print(" * ");
//}
//else {
//System.out.print(b[i]+" ");
//}
//


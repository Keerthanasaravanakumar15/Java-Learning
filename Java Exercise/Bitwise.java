
public class Bitwise {

	public static void main(String[] args) {
		// BITWISE AND 
		int a = 10, b= 2; 
		System.out.println(a&b);
		// 8 4 2 1
		// 1 0 1 0 = 10
		// 0 0 1 0 = 2
		// 0 0 1 0 = 2 => a & b
		System.out.println("------------------");
		//BITWISE OR 
		int c = 4, d=2;
		System.out.println(c|d);
		// 8 4 2 1
		// 0 1 0 0 = 4
		// 0 0 1 0 = 2
		// 0 1 1 0 = 6 => a | b
		System.out.println("------------------");
		//BITWISE NOT 
		int e = 15;
		System.out.println(~e);
		// 1 - symbol change to - 
		// 2 - increment by one = -16
		int f = -20;
		System.out.println(~f);
		// 1 - symbol change to + 
		// 2 - decrement by one = 19
		System.out.println("------------------");
		//BITWISE XOR
		int i = 5;
		int j = 5;
		System.out.println(i^j);
		// 0 1 0 1 - 5
		// 0 1 0 1 - 5
		// 0 0 0 0 - 0 => 0 0 & 1 1 = 0
		System.out.println("------------------");
		//LEFT SHIFT 
		int g = 10;
		System.out.println(g<<2);
		//Multiplication Method                // adding bits
		// n * 2 ^ t = 10 * 2 ^ 2 = 40         // 10 = 1 0 1 0 -> 1 0 1 0 0 0 = 40
		System.out.println("------------------");
		//RIGHT SHIFT
		int h = 10 ;
		System.out.println(h>>2);
		//Division Method                     // Removing bits
		// n / 2 ^ t = 10 / 2 ^ 2 = 2 		  // 10 = 1 0 1 0 -> remove last 2 -> 0 0 1 0 = 2
		System.out.println("------------------");


		
		
		

	}

}

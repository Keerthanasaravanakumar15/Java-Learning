public class Questions {

	public static void main(String[] args) {
		// QUESTION 1
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);
		System.out.println("------------------");
		//QUESTION 2
		int a = 11, b=22,c;
		c= a + b + a++ + b++ + ++a + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------------");
		//QUESTION 3
		int j =0 ;
		j = j++ - --j + ++j - j--;
		System.out.println(j);
		System.out.println("------------------");
		//QUESTION 4
		int o = 1, p = 2,q =3;
		int m = o-- - p-- - q--;
		System.out.println(m);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println("------------------");
		//QUESTION 5
//		int e = 11;
//		int f = --(e++); ERROR
//		System.out.println(f);
//		System.out.println("------------------");
		// QUESTION 6
		char ch ='A';
		int z = ++ch + 2;
		System.out.println((char)z);
		System.out.println("------------------");
		//QUESTION 7
		char g = 'A';
		System.out.println(g++);
		System.out.println("------------------");
		//QUESTION 8
		char v = 'd';
		int w = ++v + ++v - --v + v++;
		System.out.println(w);
		System.out.println("------------------");




		
	}

}

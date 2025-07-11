class Narrowing{
  public static void main(String... args) {
		long i = 189;
		int j = (int)i;
		int k = 98;
		char ans = (char)k;
		System.out.println(j);
		System.out.println(ans);
		//String to other Data type 
		String name ="98";
		int a = Integer.parseInt(name);
		byte b = Byte.parseByte(name);
		float c = Float.parseFloat(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//String to Char
		String p = "Kee";
		char q[] = p.toCharArray();
		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		System.out.println(q);
		// OtherDatatype to String
		int e = 10;
		String f = Integer.toString(e);
		System.out.println(f);
		float g = 1.2f;
		String h = Float.toString(g);
		System.out.println(h);
		//Char to String
		char let ='a';
		String answer = Character.toString(let);
		System.out.println(answer);
 
  }
}


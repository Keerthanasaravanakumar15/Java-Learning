class A{
	int a=10;
	class B{
		int b=20;
		class C{
			int c=30;
		class D{
			int d=40;
		}
	}
 } 
}
public class NestedClass {
	public static void main(String[] args) {
		A obj = new A();
		A.B obj2 = obj.new B();
		A.B.C obj3 =obj2.new C();
		A.B.C.D obj4 = obj3.new D();
		System.out.println(obj4.d);
		
	}

}


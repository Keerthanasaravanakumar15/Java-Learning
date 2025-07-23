class parent{
	void car() {
		System.out.println("BMW");
	}
}
class brother extends parent{
	void laptop() {
		System.out.println("Dell");
	}
}
class sister extends parent{
	void mobile() {
		System.out.println("iPhone");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brother obj = new brother();
		obj.car();
		sister obj1 = new sister();
		obj1.car();
		parent obj2 = new parent();
		obj2.car();
	}

}

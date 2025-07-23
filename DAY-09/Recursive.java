public class Recursive {
	static void msg() {
		System.out.println("hi");
		msg(); //recursive
	}
	public static void main(String[] args) {
		msg(); //ANSWER WILL BE INFINITE 
	}

}

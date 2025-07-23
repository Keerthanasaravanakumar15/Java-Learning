class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println("Hi");
			}
			System.out.println("Kee"+Thread.currentThread().getName());
		}
	}
}
class A1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("Hello");
			}
			System.out.println("Shines"+Thread.currentThread().getName());
		}
	}
}
public class MultithreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.start();
		A1 obj1 = new A1();
		obj1.start();
		try {
			obj.join();
		}
		catch(Exception e){
			System.out.println("error");
		}
		try {
			obj1.join();
		}
		catch(Exception e) {
			System.out.println("erroe");
		}
		System.out.println(obj1.isAlive());
		System.out.println("THE END");
	}

}

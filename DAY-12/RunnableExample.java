class c {
	void m1() {
		System.out.println("hello");
	}
}
class d extends c implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Kee"+Thread.currentThread().getName());
		}
	}
}
public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d obj = new d();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}

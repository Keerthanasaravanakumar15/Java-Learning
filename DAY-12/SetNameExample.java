class K extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Kee"+Thread.currentThread().getName());
		}
	}
}
public class SetNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K obj = new K();
		obj.start();
		obj.setName("rthana");
		try {
		obj.join();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		System.out.println("THE END"+Thread.currentThread().getName());
	}

}


class essay extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Page not count");
			}
			System.out.println("Page "+i);
		}
	}
}
class spotify extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("song not count");
			}
			System.out.println("song "+i);
		}
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		essay obj1 = new essay();
		obj1.start();
		spotify obj2 = new spotify();
		obj2.start();
		try {
			obj2.join();
		}
		catch(Exception e) {
			System.out.println("error");
		}
		System.out.println("THE END");
	}

}


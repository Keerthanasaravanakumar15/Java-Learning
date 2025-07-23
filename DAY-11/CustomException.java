class Custom extends Exception{
	Custom(String a){
		super(a);
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		if(year==2025) {
			System.out.println("You are in present");
		}
		else {
			try {
				throw new Custom("You are not in present");
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
	}

}

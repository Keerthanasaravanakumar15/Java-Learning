import java.util.Scanner;
public class BodyMass {
  public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter your height : ");
		float cm = val.nextFloat();
		float height = cm/100;
		System.out.print("Enter your weight : ");
		float weight = val.nextFloat();
		float mass = weight/(height*height);
		System.out.println("Your Bodymass is : "+mass);

	}

}

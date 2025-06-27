import java.util.Scanner;
class exe1 {
  public static void main(String[] args) {
      String name,address;
      int age;
      Scanner val = new Scanner(System.in);
      System.out.println("Enter your name : ");
      name = val.nextLine();
      System.out.println("Enter your Age : ");
      age = val.nextInt();
      val.nextLine();
      System.out.println("Enter your Address : ");
      address = val.nextLine();
      System.out.println("Your Name is : "+name);
      System.out.println("Your Age is : "+age);
      System.out.println("Your Address is : "+address);
  }
}

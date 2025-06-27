import java.util.Scanner;
class mark {
  public static void main(String[] args) {
      int score,res;
      String Name,dept;
      Scanner val = new Scanner(System.in);
      System.out.print("Enter Your Name : ");
      Name = val.nextLine();
      System.out.print("Enter Your Department : ");
      dept = val.nextLine();
      System.out.print("Enter your Score : ");
      score = val.nextInt();
      res = score/10;
      System.out.println("Your Name is  : "+Name);
      System.out.println("Your Department is : "+dept);
      System.out.println("Your result convert in 10 : "+res);

  }
}

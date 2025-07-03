import java.util.Scanner;
class relationalopp {
  public static void main(String args[])
  {
    int a,b;
    Scanner val = new Scanner(System.in);
    System.out.println("Enter A and B Value :");
    a = val.nextInt();
    b = val.nextInt();
    System.out.println("a = "+a + "b = "+b);
    System.out.println("a > b = "+(a>b));
    System.out.println("a < b = "+(a<b));
    System.out.println("a == b = "+(a==b));
    System.out.println("a >= b = "+(a>=b));
    System.out.println("a <= b = "+(a<=b));
    System.out.println("a != b = "+(a!=b));
  }
}

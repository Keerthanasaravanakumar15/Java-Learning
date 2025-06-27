import java.util.Scanner;
class basics {
  public static void main(String[] args) {
    int a,b,c,result;
    Scanner var =new Scanner(System.in);
    System.out.println("Enter A Value : ");
    a = var.nextInt();
    System.out.println("Enter B Value : ");
    b = var.nextInt();
    System.out.println("Enter C Value : ");
    c = var.nextInt();
    result = a+b+c;
    System.err.println("The Addition of Three Value is : "+result);
  }
}
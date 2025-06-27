import java.util.Scanner;
class avg {
  public static void main(String[] args) {
     int a,b,c,d,e,avg;
     Scanner val =new Scanner(System.in);
     System.out.println("Enter A Value : ");
     a = val.nextInt();
     System.out.println("Enter B Value : ");
     b = val.nextInt();
     System.out.println("Enter C Value : ");
     c = val.nextInt();
     d = a*b*c;
     e = a+b+c;
     avg = d/e;
     System.out.println("Mulitiple of three : "+d);
     System.out.println("Addition of three : "+e);
     System.out.println("Average of three : "+avg);

  }
}

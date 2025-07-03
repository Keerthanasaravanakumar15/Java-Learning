class Unaryopp {
  public static void main(String[] args) {
      int a=10,b=20,c;
      c = a + b ;
      System.out.println("C Value is : "+c);
      System.out.println("Assigning a value as 30 a = "+(a=30));
      System.out.println("compare a & c = "+(a==c));
      System.out.println("compare a & b = "+(a==b));
      a = a+20;
      System.out.println("a  = "+a);
      a += 20;
      System.out.println("a  = "+a);
      a -= 20;
      System.out.println("a  = "+a);
      a *= 20;
      System.out.println("a  = "+a);
      a /= 20;
      System.out.println("a  = "+a);


  }
}

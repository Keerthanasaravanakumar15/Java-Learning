class IncDec {
  public static void main(String[] args) {
      int i=1,j=1,k=10;
      System.out.println("i value is : "+i);
      System.out.println("i++ value is : "+i++);
      System.out.println("Now i value is : "+i);
      System.out.println("++i value is : "+ ++i);
      System.out.println("Now i value is : "+i);

      System.out.println("j value is : "+j);
      System.out.println("j-- value is : "+j--);
      System.out.println("Now j value is : "+j);
      System.out.println("--j value is : "+ --j);
      System.out.println("Now j value is : "+j);
      i=10;
      k = k + i++;
      System.out.println("k + i++ value is : "+k);
      System.out.println("now i value is : "+i);
      System.out.println("now k value is : "+k);

  }
}

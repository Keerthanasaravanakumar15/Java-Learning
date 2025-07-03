import java.util.Scanner;
class oddeven{
    public static void main(String args[])
    {
        int num;
        System.out.println("num = ");
        Scanner value = new Scanner (System.in);
        num = value.nextInt();
        if(num % 2 == 0){
        System.out.println(num+ "is even; divided by 2 and obtain "+ ( num / 2));
        }
        else{
        System.out.println(num+ "is odd; subtract 1 and obtain "+ ( num - 1));
        }
    }
}
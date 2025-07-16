public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9,10}};
            for (int[] a1 : a) {
                for (int j = 0; j < a1.length; j++) {
                    System.out.print(a1[j] + " ");
                }
                System.out.println();
            }
	}

}

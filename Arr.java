import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {

	      // initializing int array
	      String[] s = new String[5];
	      s[0]="zee";
	      s[1]="zee";

	      // let us print all the elements available in list
	      System.out.println("The array is:");
	      for (int i=0;i<s.length;i++) {
	         System.out.println(s[i]);
	      }
	      
	      System.out.println("The string representation of array is:");
	      String a=Arrays.toString(s);
	      System.out.println(Arrays.toString(s));
	      System.out.println(a);
	      //ResultSet r;
	   }
}

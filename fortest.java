import java.awt.List;
import java.util.ArrayList;

public class fortest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a=null;
		//a.add("sasiuhad");
		//a.add("12");
		System.out.println(a);
		fortest s= new fortest();
		int count=0;
		for(String b: a){
			for(String c:a){
				System.out.println(count);
				count++;
			}
		b=b;
		}
	}

}

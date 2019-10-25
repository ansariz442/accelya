import java.util.Vector;

public class sample {

	public static void main(String[] args) {
		  Vector v= new Vector();
		  Vector v1= new Vector();
		  v1.add("sss");
		  System.out.println("Hie before if");
		  v.clear();
		  if(v!=null && v.isEmpty()){
			  System.out.println("Hie in if");
		  }
		  System.out.println("Hie after if");
	}

}

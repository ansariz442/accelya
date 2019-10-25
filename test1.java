
public class test1 {
	public static void main(String[] args) {
		boolean b=true;
		System.out.println("out in main");
		if(b=false)
		{
			System.out.println("inside if : " +b);
		}
		else
		{
			System.out.println("inside else : " +b);
		}
		System.out.println("outside main: "+b);
	}
}

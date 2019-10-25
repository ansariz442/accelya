
public class fina {
	final static int m=10;
	//static
	{
		 //new fina();
			//m = 10;	
	}
	 fina(){
		System.out.println(fina.m);
		
	}
	@Override
	public String toString() {
		return "fina [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static void main(String[] args) {
		System.out.println(fina.m);
		fina f=new fina();
		System.out.println(f);
		System.out.println(fina.m);
	}

}

import java.math.BigDecimal;

public class Bigdex extends Exception{
	public static void main(String[] args) {
	    BigDecimal bd = new BigDecimal(0.1);
		System.out.println(bd);
		BigDecimal bd1 = new BigDecimal("0.1");
		System.out.println(bd1);
		Double d=0.1;
		System.out.println(d);
		BigDecimal bd2 = new BigDecimal(d.toString());
		System.out.println(bd2);
		//BigDecimal bd=new BigDecimal(10);
		Object ob=10;
		
		
		
		int a = 0;
		try{
			System.out.println("in try: ");
			a=10/0;
		}
		catch(ArithmeticException e){
			System.out.println("in first catch");;
		}
		catch(Exception  e){
			System.out.println("in second catch");
		}
		
		System.out.println(a);
		
		String s1= new String("null");
		String s2=null;
		Object s=12;
		//Double d=10.1;
		double dd=Double.valueOf(d);
		System.out.println(dd);
		Integer i=((Integer)s).intValue();
		System.out.println(i);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s1);
		System.out.println(s1.equals(null));
		System.out.println(s1==null);
		System.out.println(s1.equals("null"));
		System.out.println(!(s2==s2));
		System.out.println((s2!=s2));
		System.out.println(s2.equals(null));
		 
		/*String s1= null;
		String s2 = "Zeeshan";
		System.out.println(s1);
		System.out.println(s2);
		s1=s2;
		System.out.println(s1);
		Object o= 8000;*/
		
		
		/*int i = (Integer) 8000;
		
		System.out.println(i);*/
	}
}

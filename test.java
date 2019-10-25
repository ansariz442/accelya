
public class test {
	public String met(String s){
		
		
		
		return s; 
	}
	public static void main(String[] args) {
		String s1=new String("zee");
		String s3= s1;
		String s4= s1.intern();
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("s1!=s3: "+(s1!=s3));
		System.out.println("s1.equals(s3): "+s1.equals(s3));	//true
		System.out.println("s1==s4: "+(s1!=s4));
		System.out.println("s1.equals(s4): "+ (!(s1.equals(s4)))); 	//true
		System.out.println();
	}
}

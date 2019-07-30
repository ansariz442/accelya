import java.util.*;
abstract class Calculate{
	abstract void deposit();
	void withdraw(){
		
	}
	double main_bal=0;
}

interface Bank{
	final int min_bal=1000;
	void dis_bal();
}
 
 class SBI extends Calculate implements Bank{
	 int bal;
	 Scanner sc = new Scanner(System.in);
	public void dis_bal() {
		System.out.println("The final balance in your account is: "+main_bal);
	}

	void deposit() {
		System.out.println("Enter the money t be deposited in your account: ");
		main_bal=sc.nextInt();
	}
 }
 
 class BOM implements Bank{

	public void dis_bal() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
 class ICICI implements Bank{

	public void dis_bal() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
public class Test1 {
	BOM bm = new BOM();
	SBI sb= new SBI();
	ICICI ic= new ICICI();
}

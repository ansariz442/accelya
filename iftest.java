import java.util.Scanner;

public class iftest {
		
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();
		int sum=0;
		int val;
		String[] part = s.split("(?=\\d)(?<!\\d)");
		for(String si:part){
			val=Integer.parseInt(si.replaceAll("[^0-9]", "")) ;
			sum+=val;
		}
		System.out.println(sum);
		System.out.println(s.toCharArray());

		sc.close();
	}

}

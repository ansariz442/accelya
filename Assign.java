import java.util.*;
import java.sql.*;
public class Assign {
	static Scanner sc= new Scanner(System.in);
	static String ename, add;
	static int empno,ch1,ch2;
	
	
	public static void input(){
		
		System.out.println("Enter the Employee Number: ");
		empno = sc.nextInt();
		System.out.println("Enter the Employee Name: ");
		ename = sc.next();
		System.out.println("Enter the Employee Address: ");
		add = sc.next();
	}
	
	public static void main(String[] args) throws Exception{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@10.21.2.75:1521:REV11DEV","OTH_OWNER","nubEStuh");
			int no;
			
			Statement stmt=con.createStatement();
			PreparedStatement pstmt;
			
			System.out.println("Enter the table name: ");
			String tab_name=sc.next();
			
			stmt.execute("CREATE TABLE "+tab_name+"(EMPNO NUMBER, ENAME VARCHAR2(15), ADDRESS VARCHAR2(25))");
			System.out.println("Table "+tab_name+" has been created:");
			String ch1;
			int choice;
			do{
				System.out.println("Enter the choice: \n1. To Insert \t2. To Update \n3. To Delete \t4. To Print \n5. Exit");
				choice = sc.nextInt();
				switch(choice){
				case 1:{
					System.out.println("Enter the number of Employees Data to be inserted: ");
					no= sc.nextInt();
					for(int i=1;i<=no;i++){
						System.out.println("Enter the details of "+i+" employee.");
						input();
						pstmt=con.prepareStatement("INSERT INTO "+tab_name+" VALUES(?,?,?)");
						pstmt.setInt(1,empno);
						pstmt.setString(2,ename);
						pstmt.setString(3,add);
						pstmt.execute();
						System.out.println(i+"'s row inserted.");
						}
					break;
					}//end case 1
				
				case 2:{
					System.out.println("Choose what to update \n1. EMP NO \t2. ENAME \n3. ADDRESS");
					int c2=sc.nextInt();
					switch(c2){
					case 1:
						System.out.println("Enter the OLD Emp Number to be updated");
						int ch2 = sc.nextInt();
						System.out.println("Enter the NEW Emp Number to be updated");
						int ch3 = sc.nextInt();
						pstmt=con.prepareStatement("UPDATE "+tab_name+" SET EMPNO = ? WHERE EMPNO = ?");
						pstmt.setInt(1, ch3);
						pstmt.setInt(2,ch2);
						pstmt.execute();
						System.out.println("1 Row has been Updated");
					break;	
					case 2:
						System.out.println("Enter the ENAME to be updated");
						ch1 = sc.next();
						System.out.println("Enter the Emp Number to be updated");
						ch3 = sc.nextInt();
						pstmt=con.prepareStatement("UPDATE "+tab_name+" SET ENAME = ? WHERE EMPNO = ?");
						pstmt.setString(1, ch1);
						pstmt.setInt(2,ch3);
						pstmt.execute();
						System.out.println("1 Row has been Updated");
					break;
					case 3:
						System.out.println("Enter the ADDRESS to be updated");
						ch1 = sc.next();
						System.out.println("Enter the Emp Number to be updated");
						ch3 = sc.nextInt();
						pstmt=con.prepareStatement("UPDATE "+tab_name+" SET ADDRESS = ? WHERE EMPNO = ?");
						pstmt.setString(1, ch1);
						pstmt.setInt(2,ch3);
						pstmt.execute();
						System.out.println("1 Row has been Updated");
					break;	
					case 4:
						break;
					}//end inner switch
					
				break;	
				}//end case 2
				
				case 3:{
					System.out.println("Enter the Emp Number to be deleted: ");
					int eno=sc.nextInt();
					pstmt=con.prepareStatement("DELETE FROM "+tab_name+" WHERE EMPNO=?");
					pstmt.setInt(1, eno);
					pstmt.execute();
					System.out.println("Row has been deleted....");
					break;
				}//end case 3
				
				case 4:{
					ResultSet rs;
					System.out.println("Enter what to print \n1. All     \t2. Ename \n3. EMPNO \t4. ADDRESS \n");
					int chh=sc.nextInt();
					switch(chh){
					case 1:
						rs=stmt.executeQuery("select * from "+tab_name);  
						while(rs.next())  
							System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"      "+rs.getString(3));
						break;
					case 2:
						rs=stmt.executeQuery("select ename from "+tab_name);  
						while(rs.next())  
							System.out.println(rs.getString(1));
					break;
					case 3:
						rs=stmt.executeQuery("select empno from "+tab_name);  
						while(rs.next())  
							System.out.println(rs.getInt(1));
					break;
					case 4:
						rs=stmt.executeQuery("select address from "+tab_name);  
						while(rs.next())  
							System.out.println(rs.getString(1));
					break;
					case 5:break;
					}//inner switch end
				}//end case 4
				
				case 5:break;
				}//switch end
				
			}while(choice!=5);//do while end

			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}

	}

}

import java.sql.*;  
class MysqlCon{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlsampledatabase","root","DasSworP420!");  
			//here mysqlsampledatabase is database name, root is username and DasSworP420! is password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())
				System.out.println(rs.getNString("firstName"));  
				con.close();  
			}
			catch(Exception e){
				System.out.println(e);
			}
	}  
}  
package employee.management.system;
import java.sql.*;


public class Conn {
	
	
	Connection c;
	Statement s;
	
  public Conn() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Manager@4454");
			s = c.createStatement();
			s.executeUpdate(null);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


package College;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Conn {
	Connection c;
	Statement s;
	public Conn() {
		try {
			 //String connectionURL = "jdbc:mysql://localhost:3306/hotel";
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///hotel?useSSL=false","root","1234");
			s=c.createStatement();		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
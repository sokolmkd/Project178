import java.sql.*;

import javax.swing.JFrame;
public class Baza {
	 
	public static void main(String[] args) {
		ResultSet rset = null;
		 String celo = "";
		 try (
		        
		         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","boki123312"); // MySQL
		         Statement stmt = conn.createStatement();
		      ) {
		         
		         rset = stmt.executeQuery("select * from actor");
		 
		         System.out.println("zakon2");
		        
		         //int rowCount = 0;
		         while(rset.next()) {   // Move the cursor to the next row
		        	 String id = rset.getString("actor_id");
		        	 
		         }
		        
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		     
		 PopUpWindow prozor = new PopUpWindow();
		 prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 prozor.pack();
		 prozor.setVisible(true);
	}

}


import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PopUpWindow extends JFrame{
	 String selected;
	 ArrayList<String> n1 = new ArrayList<String>();
		ArrayList<String> n2 = new ArrayList<String>();
		ArrayList<String> n3 = new ArrayList<String>();
		ResultSet rset = null;
		String id;
		String t;
		String tt;
		 Connection conn;
		 Statement stmt;

			JComboBox<String> comboBox_1 = new JComboBox<String>();
			JComboBox<String> comboBox_2 = new JComboBox<String>();
	public PopUpWindow() {
		
		JButton btnNewButton = new JButton("New button");
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		
		
		
		 try  {
			 	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","boki123312"); // MySQL
		        stmt = conn.createStatement(); 
		         rset = stmt.executeQuery("select * from actor");
		         while(rset.next()) { 
		        	 id = rset.getString("actor_id");
		        	 n1.add(id);
		        	 comboBox.addItem(id);
		        	 
		      }
		         
		        rset=null;
		        rset = stmt.executeQuery("select * from film");
		        while(rset.next())
		        {
		        	 t = rset.getString("film_id");
		        	 n2.add(t);
		        	
		        	
		        
		        } 
		        rset = stmt.executeQuery("select * from store");
		        while(rset.next())
		        {
		        	tt = rset.getString("store_id");
		        	n3.add(tt);
		        	
		        }
		      
		 
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		 
		 comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					selected = comboBox.getSelectedItem().toString();
					System.out.println(selected);
					 try {
						rset = stmt.executeQuery("select * from film");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				        try {
							while(rset.next())
							{
								 t = rset.getString("film_id");
								 if(t.equals(selected))
								 comboBox_1.addItem(t);
								 
							
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					
				}
			});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(193)
					.addComponent(btnNewButton))
		);
		getContentPane().setLayout(groupLayout);
	}
}

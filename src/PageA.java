
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 *
 * @author Victor
 */
public class PageA extends javax.swing.JFrame {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	ArrayList<JTextField> txt = new ArrayList<JTextField>();
    public PageA() {
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosed(WindowEvent arg0) {
    			PageB fp = new PageB();
    			fp.setVisible(true);
    		}
    	});
    	
        initComponents();
this.setLocationRelativeTo(null);
this.getContentPane().setBackground(new Color(164,205,226)); 
this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
try  {
 	conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","boki123312"); // MySQL
    stmt = (Statement) conn.createStatement(); 
   }
catch(SQLException ex) {
    ex.printStackTrace();
 }
}
    
    private void UploadImg1ActionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try {
            ImageIcon ii=new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(f.getAbsolutePath()))));//get the image from file chooser and scale it to match JLabel size
            UploadImg.setOpaque(false);
            UploadImg.setContentAreaFilled(false);
            UploadImg.setBorderPainted(false);
            UploadImg.setIcon(ii);
            UploadImg.setBorder(BorderFactory.createEmptyBorder());
            UploadImg.setText("");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
   
   public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
        BufferedImage bi;
        bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(img, 0, 0, w, h, null);
        g2d.dispose();
        return bi;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        UploadImg = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	for (JTextField el : txt) {
				el.setText("");
			}
        	}
        });
        jButton11 = new javax.swing.JButton();
        jButton11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        		
        		
        		
        		
        	}
        });
        jButton12 = new javax.swing.JButton();
        jButton12.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
					rset = stmt.executeQuery("DELETE FROM table_name WHERE some_column=some_value");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
        jButton13 = new javax.swing.JButton();
        jButton13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
					rset = stmt.executeQuery("UPDATE table_name SET field1=new-value1, field2=new-value2");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();

        jLabel17.setText("jLabel1");

        jLabel18.setText("jLabel1");

        jTextField17.setText("jTextField1");

        jTextField18.setText("jTextField1");

        jTextField19.setText("jTextField1");

        jLabel19.setText("jLabel1");

        jLabel20.setText("jLabel1");

        jTextField20.setText("jTextField1");

        jTextField21.setText("jTextField1");

        jLabel21.setText("jLabel1");

        jLabel22.setText("jLabel1");

        jTextField22.setText("jTextField1");

        jTextField23.setText("jTextField1");

        jLabel23.setText("jLabel1");

        jTextField24.setText("jTextField1");

        jLabel24.setText("jLabel1");

        
        setBackground(new java.awt.Color(0, 174, 236));

        UploadImg.setText("Upload your logo");
        UploadImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImgActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Button B");

        jButton4.setText("Button D");

        jButton5.setText("Button C");

        jButton6.setText("Button F");

        jButton7.setText("Button E");

        jButton8.setText("Button A");

        jButton9.setText("Insert");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Clear");

        jButton11.setText("Print");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setEnabled(false);

        jButton12.setText("Delete");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setEnabled(false);

        jButton13.setText("Update");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setEnabled(false);

        jLabel1.setText("Label 1");

        jLabel2.setText("Label 2");

        jLabel3.setText("Label 3");

        jLabel4.setText("Label 4");

        jLabel5.setText("Label 8");

        jLabel6.setText("Label 6");

        jLabel7.setText("Label 5");

        jLabel8.setText("Label 7");

        jLabel9.setText("Label 15");

        jLabel10.setText("Label 13");

        jLabel11.setText("Label 9");

        jLabel12.setText("Label 12");

        jLabel13.setText("Label 10");

        jLabel14.setText("Label 16");

        jLabel15.setText("Label 14");

        jLabel16.setText("Label 11");

        jLabel25.setText("Label 27");

        jLabel26.setText("Label 17");

        jLabel27.setText("Label 20");

        jLabel28.setText("Label 24");

        jLabel29.setText("Label 22");

        jLabel31.setText("Label 23");

        jLabel33.setText("Label 21");

        jLabel35.setText("Label 26");

        jLabel37.setText("Label 18");

        jLabel38.setText("Label 25");

        jLabel39.setText("Label 28");

        jLabel40.setText("Label 19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        									.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jButton3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        									.addComponent(jButton8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
        							.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jLabel7)
        									.addComponent(jLabel11)
        									.addComponent(jLabel1))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jTextField7, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jTextField1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel13)
        									.addComponent(jLabel6)
        									.addComponent(jLabel2))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jLabel16)
        										.addGap(16)
        										.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createSequentialGroup()
        										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jLabel8))
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jLabel3)))
        										.addGap(22)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        											.addComponent(jTextField3)
        											.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jLabel12)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jLabel5)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jLabel4)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jLabel38)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jTextField33, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jLabel33)
        											.addPreferredGap(ComponentPlacement.UNRELATED)
        											.addComponent(jTextField32, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jLabel26)
        											.addPreferredGap(ComponentPlacement.UNRELATED)
        											.addComponent(jTextField38, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jLabel10)
        										.addPreferredGap(ComponentPlacement.RELATED)
        										.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        										.addGap(6)))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel29)
        									.addComponent(jLabel35)
        									.addComponent(jLabel37)
        									.addComponent(jLabel15))
        								.addGap(18)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jLabel9)
        										.addGap(18)
        										.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        										.addGap(18)
        										.addComponent(jLabel14)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createSequentialGroup()
        										.addGroup(layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(jTextField36, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        											.addComponent(jTextField31, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        											.addComponent(jTextField37, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        										.addGap(18)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING)
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel25)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField34, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel31)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField30, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel40)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField40, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
        										.addGap(18)
        										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel39)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField39, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel28)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField26, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel27)
        												.addPreferredGap(ComponentPlacement.UNRELATED)
        												.addComponent(jTextField25, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))))))
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(UploadImg, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
        						.addGap(18)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
        								.addGap(18)
        								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
        								.addGap(18)
        								.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
        								.addGap(18)
        								.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
        								.addGap(18)
        								.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(UploadImg, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        								.addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jButton11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        					.addGap(18)
        					.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addGap(8)
        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4)
        						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(8)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel6)
        						.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5)
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel11)
        						.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel13)
        						.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel16)
        						.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel12)
        						.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(8)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel10)
        						.addComponent(jLabel15)
        						.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel9)
        						.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel14)
        						.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel26)
        						.addComponent(jTextField38, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel37)
        						.addComponent(jTextField37, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel40)
        						.addComponent(jTextField40, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel27)
        						.addComponent(jTextField25, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(8)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel33)
        						.addComponent(jTextField32, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel29)
        						.addComponent(jTextField31, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel31)
        						.addComponent(jTextField30, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel28)
        						.addComponent(jTextField26, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel38)
        						.addComponent(jTextField33, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel35)
        						.addComponent(jTextField36, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel25)
        						.addComponent(jTextField34, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel39)
        						.addComponent(jTextField39, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        txt.add(jTextField1);
        txt.add(jTextField7);
        txt.add(jTextField15);
        txt.add(jTextField11);
        txt.add(jTextField38);
        txt.add(jTextField32);
        txt.add(jTextField33);
        txt.add(jTextField2);
        txt.add(jTextField6);
        txt.add(jTextField14);
        txt.add(jTextField10);
        txt.add(jTextField37);
        txt.add(jTextField31);
        txt.add(jTextField36);
        txt.add(jTextField3);
        txt.add(jTextField8);
        txt.add(jTextField16);
        txt.add(jTextField9);
        txt.add(jTextField40);
        txt.add(jTextField30);
        txt.add(jTextField34);
        txt.add(jTextField4);
        txt.add(jTextField5);
        txt.add(jTextField12);
        txt.add(jTextField13);
        txt.add(jTextField25);
        txt.add(jTextField26);
        txt.add(jTextField39);
    }// </editor-fold>
  
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
    	try {
			rset = stmt.executeQuery("INSERT INTO table_name VALUES (value1,value2,value3)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	jButton12.setEnabled(true);
    	jButton11.setEnabled(true);
    	jButton13.setEnabled(true);
    	PopUpWindow pop = new PopUpWindow();
    	pop.setVisible(true);
    }                                        

    private void UploadImgActionPerformed(java.awt.event.ActionEvent evt) {
            UploadImg1ActionPerformed(evt);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton UploadImg;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
  
    // End of variables declaration
}

package Rent;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Properties;

public class Rent_a_car extends javax.swing.JFrame {

    /**
     * Creates new form Rental
     */
    public Rent_a_car() {
        initComponents();
        
        LoadCarid();
        jDateChooser1.setDateFormatString("yyyy/MM/dd");  // The MM is capital here
        jDateChooser2.setDateFormatString("yyyy/MM/dd");
        
        jTextField1.setEnabled(false);
        jLabel9.setEnabled(false);
        jTextField3.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
        
        
        
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    // Creating a function so that the CarID's are loaded automatically
    public void LoadCarid()
    {
        try {
            Class.forName("java.sql.Driver");
            Properties p = new Properties();
		    p.put("user","root");
		    p.put("password","surjith");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rental",p);
            
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select * from carregistration;");
            ResultSet rs ;
            rs = pst.executeQuery();
            jComboBox1.removeAllItems();
            
            while(rs.next())
            {
                jComboBox1.addItem(rs.getString(2));  // 1 is the car_no
            }
        } 
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Rent_a_car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rental"));

        jLabel1.setText("Car ID");

        jLabel2.setText("Customer ID");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Rental Fee");

        jLabel5.setText("Date");

        jLabel6.setText("Due Date");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Rent Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Car Available (Yes/No)");
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jDateChooser1, jDateChooser2, jTextField1, jTextField3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jDateChooser1, jDateChooser2, jTextField1, jTextField3});

        jLabel10.setFont(new java.awt.Font("Tibetan Machine Uni", 1, 24)); // NOI18N
        jLabel10.setText("Rent a Car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(218, 218, 218))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        String car_id = jComboBox1.getSelectedItem().toString();
        
        try {
            Class.forName("java.sql.Driver");
            Properties p = new Properties();
		    p.put("user","root");
		    p.put("password","surjith");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rental",p);
            
            pst1 = (PreparedStatement) con.prepareStatement("Select * from carregistration where car_no = ?");
            pst1.setString(1, car_id);
            rs = pst1.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Car Number Not Found");
            }
            else
            {
                String aval = rs.getString("available");
//                jTextField4.setText(aval.trim());
                jLabel8.setText(aval.trim());  // For jLabel
                
                
                if(aval.equals("Yes"))  
                {
                    jTextField1.setEnabled(true);
                    jLabel9.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jDateChooser1.setEnabled(true);
                    jDateChooser2.setEnabled(true);
                }
            
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Rent_a_car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String cust_id = jTextField1.getText();
            
            try {
                Class.forName("java.sql.Driver");
                Properties p = new Properties();
    		    p.put("user","root");
    		    p.put("password","surjith");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rental",p);
                
                pst2 = (PreparedStatement) con.prepareStatement("Select * from customer where cus_id = ?");
                
                pst2.setString(1, cust_id);
                rs = pst2.executeQuery();
                
                if(rs.next() == false)
                {
                    JOptionPane.showMessageDialog(this, "Customer number not found");
                }
                else
                {
                    String custname = rs.getString("name");
                    jLabel9.setText(custname.trim());  // For jLabel
                }
                
            } 
            
            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Rent_a_car.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String car_id = jComboBox1.getSelectedItem().toString();
        String cust_id = jTextField1.getText();
        
        String fee = jTextField3.getText();
        
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");  // Storing Start Date
        String date = Date_Format.format(jDateChooser1.getDate());
        
        SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");  // Storing Due Date
        String due = Date_Format1.format(jDateChooser2.getDate());
        
        try {
            Class.forName("java.sql.Driver");
            Properties p = new Properties();
		    p.put("user","root");
		    p.put("password","surjith");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rental",p);
            
            pst3 = (PreparedStatement) con.prepareStatement("INSERT INTO rental (car_id, cust_id, fee, date, due) VALUES (?, ?, ?, ?, ?);");
            pst3.setString(1, car_id);
            pst3.setString(2, cust_id);
            pst3.setString(3, fee);
            pst3.setString(4, date);
            pst3.setString(5, due);
            pst3.executeUpdate();
            
            pst4 = (PreparedStatement) con.prepareStatement("UPDATE carregistration set available = 'No' where car_no = ?");
            pst4.setString(1, car_id);
            pst4.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Success");
            
            
            jTextField1.setText("");
            jLabel8.setText("");
            jLabel9.setText("");
            jTextField1.setText("");
            jTextField3.setText("");
            jDateChooser1.cleanup();
            jDateChooser2.cleanup();
            
            
            
        } 
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Rent_a_car.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rent_a_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent_a_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent_a_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent_a_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rent_a_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}


package com.cowin.main.gui;

import com.cowin.main.Application.SignupApp;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {

   SignupApp sapp ;
    public Signup() 
    {
        initComponents();
        sapp = new SignupApp(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        aadhar_no = new javax.swing.JTextField();
        mobile_no = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        clear_btn = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        utype = new javax.swing.JComboBox<>();
        signup_btn = new javax.swing.JButton();
        conf_password = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        add_scroll = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cowin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 480, 210));

        login_btn.setBackground(new java.awt.Color(6, 160, 46));
        login_btn.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("LogIn");
        login_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_btn.setBorderPainted(false);
        login_btn.setFocusPainted(false);
        login_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 700));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 40, 50));

        jLabel3.setFont(new java.awt.Font("aakar", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SignUp");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 890, 50));

        jLabel4.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 170, 30));

        jLabel5.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, 30));

        jLabel6.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 30));

        jLabel7.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 110, 30));

        jLabel8.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Aadhar No. :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 30));

        jLabel9.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 130, 30));

        jLabel10.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Type :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 130, 30));

        jLabel11.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No. :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 130, 30));

        jLabel12.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 130, 30));

        fname.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 40));

        lname.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        lname.setForeground(new java.awt.Color(102, 102, 255));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 190, 40));

        aadhar_no.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        aadhar_no.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.add(aadhar_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 40));

        mobile_no.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        mobile_no.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.add(mobile_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 190, 40));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("____________________");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 60));

        clear_btn.setBackground(new java.awt.Color(218, 18, 15));
        clear_btn.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear_btn.setBorderPainted(false);
        clear_btn.setFocusPainted(false);
        clear_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel2.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 150, 50));

        dob.setForeground(new java.awt.Color(102, 102, 255));
        dob.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 190, 40));

        utype.setBackground(new java.awt.Color(255, 255, 255));
        utype.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        utype.setForeground(new java.awt.Color(102, 102, 255));
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User", "Vaccinator", "Vaccinee" }));
        utype.setToolTipText("Select User Type Here");
        utype.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(254, 254, 254)));
        jPanel2.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 190, 40));

        signup_btn.setBackground(new java.awt.Color(6, 160, 46));
        signup_btn.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        signup_btn.setForeground(new java.awt.Color(255, 255, 255));
        signup_btn.setText("SignUp");
        signup_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup_btn.setBorderPainted(false);
        signup_btn.setFocusPainted(false);
        signup_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel2.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 150, 50));

        conf_password.setBackground(new java.awt.Color(255, 255, 255));
        conf_password.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        conf_password.setForeground(new java.awt.Color(102, 102, 255));
        conf_password.setToolTipText("Enter Password Here");
        jPanel2.add(conf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 190, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 255));
        password.setToolTipText("");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 190, 40));

        address.setColumns(20);
        address.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        address.setForeground(new java.awt.Color(102, 102, 255));
        address.setRows(5);
        add_scroll.setViewportView(address);

        jPanel2.add(add_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 890, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // ----------------------------- EXIT BUTTON -------------------------------------------
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        
    }//GEN-LAST:event_login_btnActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        
    }//GEN-LAST:event_lnameActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        if(fname.getText().equals("")||lname.getText().equals("")||address.getText().equals("")||aadhar_no.getText().equals("")||mobile_no.getText().equals("")||password.getText().equals("")||conf_password.getText().equals("")||utype.getSelectedItem().equals("Select User")||dob.getDate()==null)
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Please Enter all the fields Properly....","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(password.getText().equals(conf_password.getText()))
            {
                if(sapp.insertData(fname.getText(),lname.getText(),address.getText(),aadhar_no.getText(),mobile_no.getText(),password.getText(),dob.getDate(),(String) utype.getSelectedItem()))
                {
                    JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Successfully Created Account... \nYou can login now","Success",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Error While Creating Account..\n Try after some time...","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Password and Confirm Password not Matches...","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        fname.setText("");
        lname.setText("");
        address.setText("");
        password.setText("");
        conf_password.setText("");
        aadhar_no.setText("");
        mobile_no.setText("");
        utype.setSelectedItem("Setect User");
        dob.setDate(null);
    }//GEN-LAST:event_signup_btnActionPerformed

        // ----------------------------- way to signup page BUTTON -------------------------------------------
    
    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked

        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_login_btnMouseClicked

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        lname.setText("");
        address.setText("");
        password.setText("");
        conf_password.setText("");
        aadhar_no.setText("");
        mobile_no.setText("");
        utype.setSelectedItem("Setect User");
        dob.setDate(null);
    }//GEN-LAST:event_clear_btnActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_no;
    private javax.swing.JScrollPane add_scroll;
    private javax.swing.JTextArea address;
    private javax.swing.JButton clear_btn;
    private javax.swing.JPasswordField conf_password;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JButton login_btn;
    private javax.swing.JTextField mobile_no;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup_btn;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}

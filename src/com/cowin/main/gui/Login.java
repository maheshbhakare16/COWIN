
package com.cowin.main.gui;
import com.cowin.main.Application.LoginApp;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    LoginApp lapp=null;
    public String user_name;
    public Login() {
        initComponents();
        lapp = new LoginApp(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cowin = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();
        password_lbl = new javax.swing.JPanel();
        exit_login_button = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        aadhar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        user_type = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        clear_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        forgot_password = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(102, 102, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cowin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cowin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cowin.jpg"))); // NOI18N
        cowin.setToolTipText("Enter your UserName");
        jPanel1.add(cowin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 790, 300));

        signup_btn.setBackground(new java.awt.Color(8, 159, 56));
        signup_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        signup_btn.setForeground(new java.awt.Color(254, 254, 254));
        signup_btn.setText("SignUp");
        signup_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup_btn.setBorderPainted(false);
        signup_btn.setFocusPainted(false);
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btnMouseClicked(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 700));

        password_lbl.setBackground(new java.awt.Color(102, 102, 255));
        password_lbl.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        password_lbl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_login_button.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        exit_login_button.setForeground(new java.awt.Color(254, 254, 254));
        exit_login_button.setText("X");
        exit_login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_login_buttonMouseClicked(evt);
            }
        });
        password_lbl.add(exit_login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 40));

        jLabel2.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Password:");
        password_lbl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 160, 30));

        jLabel3.setFont(new java.awt.Font("aakar", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LogIn");
        password_lbl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 70));

        username_lbl.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        username_lbl.setForeground(new java.awt.Color(254, 254, 254));
        username_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username_lbl.setText("Aadhar No.: ");
        password_lbl.add(username_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 30));

        aadhar.setBackground(new java.awt.Color(102, 102, 255));
        aadhar.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        aadhar.setForeground(new java.awt.Color(255, 255, 255));
        aadhar.setToolTipText("Enter UserName Here");
        aadhar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        aadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharActionPerformed(evt);
            }
        });
        password_lbl.add(aadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 330, 40));

        jLabel4.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("User Type:");
        password_lbl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 160, 30));

        user_type.setBackground(new java.awt.Color(102, 102, 255));
        user_type.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        user_type.setForeground(new java.awt.Color(255, 255, 255));
        user_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Vaccinator", "Admin", "Vaccinee" }));
        user_type.setToolTipText("Select User Type Here");
        user_type.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(254, 254, 254)));
        password_lbl.add(user_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 449, 330, -1));

        password.setBackground(new java.awt.Color(102, 102, 255));
        password.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setToolTipText("Enter Password Here");
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        password_lbl.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 330, 40));

        clear_btn.setBackground(new java.awt.Color(231, 11, 34));
        clear_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(254, 254, 254));
        clear_btn.setText("Clear");
        clear_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear_btn.setBorderPainted(false);
        clear_btn.setFocusPainted(false);
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        password_lbl.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 150, 50));

        login_btn.setBackground(new java.awt.Color(8, 159, 56));
        login_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        login_btn.setForeground(new java.awt.Color(254, 254, 254));
        login_btn.setText("LogIn");
        login_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_btn.setBorderPainted(false);
        login_btn.setFocusPainted(false);
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        password_lbl.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 150, 50));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("____________________");
        password_lbl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 50));

        forgot_password.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        forgot_password.setForeground(new java.awt.Color(214, 33, 33));
        forgot_password.setText("Forgot Password?");
        forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_passwordMouseClicked(evt);
            }
        });
        password_lbl.add(forgot_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 190, -1));

        getContentPane().add(password_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 580, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_login_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_login_buttonMouseClicked

    private void aadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharActionPerformed

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_signup_btnMouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        if(password.getText().equals("") || aadhar.getText().equals("") || user_type.getSelectedItem().equals("Select User Type"))
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Please Enter all the fields Properly....","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            if(lapp.checkLoginCredentials(aadhar.getText(),password.getText()))
            {
                if(user_type.getSelectedItem() == "Admin")
                {
                    this.setVisible(false);
                    Admin.main(new String[]{user_name});
                }
                else if(user_type.getSelectedItem() == "Vaccinator")
                {
                    this.setVisible(false);
                    Vaccinator.main(new String[]{user_name});
                }
                else if(user_type.getSelectedItem() == "Vaccinee")
                {
                    this.setVisible(false);
                    Vaccinee.main(new String[]{user_name});
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Wrong Username or Password....\nOR\nMay be Account not Verified..Wait for some time..","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        aadhar.setText("");
        password.setText("");
        user_type.setSelectedItem("Select User Type");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void forgot_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_passwordMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ChangePassword.main(null);
    }//GEN-LAST:event_forgot_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel cowin;
    private javax.swing.JLabel exit_login_button;
    private javax.swing.JLabel forgot_password;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel password_lbl;
    private javax.swing.JButton signup_btn;
    private javax.swing.JComboBox<String> user_type;
    private javax.swing.JLabel username_lbl;
    // End of variables declaration//GEN-END:variables
}

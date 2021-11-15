/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cowin.main.gui;

import com.cowin.main.Application.AdminApp;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahesh
 */
public class Admin extends javax.swing.JFrame {

    /** Creates new form Admin */
    public String user_name;
    AdminApp aapp;
    public Admin() {
        initComponents();
        aapp = new AdminApp(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left_panel = new javax.swing.JPanel();
        vac_report_btn = new javax.swing.JButton();
        add_a_vaccine_btn = new javax.swing.JButton();
        VERIFY_USER_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        back_panel = new javax.swing.JPanel();
        vaccination_report_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        report_table = new javax.swing.JTable();
        verify_user_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        delet_btn = new javax.swing.JButton();
        verify_btn = new javax.swing.JButton();
        add_vaccine_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vaccine_name = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        vaccine_count = new javax.swing.JTextField();
        submit_add_vaccine_btn = new javax.swing.JButton();
        cancel_add_vaccine_btn = new javax.swing.JButton();
        top_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left_panel.setBackground(new java.awt.Color(102, 102, 255));
        left_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vac_report_btn.setBackground(new java.awt.Color(150, 150, 255));
        vac_report_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        vac_report_btn.setForeground(new java.awt.Color(255, 255, 255));
        vac_report_btn.setText("VACCINATION REPORT");
        vac_report_btn.setFocusPainted(false);
        vac_report_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vac_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vac_report_btnActionPerformed(evt);
            }
        });
        left_panel.add(vac_report_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 350, 50));

        add_a_vaccine_btn.setBackground(new java.awt.Color(150, 150, 255));
        add_a_vaccine_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        add_a_vaccine_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_a_vaccine_btn.setText("ADD VACCINES");
        add_a_vaccine_btn.setFocusPainted(false);
        add_a_vaccine_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_a_vaccine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_a_vaccine_btnActionPerformed(evt);
            }
        });
        left_panel.add(add_a_vaccine_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 350, 50));

        VERIFY_USER_btn.setBackground(new java.awt.Color(150, 150, 255));
        VERIFY_USER_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        VERIFY_USER_btn.setForeground(new java.awt.Color(255, 255, 255));
        VERIFY_USER_btn.setText("VERIFY USER");
        VERIFY_USER_btn.setFocusPainted(false);
        VERIFY_USER_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VERIFY_USER_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERIFY_USER_btnActionPerformed(evt);
            }
        });
        left_panel.add(VERIFY_USER_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 350, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cowin_small.jpg"))); // NOI18N
        left_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 270));

        getContentPane().add(left_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 810));

        back_panel.setBackground(new java.awt.Color(255, 255, 255));
        back_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vaccination_report_panel.setBackground(new java.awt.Color(150, 150, 255));
        vaccination_report_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("aakar", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vaccination Report");
        vaccination_report_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1120, 60));

        jLabel9.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("_____________________________________________________________");
        vaccination_report_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1120, -1));

        report_table.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        report_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Vaccine Name", "Availabe Vaccines", "Used Vaccines", "Total Vaccines"
            }
        ));
        jScrollPane2.setViewportView(report_table);

        vaccination_report_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 980, 150));

        back_panel.add(vaccination_report_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1120, 630));

        verify_user_panel.setBackground(new java.awt.Color(150, 150, 255));
        verify_user_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(150, 150, 255));

        user_table.setBackground(new java.awt.Color(150, 150, 255));
        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "First Name", "Last Name", "Aadhar No.", "Mobile No.", "DOB", "Status"
            }
        ));
        jScrollPane1.setViewportView(user_table);

        verify_user_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1060, 270));

        jLabel6.setFont(new java.awt.Font("aakar", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Verify User Details");
        verify_user_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1120, 60));

        jLabel7.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("_____________________________________________________________");
        verify_user_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1120, -1));

        delet_btn.setBackground(new java.awt.Color(221, 1, 22));
        delet_btn.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        delet_btn.setForeground(new java.awt.Color(255, 255, 255));
        delet_btn.setText("Delete");
        delet_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delet_btn.setBorderPainted(false);
        delet_btn.setFocusPainted(false);
        delet_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delet_btnActionPerformed(evt);
            }
        });
        verify_user_panel.add(delet_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 170, 50));

        verify_btn.setBackground(new java.awt.Color(6, 160, 46));
        verify_btn.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        verify_btn.setForeground(new java.awt.Color(255, 255, 255));
        verify_btn.setText("Verify");
        verify_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verify_btn.setBorderPainted(false);
        verify_btn.setFocusPainted(false);
        verify_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verify_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify_btnActionPerformed(evt);
            }
        });
        verify_user_panel.add(verify_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 170, 50));

        back_panel.add(verify_user_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1120, 630));

        add_vaccine_panel.setBackground(new java.awt.Color(150, 150, 255));
        add_vaccine_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("aakar", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Vaccines to Stock");
        add_vaccine_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1120, 60));

        jLabel3.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vaccine Name:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_vaccine_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 40));

        jLabel4.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("_____________________________________________________________");
        add_vaccine_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1120, -1));

        vaccine_name.setBackground(new java.awt.Color(150, 150, 255));
        vaccine_name.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        vaccine_name.setForeground(new java.awt.Color(255, 255, 255));
        vaccine_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vaccine Name", "COVISHILD", "COVAXIN", "SPUTNIK-V" }));
        vaccine_name.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        add_vaccine_panel.add(vaccine_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 400, 40));

        jLabel5.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vaccine Count:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_vaccine_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 210, 40));

        vaccine_count.setBackground(new java.awt.Color(150, 150, 255));
        vaccine_count.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        vaccine_count.setForeground(new java.awt.Color(255, 255, 255));
        vaccine_count.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        add_vaccine_panel.add(vaccine_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 400, 40));

        submit_add_vaccine_btn.setBackground(new java.awt.Color(10, 190, 46));
        submit_add_vaccine_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        submit_add_vaccine_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_add_vaccine_btn.setText("Submit");
        submit_add_vaccine_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit_add_vaccine_btn.setBorderPainted(false);
        submit_add_vaccine_btn.setFocusPainted(false);
        submit_add_vaccine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_add_vaccine_btnActionPerformed(evt);
            }
        });
        add_vaccine_panel.add(submit_add_vaccine_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 190, 60));

        cancel_add_vaccine_btn.setBackground(new java.awt.Color(206, 17, 17));
        cancel_add_vaccine_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        cancel_add_vaccine_btn.setForeground(new java.awt.Color(255, 255, 255));
        cancel_add_vaccine_btn.setText("Cancel");
        cancel_add_vaccine_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_add_vaccine_btn.setBorderPainted(false);
        cancel_add_vaccine_btn.setFocusPainted(false);
        cancel_add_vaccine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_add_vaccine_btnActionPerformed(evt);
            }
        });
        add_vaccine_panel.add(cancel_add_vaccine_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 190, 60));

        back_panel.add(add_vaccine_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1120, 630));

        getContentPane().add(back_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 1200, 700));

        top_panel.setBackground(new java.awt.Color(102, 102, 255));
        top_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("aakar", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        top_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 30, 40));

        logout_btn.setBackground(new java.awt.Color(206, 17, 17));
        logout_btn.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("LogOut");
        logout_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout_btn.setBorderPainted(false);
        logout_btn.setFocusPainted(false);
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        top_panel.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 190, 60));

        getContentPane().add(top_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1200, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void add_a_vaccine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_a_vaccine_btnActionPerformed
        // TODO add your handling code here:
        vaccination_report_panel.setVisible(false);
        verify_user_panel.setVisible(false);
        add_vaccine_panel.setVisible(true);
    }//GEN-LAST:event_add_a_vaccine_btnActionPerformed

    private void VERIFY_USER_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERIFY_USER_btnActionPerformed
        // TODO add your handling code here:
        vaccination_report_panel.setVisible(false);
        add_vaccine_panel.setVisible(false);
        verify_user_panel.setVisible(true);
        DefaultTableModel t_model = ( DefaultTableModel)user_table.getModel();
        List<String[]> l = aapp.getUserData();
        for(String[] s : l)
        {
            t_model.addRow(s);
        }
        
    }//GEN-LAST:event_VERIFY_USER_btnActionPerformed

    private void submit_add_vaccine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_add_vaccine_btnActionPerformed
        // TODO add your handling code here:
        if(vaccine_name.getSelectedItem().equals("Select Vaccine Name")|| vaccine_count.getText().equals(""))
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Please Enter all the fields Properly....","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(aapp.addVaccine((String)vaccine_name.getSelectedItem(),Integer.parseInt(vaccine_count.getText())))
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Successfully Created Account... \nYou can login now","Success",JOptionPane.INFORMATION_MESSAGE);
                vaccine_name.setSelectedItem("Select Vaccine Name");
                vaccine_count.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Error While Creating Account..\n Try after some time...","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submit_add_vaccine_btnActionPerformed

    private void cancel_add_vaccine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_add_vaccine_btnActionPerformed
        // TODO add your handling code here:
        vaccine_name.setSelectedItem("Select Vaccine Name");
        vaccine_count.setText("");
    }//GEN-LAST:event_cancel_add_vaccine_btnActionPerformed

    private void vac_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vac_report_btnActionPerformed
        // TODO add your handling code here:
        add_vaccine_panel.setVisible(false);
        verify_user_panel.setVisible(false);
        vaccination_report_panel.setVisible(true);
        DefaultTableModel t_model = ( DefaultTableModel)report_table.getModel();
        t_model.setRowCount(0);
        List<String[]> l = aapp.getVaccinationReport();
        for(String[] s : l)
        {
            t_model.addRow(s);
        }
        
        // ---------------- TABLE DATA GOES HERE ------------------------
        
    }//GEN-LAST:event_vac_report_btnActionPerformed

    private void defaultPage()
    {
        DefaultTableModel t_model = ( DefaultTableModel)report_table.getModel();
        List<String[]> l = aapp.getVaccinationReport();
        for(String[] s : l)
        {
            t_model.addRow(s);
        }
    }
    private void delet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delet_btnActionPerformed
        int index = user_table.getSelectedRow();
        String aadhar_no = user_table.getValueAt(index, 3).toString();
        if(aapp.deleteUser(aadhar_no))
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Successfully Deleted Account...","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Issue in the Deletion of Account..\n Try after some time...","Error",JOptionPane.ERROR_MESSAGE);
        }
        DefaultTableModel t_model = ( DefaultTableModel)user_table.getModel();
        t_model.setRowCount(0);
        List<String[]> l = aapp.getUserData();
        for(String[] s : l)
        {
            t_model.addRow(s);
        }
    }//GEN-LAST:event_delet_btnActionPerformed

    private void verify_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify_btnActionPerformed
        // TODO add your handling code here:
        int index = user_table.getSelectedRow();
        String aadhar_no = user_table.getValueAt(index, 3).toString();
        if(aapp.verifyUser(aadhar_no))
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Successfully Verified Account...","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Issue in the verification of Account..\n Try after some time...","Error",JOptionPane.ERROR_MESSAGE);
        }
        DefaultTableModel t_model = ( DefaultTableModel)user_table.getModel();
        t_model.setRowCount(0);
        List<String[]> l = aapp.getUserData();
        for(String[] s : l)
        {
            t_model.addRow(s);
        }
    }//GEN-LAST:event_verify_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logout_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
               Admin a = new Admin();
               a.user_name = args[0];
                a.defaultPage();
               a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VERIFY_USER_btn;
    private javax.swing.JButton add_a_vaccine_btn;
    private javax.swing.JPanel add_vaccine_panel;
    private javax.swing.JPanel back_panel;
    private javax.swing.JButton cancel_add_vaccine_btn;
    private javax.swing.JButton delet_btn;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel left_panel;
    private javax.swing.JButton logout_btn;
    private javax.swing.JTable report_table;
    private javax.swing.JButton submit_add_vaccine_btn;
    private javax.swing.JPanel top_panel;
    private javax.swing.JTable user_table;
    private javax.swing.JButton vac_report_btn;
    private javax.swing.JPanel vaccination_report_panel;
    private javax.swing.JTextField vaccine_count;
    private javax.swing.JComboBox<String> vaccine_name;
    private javax.swing.JButton verify_btn;
    private javax.swing.JPanel verify_user_panel;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Dharmvir kumar
 */
public class RegistrationForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public RegistrationForm() {
        initComponents();
        conn = MyConnection.getConnection();
        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Closebtn = new javax.swing.JLabel();
        Uname = new javax.swing.JLabel();
        txtupass = new javax.swing.JTextField();
        txtusname = new javax.swing.JTextField();
        Uname1 = new javax.swing.JLabel();
        txtuphone = new javax.swing.JTextField();
        Uname2 = new javax.swing.JLabel();
        txtuemail = new javax.swing.JTextField();
        Uname3 = new javax.swing.JLabel();
        Sbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LogInPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registeration Form");

        Closebtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Closebtn.setForeground(new java.awt.Color(255, 0, 0));
        Closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closebtn.setText("X");
        Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Closebtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Closebtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Uname.setBackground(new java.awt.Color(255, 255, 255));
        Uname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Uname.setForeground(new java.awt.Color(153, 153, 153));
        Uname.setText("Enter Username :");

        txtupass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(153, 153, 153)));
        txtupass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupassActionPerformed(evt);
            }
        });

        txtusname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(153, 153, 153)));
        txtusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusnameActionPerformed(evt);
            }
        });

        Uname1.setBackground(new java.awt.Color(255, 255, 255));
        Uname1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Uname1.setForeground(new java.awt.Color(153, 153, 153));
        Uname1.setText("Enter Password :");

        txtuphone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(153, 153, 153)));
        txtuphone.setName(""); // NOI18N
        txtuphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuphoneActionPerformed(evt);
            }
        });

        Uname2.setBackground(new java.awt.Color(255, 255, 255));
        Uname2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Uname2.setForeground(new java.awt.Color(153, 153, 153));
        Uname2.setText("Enter E-mail Address :");

        txtuemail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(153, 153, 153)));
        txtuemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuemailActionPerformed(evt);
            }
        });
        txtuemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuemailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuemailKeyTyped(evt);
            }
        });

        Uname3.setBackground(new java.awt.Color(255, 255, 255));
        Uname3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Uname3.setForeground(new java.awt.Color(153, 153, 153));
        Uname3.setText("Enter Phone Number :");

        Sbtn.setBackground(new java.awt.Color(0, 153, 153));
        Sbtn.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Sbtn.setText("Submit");
        Sbtn.setToolTipText("");
        Sbtn.setBorder(null);
        Sbtn.setBorderPainted(false);
        Sbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SbtnMouseClicked(evt);
            }
        });
        Sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("already have an account ?");

        LogInPage.setBackground(new java.awt.Color(0, 153, 153));
        LogInPage.setForeground(new java.awt.Color(0, 204, 204));
        LogInPage.setText("Log In");
        LogInPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInPageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuemail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uname3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uname2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuphone, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusname, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uname1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtupass, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(LogInPage)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Uname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uname1)
                .addGap(4, 4, 4)
                .addComponent(txtupass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Uname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Uname3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogInPage)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtuphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuphoneActionPerformed

    private void txtusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusnameActionPerformed

    private void txtuemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuemailActionPerformed
        // TODO add your handling code here:
 
   
    }//GEN-LAST:event_txtuemailActionPerformed

    private void SbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SbtnActionPerformed

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        // TODO add your handling code here:
        
        
        this.dispose();
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void LogInPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInPageMouseClicked
        // TODO add your handling code here:
        LoginForm i = new LoginForm();
        i.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LogInPageMouseClicked

    private void SbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SbtnMouseClicked
        // TODO add your handling code here:
        
        String PATTERN = "^[a-zA-Z0-9]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtusname.getText());
        if(!match.matches()){   
            JOptionPane.showMessageDialog(null,"Name Format Incorrect","Name error",JOptionPane.ERROR_MESSAGE);
        }
        else { 
         String PATTERN4 = "^[a-zA-Z0-9]{0,20}$";
        Pattern patt4 = Pattern.compile(PATTERN4);
        Matcher match4 = patt4.matcher(txtupass.getText());
        if(!match4.matches()){
            JOptionPane.showMessageDialog(null, "You can Only enter Numaber and Letters","Password error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        String PATTERN2 = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat = Pattern.compile(PATTERN2);
        Matcher math = pat.matcher(txtuemail.getText());
        if(!math.matches()){
            JOptionPane.showMessageDialog(null, "Email Format Incorrect","Email error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        String PATTERN3 = "^[0-9]{0,10}$";
        Pattern patt2 = Pattern.compile(PATTERN3);
        Matcher math1 = patt2.matcher(txtuphone.getText());
        if(!math1.matches()){
            JOptionPane.showMessageDialog(null, " Phone Number Format Incorrect","Phone error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        int p = JOptionPane.showConfirmDialog(null, "Are you sure to add this account ?", "Add Rrecord", JOptionPane.YES_NO_OPTION);
        if (p==0){
            String sql = "insert into `user` (uname, upass, email, phone) values (?, ?, ?, ?)";
            try { 
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtusname.getText());
                pst.setString(2, txtupass.getText());
                pst.setString(3, txtuemail.getText());
                pst.setString(4,txtuphone.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data succesfully inserted");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data Not saved");
        }
       }
      }
     }
    }
    }//GEN-LAST:event_SbtnMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x, y);
        
    }//GEN-LAST:event_jPanel2MouseDragged

    private void txtupassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupassActionPerformed

    private void txtuemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuemailKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtuemailKeyReleased

    private void txtuemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuemailKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closebtn;
    private javax.swing.JLabel LogInPage;
    private javax.swing.JButton Sbtn;
    private javax.swing.JLabel Uname;
    private javax.swing.JLabel Uname1;
    private javax.swing.JLabel Uname2;
    private javax.swing.JLabel Uname3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtuemail;
    private javax.swing.JTextField txtupass;
    private javax.swing.JTextField txtuphone;
    private javax.swing.JTextField txtusname;
    // End of variables declaration//GEN-END:variables
}

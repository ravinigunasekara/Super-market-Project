package Super_Market;

import javax.swing.JOptionPane;

public class User_Homepage extends javax.swing.JFrame {

    public User_Homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        managepro = new javax.swing.JButton();
        manageuser = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(714, 413));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("-");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 43, 26));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 43, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Welcome to Fresh Deal Super");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 540, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sri Lanka's Freshest Grocery Store");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 130, 520, -1));

        managepro.setBackground(new java.awt.Color(0, 0, 255));
        managepro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        managepro.setForeground(new java.awt.Color(255, 255, 255));
        managepro.setText("MANAGE PRODUCT");
        managepro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageproActionPerformed(evt);
            }
        });
        getContentPane().add(managepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 60));

        manageuser.setBackground(new java.awt.Color(0, 0, 255));
        manageuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageuser.setForeground(new java.awt.Color(255, 255, 255));
        manageuser.setText("MANAGE USER");
        manageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageuserActionPerformed(evt);
            }
        });
        getContentPane().add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 60));

        billing.setBackground(new java.awt.Color(0, 0, 255));
        billing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billing.setForeground(new java.awt.Color(255, 255, 255));
        billing.setText("BILLING");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 170, 60));

        logout.setBackground(new java.awt.Color(0, 0, 255));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, 60));

        jTextField1.setBackground(new java.awt.Color(0, 255, 0));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Shop for the freshest produce and all your daily needs at the best prices with Fresh Deal Super.");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 710, 30));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Adobe Myungjo Std M", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("www.Freshdealsuper.lk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 270, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Super_Market/home.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        this.setExtendedState(Manageproduct.ICONIFIED); //MINIMIZE BUTTON
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0); //EXIT BUTTON
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void manageproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageproActionPerformed

         JOptionPane.showMessageDialog(this,"Only Admin Can Access");   //ERROR MESSAGE TO USER CAN'T ACCESS MANAGE PRODUCT PAGE
        
    }//GEN-LAST:event_manageproActionPerformed

    private void manageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageuserActionPerformed

       JOptionPane.showMessageDialog(this,"Only Admin Can Access");  //ERROR MESSAGE TO USER CAN'T ACCESS MANAGE USER PAGE
        
    }//GEN-LAST:event_manageuserActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed

        setVisible(false);
        new Billing().setVisible(true); //GO TO BILLING PAGE
    }//GEN-LAST:event_billingActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
            int a = JOptionPane.showConfirmDialog(null, "Do you want Logout","warning",JOptionPane.YES_NO_OPTION);  //YES OR NO OPTION
            
              if (a == JOptionPane.YES_OPTION) //WHEN I SELECT YES OPTIN
              {
        setVisible(false);
        new Login().setVisible(true);   //GO TO LOGIN PAGE
              }
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billing;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout;
    private javax.swing.JButton managepro;
    private javax.swing.JButton manageuser;
    // End of variables declaration//GEN-END:variables
}

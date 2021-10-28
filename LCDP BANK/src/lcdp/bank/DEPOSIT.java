/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdp.bank;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lcdp.bank.Bank.b;

/**
 *
 * @author as
 */
public class DEPOSIT extends javax.swing.JFrame {

    /**
     * Creates new form DEPOSIT
     */
    public DEPOSIT() {
        initComponents();
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
        LOGOUTD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DEPOSITAMOUNT = new javax.swing.JTextField();
        DTOCREDIT = new javax.swing.JButton();
        DTOBALANCE = new javax.swing.JButton();
        BACKMENUD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 805));
        setResizable(false);

        jPanel1.setLayout(null);

        LOGOUTD.setBackground(new java.awt.Color(85, 5, 14));
        LOGOUTD.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        LOGOUTD.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUTD.setText("LOG OUT");
        LOGOUTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTDActionPerformed(evt);
            }
        });
        jPanel1.add(LOGOUTD);
        LOGOUTD.setBounds(450, 20, 130, 40);

        jLabel2.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        jLabel2.setText("THE AMOUNT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 280, 170, 80);

        DEPOSITAMOUNT.setFont(new java.awt.Font("Compacta BT", 0, 18)); // NOI18N
        DEPOSITAMOUNT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 5, 14), 4));
        DEPOSITAMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITAMOUNTActionPerformed(evt);
            }
        });
        DEPOSITAMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DEPOSITAMOUNTKeyPressed(evt);
            }
        });
        jPanel1.add(DEPOSITAMOUNT);
        DEPOSITAMOUNT.setBounds(160, 340, 420, 40);

        DTOCREDIT.setBackground(new java.awt.Color(85, 5, 14));
        DTOCREDIT.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        DTOCREDIT.setForeground(new java.awt.Color(255, 255, 255));
        DTOCREDIT.setText("To Credit Card");
        DTOCREDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTOCREDITActionPerformed(evt);
            }
        });
        jPanel1.add(DTOCREDIT);
        DTOCREDIT.setBounds(280, 450, 170, 40);

        DTOBALANCE.setBackground(new java.awt.Color(85, 5, 14));
        DTOBALANCE.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        DTOBALANCE.setForeground(new java.awt.Color(255, 255, 255));
        DTOBALANCE.setText("To Balance");
        DTOBALANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTOBALANCEActionPerformed(evt);
            }
        });
        jPanel1.add(DTOBALANCE);
        DTOBALANCE.setBounds(280, 400, 170, 40);

        BACKMENUD.setBackground(new java.awt.Color(85, 5, 14));
        BACKMENUD.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        BACKMENUD.setForeground(new java.awt.Color(255, 255, 255));
        BACKMENUD.setText("BACK TO MENU");
        BACKMENUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKMENUDActionPerformed(evt);
            }
        });
        jPanel1.add(BACKMENUD);
        BACKMENUD.setBounds(270, 20, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/D E P O S I T PAGE.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGOUTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTDActionPerformed
        try {
            new LOGIN().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(DEPOSIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_LOGOUTDActionPerformed

    private void DEPOSITAMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITAMOUNTActionPerformed

    }//GEN-LAST:event_DEPOSITAMOUNTActionPerformed

    private void DTOCREDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTOCREDITActionPerformed
   if(  DEPOSITAMOUNT.getText().isEmpty()){
             new NOINPUT().setVisible(true);
         }
         else{
        b[Bank.i].depositCredit(Integer.parseInt(DEPOSITAMOUNT.getText()));
      new DONE().setVisible(true);
       this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
   }
    }//GEN-LAST:event_DTOCREDITActionPerformed

    private void DTOBALANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTOBALANCEActionPerformed
         if(  DEPOSITAMOUNT.getText().isEmpty()){
             new NOINPUT().setVisible(true);
         }
         else{
        b[Bank.i].deposit(Integer.parseInt(DEPOSITAMOUNT.getText()));
      new DONE().setVisible(true);
       this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
    }//GEN-LAST:event_DTOBALANCEActionPerformed

    private void BACKMENUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKMENUDActionPerformed
       MENU m = new MENU();
      String s1 = b[Bank.i].getFirstname();
      String s2 = b[Bank.i].getLastname();
      m.setVisible(true);
      m.jLabel2.setText("Hello"+"  "+s1+" "+s2);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_BACKMENUDActionPerformed

    private void DEPOSITAMOUNTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DEPOSITAMOUNTKeyPressed
char C = evt.getKeyChar();
String user = DEPOSITAMOUNT.getText();
int length = user.length();

        if(Character.isISOControl(C)||(Character.isDigit(C) && length<=8 )){
    DEPOSITAMOUNT.setEditable(true);
   
   }

else{
     DEPOSITAMOUNT.setEditable(false);
}               
    }//GEN-LAST:event_DEPOSITAMOUNTKeyPressed

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
            java.util.logging.Logger.getLogger(DEPOSIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEPOSIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEPOSIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEPOSIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEPOSIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKMENUD;
    private javax.swing.JTextField DEPOSITAMOUNT;
    private javax.swing.JButton DTOBALANCE;
    private javax.swing.JButton DTOCREDIT;
    private javax.swing.JButton LOGOUTD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

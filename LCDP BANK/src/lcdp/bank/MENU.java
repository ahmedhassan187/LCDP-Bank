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
import static lcdp.bank.CHECKSTATUSPAGE.AVALIABLECREDIT;

/**
 *
 * @author as
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
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
        MENUCS = new javax.swing.JButton();
        MENUTRANSFER = new javax.swing.JButton();
        MENUDEPOSIT = new javax.swing.JButton();
        MENUWITHDRAW = new javax.swing.JButton();
        MENULOGOUT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 805));
        setResizable(false);

        jPanel1.setLayout(null);

        MENUCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/check status.png"))); // NOI18N
        MENUCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUCSActionPerformed(evt);
            }
        });
        jPanel1.add(MENUCS);
        MENUCS.setBounds(180, 600, 219, 141);

        MENUTRANSFER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/TRANSFER.png"))); // NOI18N
        MENUTRANSFER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUTRANSFERActionPerformed(evt);
            }
        });
        jPanel1.add(MENUTRANSFER);
        MENUTRANSFER.setBounds(180, 150, 219, 141);

        MENUDEPOSIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/deposit.png"))); // NOI18N
        MENUDEPOSIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUDEPOSITActionPerformed(evt);
            }
        });
        jPanel1.add(MENUDEPOSIT);
        MENUDEPOSIT.setBounds(180, 300, 219, 141);

        MENUWITHDRAW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/withdraw .png"))); // NOI18N
        MENUWITHDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUWITHDRAWActionPerformed(evt);
            }
        });
        jPanel1.add(MENUWITHDRAW);
        MENUWITHDRAW.setBounds(180, 450, 219, 141);

        MENULOGOUT.setBackground(new java.awt.Color(85, 5, 14));
        MENULOGOUT.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        MENULOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        MENULOGOUT.setText("LOG OUT");
        MENULOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENULOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(MENULOGOUT);
        MENULOGOUT.setBounds(450, 20, 130, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 90, 280, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUCSActionPerformed
    CHECKSTATUSPAGE C = new CHECKSTATUSPAGE();
    CREDITORNO cre = new CREDITORNO();
      b[Bank.i].setDebt();
      int deb = b[Bank.i].getDebt();
      if (Bank.flag){
       if(b[Bank.i].getCreditamount() >= 20000){
         b[Bank.i].deposit(-deb);
         b[Bank.i].setCreditcard(20000);
         b[Bank.i].updateDate();
      }
      else {
        REPAY RE = new REPAY();
       RE.TIMEREPAY.setText(b[Bank.i].getPeriod());     
       String s2 = Integer.toString(deb);
       C.BORROWED.setText(s2);
       
       
      }
      int bal = b[Bank.i].checkBalance();
      String s = Integer.toString(bal);
      b[Bank.i].setStatus();
      C.AVALIABLECREDIT.setText(s);
      if (b[Bank.i].getStatus()){
       C.TIMELEFT.setText(b[Bank.i].getPeriod());
      }
      C.setVisible(true);
      }
      else {
      if(b[Bank.i].getCreditamount() >= 10000){
         b[Bank.i].deposit(-deb);
         b[Bank.i].setCreditcard(10000);
         b[Bank.i].updateDate();
      }
      else {
          REPAY RE = new REPAY();
          RE.TIMEREPAY.setText(b[Bank.i].getPeriod());     
       String s2 = Integer.toString(deb);
       C.BORROWED.setText(s2);
       
       
      }
      int bal = b[Bank.i].checkBalance();
      String s = Integer.toString(bal);
      b[Bank.i].setStatus();
      C.AVALIABLECREDIT.setText(s);
      if (b[Bank.i].getStatus()){
       C.TIMELEFT.setText(b[Bank.i].getPeriod());
      }
      C.setVisible(true);

      }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_MENUCSActionPerformed

    private void MENUTRANSFERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUTRANSFERActionPerformed
        new TRANSFERPAGE().setVisible(true);
         this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_MENUTRANSFERActionPerformed

    private void MENUDEPOSITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUDEPOSITActionPerformed
        new DEPOSIT().setVisible(true); 
         this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_MENUDEPOSITActionPerformed

    private void MENUWITHDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUWITHDRAWActionPerformed
   try {
                    new WITHDRAWPAGE().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(WITHDRAWPAGE.class.getName()).log(Level.SEVERE, null, ex);
                }
    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
             
    }//GEN-LAST:event_MENUWITHDRAWActionPerformed

    private void MENULOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENULOGOUTActionPerformed
        try {    
            new LOGIN().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_MENULOGOUTActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUCS;
    private javax.swing.JButton MENUDEPOSIT;
    private javax.swing.JButton MENULOGOUT;
    private javax.swing.JButton MENUTRANSFER;
    private javax.swing.JButton MENUWITHDRAW;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

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
public class TRANSFERPAGE extends javax.swing.JFrame {

    /**
     * Creates new form TRANSFERPAGE
     */
    public TRANSFERPAGE() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TRANSFERAMOUNT = new javax.swing.JTextField();
        RECIPIENT = new javax.swing.JTextField();
        SUBMITTRANSACTION = new javax.swing.JButton();
        TRANSFERTOMENU = new javax.swing.JButton();
        TRANSFERTOLOGOUT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 805));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        jLabel3.setText("AMOUNT TO TRANSFER");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 310, 170, 80);

        jLabel2.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        jLabel2.setText("RECIPIENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 220, 170, 80);

        TRANSFERAMOUNT.setFont(new java.awt.Font("Compacta BT", 0, 18)); // NOI18N
        TRANSFERAMOUNT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 5, 14), 4));
        TRANSFERAMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFERAMOUNTActionPerformed(evt);
            }
        });
        TRANSFERAMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TRANSFERAMOUNTKeyPressed(evt);
            }
        });
        jPanel1.add(TRANSFERAMOUNT);
        TRANSFERAMOUNT.setBounds(160, 370, 420, 40);

        RECIPIENT.setFont(new java.awt.Font("Compacta BT", 0, 18)); // NOI18N
        RECIPIENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 5, 14), 4));
        RECIPIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECIPIENTActionPerformed(evt);
            }
        });
        RECIPIENT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RECIPIENTKeyPressed(evt);
            }
        });
        jPanel1.add(RECIPIENT);
        RECIPIENT.setBounds(160, 280, 420, 40);

        SUBMITTRANSACTION.setBackground(new java.awt.Color(85, 5, 14));
        SUBMITTRANSACTION.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        SUBMITTRANSACTION.setForeground(new java.awt.Color(255, 255, 255));
        SUBMITTRANSACTION.setText("SUBMIT TRANSACTION");
        SUBMITTRANSACTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITTRANSACTIONActionPerformed(evt);
            }
        });
        jPanel1.add(SUBMITTRANSACTION);
        SUBMITTRANSACTION.setBounds(250, 430, 230, 40);

        TRANSFERTOMENU.setBackground(new java.awt.Color(85, 5, 14));
        TRANSFERTOMENU.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        TRANSFERTOMENU.setForeground(new java.awt.Color(255, 255, 255));
        TRANSFERTOMENU.setText("BACK TO MENU");
        TRANSFERTOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFERTOMENUActionPerformed(evt);
            }
        });
        jPanel1.add(TRANSFERTOMENU);
        TRANSFERTOMENU.setBounds(270, 20, 170, 40);

        TRANSFERTOLOGOUT.setBackground(new java.awt.Color(85, 5, 14));
        TRANSFERTOLOGOUT.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        TRANSFERTOLOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        TRANSFERTOLOGOUT.setText("LOG OUT");
        TRANSFERTOLOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFERTOLOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(TRANSFERTOLOGOUT);
        TRANSFERTOLOGOUT.setBounds(450, 20, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/transfer page.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 770);

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

    private void RECIPIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECIPIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECIPIENTActionPerformed

    private void SUBMITTRANSACTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITTRANSACTIONActionPerformed
       if(  TRANSFERAMOUNT.getText().isEmpty() || RECIPIENT.getText().isEmpty()){
             new NOINPUT().setVisible(true);
         }
         else{
        if ( b[Bank.i].checkUserb(Integer.parseInt(RECIPIENT.getText()),b)){
         int rec = b[Bank.i].checkUser(Integer.parseInt(RECIPIENT.getText()),b);
         if (Integer.parseInt(TRANSFERAMOUNT.getText()) <= b[Bank.i].checkBalance()){
         b[Bank.i].transferMoney(b[Bank.i],b[rec],Integer.parseInt(TRANSFERAMOUNT.getText())); 
         new DONE().setVisible(true);
       this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
         }
         else {
          new TRANSFERERROR().setVisible(true);
         }
        }
        else {
            
        new INVALID2().setVisible(true);
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
       }
    }//GEN-LAST:event_SUBMITTRANSACTIONActionPerformed

    private void TRANSFERTOMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFERTOMENUActionPerformed
      MENU m = new MENU();
      String s1 = b[Bank.i].getFirstname();
      String s2 = b[Bank.i].getLastname();
      m.setVisible(true);
      m.jLabel2.setText("Hello"+"  "+s1+" "+s2);
       this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_TRANSFERTOMENUActionPerformed

    private void TRANSFERTOLOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFERTOLOGOUTActionPerformed
        try {
            new LOGIN().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TRANSFERPAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_TRANSFERTOLOGOUTActionPerformed

    private void TRANSFERAMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFERAMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRANSFERAMOUNTActionPerformed

    private void RECIPIENTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RECIPIENTKeyPressed
char C = evt.getKeyChar();
String user = RECIPIENT.getText();
int length = user.length();

        if(Character.isISOControl(C)||(Character.isDigit(C) && length<=8 )){
    RECIPIENT.setEditable(true);
   
   }

else{
     RECIPIENT.setEditable(false);
}               
    }//GEN-LAST:event_RECIPIENTKeyPressed

    private void TRANSFERAMOUNTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TRANSFERAMOUNTKeyPressed
char C = evt.getKeyChar();
String user = TRANSFERAMOUNT.getText();
int length = user.length();

        if(Character.isISOControl(C)||(Character.isDigit(C) && length<=8 )){
    TRANSFERAMOUNT.setEditable(true);
   
   }

else{
     TRANSFERAMOUNT.setEditable(false);
}               
    }//GEN-LAST:event_TRANSFERAMOUNTKeyPressed

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
            java.util.logging.Logger.getLogger(TRANSFERPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSFERPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSFERPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSFERPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSFERPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RECIPIENT;
    private javax.swing.JButton SUBMITTRANSACTION;
    private javax.swing.JTextField TRANSFERAMOUNT;
    private javax.swing.JButton TRANSFERTOLOGOUT;
    private javax.swing.JButton TRANSFERTOMENU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

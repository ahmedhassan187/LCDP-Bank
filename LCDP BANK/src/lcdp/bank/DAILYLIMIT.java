/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdp.bank;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static lcdp.bank.Bank.b;

/**
 *
 * @author as
 */
public class DAILYLIMIT extends javax.swing.JFrame {

    /**
     * Creates new form DAILYLIMIT
     */
    public DAILYLIMIT() {
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
        BACKMENUDL = new javax.swing.JButton();
        LOGOUTDL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        BACKMENUDL.setBackground(new java.awt.Color(85, 5, 14));
        BACKMENUDL.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        BACKMENUDL.setForeground(new java.awt.Color(255, 255, 255));
        BACKMENUDL.setText("BACK TO MENU");
        BACKMENUDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKMENUDLActionPerformed(evt);
            }
        });
        jPanel1.add(BACKMENUDL);
        BACKMENUDL.setBounds(300, 330, 170, 40);

        LOGOUTDL.setBackground(new java.awt.Color(85, 5, 14));
        LOGOUTDL.setFont(new java.awt.Font("Compacta BT", 0, 24)); // NOI18N
        LOGOUTDL.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUTDL.setText("LOG OUT");
        LOGOUTDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTDLActionPerformed(evt);
            }
        });
        jPanel1.add(LOGOUTDL);
        LOGOUTDL.setBounds(300, 380, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcdp/bank/DAILYLIMIT.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKMENUDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKMENUDLActionPerformed
        MENU m = new MENU();
        String s1 = b[Bank.i].getFirstname();
        String s2 = b[Bank.i].getLastname();
        m.setVisible(true);
        m.jLabel2.setText("Hello"+"  "+s1+" "+s2);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_BACKMENUDLActionPerformed

    private void LOGOUTDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTDLActionPerformed

        try {
            new LOGIN().setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(DAILYLIMIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_LOGOUTDLActionPerformed

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
            java.util.logging.Logger.getLogger(DAILYLIMIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAILYLIMIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAILYLIMIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAILYLIMIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAILYLIMIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKMENUDL;
    private javax.swing.JButton LOGOUTDL;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

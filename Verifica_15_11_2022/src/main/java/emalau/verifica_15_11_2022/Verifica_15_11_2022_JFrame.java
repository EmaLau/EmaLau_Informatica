/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emalau.verifica_15_11_2022;

/**
 *
 * @author emalau
 */
public class Verifica_15_11_2022_JFrame extends javax.swing.JFrame {

    Verifica_15_11_2022_Class VClass = new Verifica_15_11_2022_Class();
    String Operando;

    /**
     * Creates new form Verifica_15_11_2022_JFrame
     */
    public Verifica_15_11_2022_JFrame() {
        initComponents();
        NomeECognome.setText("Emanuele Lauro");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeECognome = new java.awt.Label();
        Moltiplicazione = new javax.swing.JButton();
        Divisione = new javax.swing.JButton();
        Totale = new javax.swing.JButton();
        PrimoNumero = new javax.swing.JTextField();
        SecondoNumero = new javax.swing.JTextField();
        TotaleOut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TotaleText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NomeECognome.setText("Ciao");

        Moltiplicazione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Moltiplicazione.setText("*");
        Moltiplicazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoltiplicazioneActionPerformed(evt);
            }
        });

        Divisione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Divisione.setText("/");
        Divisione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisioneActionPerformed(evt);
            }
        });

        Totale.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Totale.setText("Totale");
        Totale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaleActionPerformed(evt);
            }
        });

        PrimoNumero.setText("0");
        PrimoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimoNumeroActionPerformed(evt);
            }
        });

        SecondoNumero.setText("0");
        SecondoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondoNumeroActionPerformed(evt);
            }
        });

        TotaleOut.setText("0");
        TotaleOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaleOutActionPerformed(evt);
            }
        });

        jLabel1.setText("Primo Numero");

        jLabel2.setText("Secondo Numero");

        TotaleText.setText("Il Totale è");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Totale)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TotaleText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotaleOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrimoNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SecondoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Moltiplicazione, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Divisione, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NomeECognome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeECognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Moltiplicazione)
                        .addGap(48, 48, 48)
                        .addComponent(Divisione))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrimoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecondoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotaleOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotaleText))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Totale)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoltiplicazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoltiplicazioneActionPerformed
        // TODO add your handling code here:
        Operando = "*";
        VClass.set_n1(Double.parseDouble(PrimoNumero.getText()));
        VClass.set_operando(Operando);
    }//GEN-LAST:event_MoltiplicazioneActionPerformed

    private void DivisioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisioneActionPerformed
        // TODO add your handling code here:
        Operando = "/";
        VClass.set_n1(Double.parseDouble(PrimoNumero.getText()));
        VClass.set_operando(Operando);
    }//GEN-LAST:event_DivisioneActionPerformed

    private void PrimoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrimoNumeroActionPerformed

    private void SecondoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondoNumeroActionPerformed

    private void TotaleOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaleOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaleOutActionPerformed

    private void TotaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaleActionPerformed
        // TODO add your handling code here:
        if ("*".equals(Operando)) {
            VClass.set_n2(Double.parseDouble(SecondoNumero.getText()));
            TotaleText.setText("Il Risultato della Moltiplicazione è:");
            TotaleOut.setText(Double.toString(VClass.get_totale()));
        } else if ("/".equals(Operando)) {
            VClass.set_n2(Double.parseDouble(SecondoNumero.getText()));
            if (VClass.get_n2() == 0) {
                TotaleText.setText("Non è possibile fare diviso 0");
            } else if (VClass.get_n1() == 0) {
                TotaleText.setText("Non è possibile fare diviso 0");
            } else if (VClass.get_n2() != 0) {
                TotaleText.setText("Il Risultato della Divisione è:");
            }
            TotaleOut.setText(Double.toString(VClass.get_totale()));
        }
    }//GEN-LAST:event_TotaleActionPerformed

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
            java.util.logging.Logger.getLogger(Verifica_15_11_2022_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verifica_15_11_2022_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verifica_15_11_2022_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verifica_15_11_2022_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verifica_15_11_2022_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Divisione;
    private javax.swing.JButton Moltiplicazione;
    private java.awt.Label NomeECognome;
    private javax.swing.JTextField PrimoNumero;
    private javax.swing.JTextField SecondoNumero;
    private javax.swing.JButton Totale;
    private javax.swing.JTextField TotaleOut;
    private javax.swing.JLabel TotaleText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

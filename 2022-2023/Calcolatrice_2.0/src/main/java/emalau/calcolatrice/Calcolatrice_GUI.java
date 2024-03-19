package emalau.calcolatrice;

public class Calcolatrice_GUI extends javax.swing.JFrame {

    Calcolatrice_Class calc = new Calcolatrice_Class();
    
    boolean point;

    public Calcolatrice_GUI() {
        initComponents();
    }

    private void set_Display(String num) {
        if ("0".equals(Calc_text.getText())) {
            Calc_text.setText(num);
        } else {
            Calc_text.setText(Calc_text.getText() + num);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Calc_text = new javax.swing.JTextField();
        Btn_1 = new javax.swing.JButton();
        Btn_2 = new javax.swing.JButton();
        Btn_3 = new javax.swing.JButton();
        Btn_4 = new javax.swing.JButton();
        Btn_5 = new javax.swing.JButton();
        Btn_6 = new javax.swing.JButton();
        Btn_7 = new javax.swing.JButton();
        Btn_8 = new javax.swing.JButton();
        Btn_9 = new javax.swing.JButton();
        Btn_0 = new javax.swing.JButton();
        Canc = new javax.swing.JButton();
        Addizione = new javax.swing.JButton();
        Sottrazione = new javax.swing.JButton();
        Divisione = new javax.swing.JButton();
        Moltiplicazione = new javax.swing.JButton();
        Totale = new javax.swing.JButton();
        Punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calc_text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Calc_text.setText("0");
        Calc_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_textActionPerformed(evt);
            }
        });

        Btn_1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_1.setText("1");
        Btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_1ActionPerformed(evt);
            }
        });

        Btn_2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_2.setText("2");
        Btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_2ActionPerformed(evt);
            }
        });

        Btn_3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_3.setText("3");
        Btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_3ActionPerformed(evt);
            }
        });

        Btn_4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_4.setText("4");
        Btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_4ActionPerformed(evt);
            }
        });

        Btn_5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_5.setText("5");
        Btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_5ActionPerformed(evt);
            }
        });

        Btn_6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_6.setText("6");
        Btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_6ActionPerformed(evt);
            }
        });

        Btn_7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_7.setText("7");
        Btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_7ActionPerformed(evt);
            }
        });

        Btn_8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_8.setText("8");
        Btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_8ActionPerformed(evt);
            }
        });

        Btn_9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_9.setText("9");
        Btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_9ActionPerformed(evt);
            }
        });

        Btn_0.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Btn_0.setText("0");
        Btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_0ActionPerformed(evt);
            }
        });

        Canc.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Canc.setText("C");
        Canc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancActionPerformed(evt);
            }
        });

        Addizione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Addizione.setText("+");
        Addizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddizioneActionPerformed(evt);
            }
        });

        Sottrazione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Sottrazione.setText("-");
        Sottrazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SottrazioneActionPerformed(evt);
            }
        });

        Divisione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Divisione.setText(":");
        Divisione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisioneActionPerformed(evt);
            }
        });

        Moltiplicazione.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Moltiplicazione.setText("x");
        Moltiplicazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoltiplicazioneActionPerformed(evt);
            }
        });

        Totale.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Totale.setText("=");
        Totale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaleActionPerformed(evt);
            }
        });

        Punto.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Punto.setText(".");
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calc_text)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Divisione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Canc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addizione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Moltiplicazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Totale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calc_text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addizione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divisione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Canc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Moltiplicazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Totale, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Calc_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_textActionPerformed

    }//GEN-LAST:event_Calc_textActionPerformed

    private void Btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_0ActionPerformed
        set_Display("0");
    }//GEN-LAST:event_Btn_0ActionPerformed

    private void Btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_1ActionPerformed
        set_Display("1");
    }//GEN-LAST:event_Btn_1ActionPerformed

    private void Btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_2ActionPerformed
        set_Display("2");
    }//GEN-LAST:event_Btn_2ActionPerformed

    private void Btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_3ActionPerformed
        set_Display("3");
    }//GEN-LAST:event_Btn_3ActionPerformed

    private void Btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_4ActionPerformed
        set_Display("4");
    }//GEN-LAST:event_Btn_4ActionPerformed

    private void Btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_5ActionPerformed
        set_Display("5");
    }//GEN-LAST:event_Btn_5ActionPerformed

    private void Btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_6ActionPerformed
        set_Display("6");
    }//GEN-LAST:event_Btn_6ActionPerformed

    private void Btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_7ActionPerformed
        set_Display("7");
    }//GEN-LAST:event_Btn_7ActionPerformed

    private void Btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_8ActionPerformed
        set_Display("8");
    }//GEN-LAST:event_Btn_8ActionPerformed

    private void Btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_9ActionPerformed
        set_Display("9");
    }//GEN-LAST:event_Btn_9ActionPerformed

    private void CancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancActionPerformed
        Calc_text.setText("0");
        calc.set_reset(true);
        point = true;
    }//GEN-LAST:event_CancActionPerformed

    private void AddizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddizioneActionPerformed
        calc.set_n1(Calc_text.getText());
        calc.set_operando("+");
        set_Display("+");
        point = true;
    }//GEN-LAST:event_AddizioneActionPerformed

    private void SottrazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SottrazioneActionPerformed
        calc.set_n1(Calc_text.getText());
        calc.set_operando("-");
        set_Display("-");
        point = true;
    }//GEN-LAST:event_SottrazioneActionPerformed

    private void DivisioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisioneActionPerformed
        calc.set_n1(Calc_text.getText());
        calc.set_operando(":");
        set_Display(":");
        point = true;
    }//GEN-LAST:event_DivisioneActionPerformed

    private void MoltiplicazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoltiplicazioneActionPerformed
        calc.set_n1(Calc_text.getText());
        calc.set_operando("*");
        set_Display("*");
        point = true;

    }//GEN-LAST:event_MoltiplicazioneActionPerformed

    private void TotaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaleActionPerformed
        calc.set_n2(Calc_text.getText());
        Calc_text.setText(Calc_text.getText() + " = " + Double.toString(calc.get_tot()));
    }//GEN-LAST:event_TotaleActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        //set_Display(".");
        if (point == true) {
            set_Display(".");
            point = false;
        }
            
    }//GEN-LAST:event_PuntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcolatrice_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addizione;
    private javax.swing.JButton Btn_0;
    private javax.swing.JButton Btn_1;
    private javax.swing.JButton Btn_2;
    private javax.swing.JButton Btn_3;
    private javax.swing.JButton Btn_4;
    private javax.swing.JButton Btn_5;
    private javax.swing.JButton Btn_6;
    private javax.swing.JButton Btn_7;
    private javax.swing.JButton Btn_8;
    private javax.swing.JButton Btn_9;
    private javax.swing.JTextField Calc_text;
    private javax.swing.JButton Canc;
    private javax.swing.JButton Divisione;
    private javax.swing.JButton Moltiplicazione;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Sottrazione;
    private javax.swing.JButton Totale;
    // End of variables declaration//GEN-END:variables
}

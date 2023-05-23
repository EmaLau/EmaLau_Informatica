package emalau.calcolatrice;

public class Calcolatrice_GUI extends javax.swing.JFrame {

    Calcolatrice_Class calc = new Calcolatrice_Class();

    boolean point;

    public Calcolatrice_GUI() {
        initComponents();
        calc.set_rad_deg(0);
    }

    private void set_Display(String num) {
        if ("0".equals(Calc_text.getText())) {
            Calc_text.setText(num);
        } else {
            Calc_text.setText(Calc_text.getText() + num);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        btn_sin = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_pi = new javax.swing.JButton();
        btn_sqrt = new javax.swing.JButton();
        cb_rad_deg = new javax.swing.JComboBox<>();

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

        btn_sin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_sin.setText("sin");
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });

        btn_cos.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_cos.setText("cos");
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });

        btn_tan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_tan.setText("tan");
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });

        btn_pi.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_pi.setText("π");
        btn_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piActionPerformed(evt);
            }
        });

        btn_sqrt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_sqrt.setText("√");
        btn_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqrtActionPerformed(evt);
            }
        });

        cb_rad_deg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "rad", "deg" }));
        cb_rad_deg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_rad_degActionPerformed(evt);
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
                                .addGap(6, 6, 6)
                                .addComponent(Btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
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
                                .addComponent(Moltiplicazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Totale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Divisione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Addizione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Canc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_rad_deg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calc_text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addizione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Sottrazione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_rad_deg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
        calc.set_sin(Double.parseDouble(Calc_text.getText()));
        Calc_text.setText(String.valueOf(calc.get_sin()));
        point = true;
    }//GEN-LAST:event_btn_sinActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
        calc.set_cos(Double.parseDouble(Calc_text.getText()));
        Calc_text.setText(String.valueOf(calc.get_cos()));
        point = true;
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
        calc.set_tan(Double.parseDouble(Calc_text.getText()));
        Calc_text.setText(String.valueOf(calc.get_tan()));
        point = true;
    }//GEN-LAST:event_btn_tanActionPerformed

    private void btn_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_piActionPerformed
        Calc_text.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_btn_piActionPerformed

    private void btn_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqrtActionPerformed
        calc.set_sqrt(Double.parseDouble(Calc_text.getText()));
        Calc_text.setText(String.valueOf(calc.get_sqrt()));
        point = true;
    }//GEN-LAST:event_btn_sqrtActionPerformed

    private void cb_rad_degActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_rad_degActionPerformed
        calc.set_rad_deg(cb_rad_deg.getSelectedIndex());
    }//GEN-LAST:event_cb_rad_degActionPerformed

    private void Calc_textActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void Btn_0ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("0");
    }

    private void Btn_1ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("1");
    }

    private void Btn_2ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("2");
    }

    private void Btn_3ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("3");
    }

    private void Btn_4ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("4");
    }

    private void Btn_5ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("5");
    }

    private void Btn_6ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("6");
    }

    private void Btn_7ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("7");
    }

    private void Btn_8ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("8");
    }

    private void Btn_9ActionPerformed(java.awt.event.ActionEvent evt) {
        set_Display("9");
    }

    private void CancActionPerformed(java.awt.event.ActionEvent evt) {
        Calc_text.setText("0");
        calc.set_reset(true);
        point = true;

    }

    private void AddizioneActionPerformed(java.awt.event.ActionEvent evt) {
        calc.set_n1(Double.parseDouble(Calc_text.getText()));
        calc.set_operando("+");
        Calc_text.setText("0");
        point = true;

    }

    private void SottrazioneActionPerformed(java.awt.event.ActionEvent evt) {
        calc.set_n1(Double.parseDouble(Calc_text.getText()));
        calc.set_operando("-");
        Calc_text.setText("0");
        point = true;

    }

    private void DivisioneActionPerformed(java.awt.event.ActionEvent evt) {
        calc.set_n1(Double.parseDouble(Calc_text.getText()));
        calc.set_operando(":");
        Calc_text.setText("0");
    }

    private void MoltiplicazioneActionPerformed(java.awt.event.ActionEvent evt) {
        calc.set_n1(Double.parseDouble(Calc_text.getText()));
        calc.set_operando("*");
        Calc_text.setText("0");
        point = true;

    }

    private void TotaleActionPerformed(java.awt.event.ActionEvent evt) {
        calc.set_n2(Double.parseDouble(Calc_text.getText()));
        Calc_text.setText(Double.toString(calc.get_tot()));
        point = true;

    }

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {
        if (point == true) {
            set_Display(".");
            point = false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

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
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_pi;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_sqrt;
    private javax.swing.JButton btn_tan;
    private javax.swing.JComboBox<String> cb_rad_deg;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.libreria;

/**
 *
 * @author emalau
 */
public class Library_List_JFrame extends javax.swing.JFrame {

    static Book_Class[] Book = new Book_Class[Library_Class.max_volumi];
    int count;

    /**
     * Creates new form Library_List_JFrame
     *
     * @param lib
     */
    public Library_List_JFrame(Book_Class[] book) {
        initComponents();
        this.Book = book;
        set_book(count);

    }

    private void set_book(int indice) {
        this.jl_n.setText(Integer.toString(count));
        this.jl_author.setText(Book[indice].getAutore());
        this.jl_editor.setText(Book[indice].getProduttore());
        this.jl_np.setText(Integer.toString(Book[indice].getNumeroPagine()));
        this.jl_title.setText(Book[indice].getTitolo());
        this.jl_isbn.setText(Book[indice].getSpn());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_anb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_title = new javax.swing.JLabel();
        jl_author = new javax.swing.JLabel();
        jl_editor = new javax.swing.JLabel();
        jl_np = new javax.swing.JLabel();
        jl_isbn = new javax.swing.JLabel();
        jbn_lbook = new javax.swing.JButton();
        jbn_rbook = new javax.swing.JButton();
        jl_n = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_anb.setText("Add new Book");
        btn_anb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anbActionPerformed(evt);
            }
        });

        jLabel1.setText("Title:");

        jLabel2.setText("Author:");

        jLabel3.setText("Editor:");

        jLabel4.setText("Number Pages:");

        jLabel5.setText("ISBN:");

        jbn_lbook.setText("<");
        jbn_lbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_lbookActionPerformed(evt);
            }
        });

        jbn_rbook.setText(">");
        jbn_rbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_rbookActionPerformed(evt);
            }
        });

        jl_n.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 272, Short.MAX_VALUE)
                        .addComponent(btn_anb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jl_title))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jl_author))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jl_editor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jl_np))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbn_lbook)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl_n))
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jl_isbn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jbn_rbook)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jl_title))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jl_author))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jl_editor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jl_np))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jl_isbn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_lbook)
                    .addComponent(jbn_rbook)
                    .addComponent(jl_n))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btn_anb)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anbActionPerformed
        Library_JFrame_1 LJ1 = new Library_JFrame_1();
        LJ1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_anbActionPerformed

    private void jbn_lbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_lbookActionPerformed
//Left
        if (count != 0) {
            count--;
            set_book(count);
        }

    }//GEN-LAST:event_jbn_lbookActionPerformed

    private void jbn_rbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_rbookActionPerformed
//right
        if (count >= 0 && count <= 0) {
            count++;
            set_book(count);
        }
    }//GEN-LAST:event_jbn_rbookActionPerformed

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
            java.util.logging.Logger.getLogger(Library_List_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_List_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_List_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_List_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_List_JFrame(Book).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbn_lbook;
    private javax.swing.JButton jbn_rbook;
    private javax.swing.JLabel jl_author;
    private javax.swing.JLabel jl_editor;
    private javax.swing.JLabel jl_isbn;
    private javax.swing.JLabel jl_n;
    private javax.swing.JLabel jl_np;
    private javax.swing.JLabel jl_title;
    // End of variables declaration//GEN-END:variables
}

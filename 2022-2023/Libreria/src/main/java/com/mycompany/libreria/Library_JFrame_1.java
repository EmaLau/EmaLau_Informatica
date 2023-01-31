/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libreria;

/**
 *
 * @author emalau
 */
public class Library_JFrame_1 extends javax.swing.JFrame {

    //Book_Class Book = new Book_Class();
    /**
     * Creates new form Libreria_Jframe_1
     */
    public Library_JFrame_1() {
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

        jLabel1 = new javax.swing.JLabel();
        tf_author_book = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_book_title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_number_pages_book = new javax.swing.JTextField();
        tf_editor_book = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_spn_book = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_library = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book Title");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tf_author_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_author_bookActionPerformed(evt);
            }
        });

        jLabel2.setText("Author");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tf_book_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_titleActionPerformed(evt);
            }
        });

        jLabel3.setText("Number Pages");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tf_number_pages_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_number_pages_bookActionPerformed(evt);
            }
        });

        tf_editor_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_editor_bookActionPerformed(evt);
            }
        });

        jLabel4.setText("Editor");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("ISBN");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerifyInputWhenFocusTarget(false);

        tf_spn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_spn_bookActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_library.setText("Go To Library");
        btn_library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_libraryActionPerformed(evt);
            }
        });

        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_author_book)
                            .addComponent(tf_book_title, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tf_editor_book, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tf_number_pages_book, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tf_spn_book, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_library)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_book_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btn_cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_author_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_editor_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_number_pages_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_spn_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_library)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_author_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_author_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_author_bookActionPerformed

    private void tf_book_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_titleActionPerformed

    private void tf_number_pages_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_number_pages_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_number_pages_bookActionPerformed

    private void tf_editor_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_editor_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_editor_bookActionPerformed

    private void tf_spn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_spn_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_spn_bookActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        /*
        Book.setAutore(tf_author_book.getText());
        Book.setNumeroPagine(Integer.getInteger(tf_number_pages_book.getText()));
        Book.setTitolo(tf_book_title.getText());
        Book.setSpn(tf_spn_book.getText());
        */
        Book_Class Book = new Book_Class(tf_book_title.getText(), tf_author_book.getText(), Integer.parseInt(tf_number_pages_book.getText()), tf_spn_book.getText(), tf_editor_book.getText());

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        tf_author_book.setText(" ");
        tf_book_title.setText(" ");
        tf_editor_book.setText(" ");
        tf_spn_book.setText(" ");
        tf_number_pages_book.setText(" ");
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_libraryActionPerformed
        Library_List_JFrame LLJ = new Library_List_JFrame();
        LLJ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_libraryActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        Library_Research_JFrame LRJ = new Library_Research_JFrame();
        LRJ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Library_JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_JFrame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_library;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf_author_book;
    private javax.swing.JTextField tf_book_title;
    private javax.swing.JTextField tf_editor_book;
    private javax.swing.JTextField tf_number_pages_book;
    private javax.swing.JTextField tf_spn_book;
    // End of variables declaration//GEN-END:variables
}

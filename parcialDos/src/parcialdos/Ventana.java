
package parcialdos;

public class Ventana extends javax.swing.JFrame {

    private arregloCuotaSocio socios;
    
    public Ventana() {
        initComponents();
        socios=new arregloCuotaSocio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtAdicionales = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdbFull = new javax.swing.JRadioButton();
        rdbBasica = new javax.swing.JRadioButton();
        rdbMejorada = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSocio = new javax.swing.JList();
        btnAgregarSocio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnFull = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFull = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFullMasDosAdicionales = new javax.swing.JTextField();
        btnFullDosAdicionales = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMejorada = new javax.swing.JTextField();
        btnMejorada = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnBasica = new javax.swing.JButton();
        txtBasica = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Socio");

        jLabel2.setText("Documento");

        jLabel3.setText("Cantidad Adicionales");

        jLabel4.setText("Tipo Cuota");

        buttonGroup1.add(rdbFull);
        rdbFull.setText("Full");

        buttonGroup1.add(rdbBasica);
        rdbBasica.setText("Basica");

        buttonGroup1.add(rdbMejorada);
        rdbMejorada.setText("Mejorada");

        jScrollPane1.setViewportView(lstSocio);

        btnAgregarSocio.setText("Agregar");
        btnAgregarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSocioActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFull.setText("Full");
        btnFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullActionPerformed(evt);
            }
        });

        jLabel5.setText("REPORTES");

        jLabel6.setText("Suma cuotass socios Full");

        jLabel7.setText("Socio Full mas 2 adicionales");

        btnFullDosAdicionales.setText("Full + 2 Adicionales");
        btnFullDosAdicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullDosAdicionalesActionPerformed(evt);
            }
        });

        jLabel8.setText("Suma cuotas ssocios Mejorada");

        btnMejorada.setText("Mejorada");
        btnMejorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejoradaActionPerformed(evt);
            }
        });

        jLabel9.setText("Suma cuotas socios Basica");

        btnBasica.setText("Basica");
        btnBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbFull)
                                                .addGap(46, 46, 46)
                                                .addComponent(rdbBasica)
                                                .addGap(55, 55, 55)
                                                .addComponent(rdbMejorada))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAdicionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(btnMejorada)
                                    .addComponent(jLabel9)
                                    .addComponent(btnBasica, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(btnFull, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBasica, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtMejorada)
                            .addComponent(txtFull))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62)
                        .addComponent(txtFullMasDosAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAgregarSocio)
                            .addGap(71, 71, 71)
                            .addComponent(jButton1)
                            .addGap(556, 556, 556))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFullDosAdicionales)
                            .addGap(192, 192, 192)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbFull)
                    .addComponent(rdbBasica)
                    .addComponent(rdbMejorada))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarSocio)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMejorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMejorada)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFullMasDosAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFull)
                    .addComponent(btnFullDosAdicionales))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSocioActionPerformed

        String nombre=txtNombre.getText();
        int documento=Integer.parseInt(txtDocumento.getText());
        int cantAdicionales=Integer.parseInt(txtAdicionales.getText());
        
        int tipo = 0;
        if (rdbBasica.isSelected())
            tipo = 1;
        else if (rdbMejorada.isSelected())
            tipo = 2;
        else if (rdbFull.isSelected())
            tipo = 3;
        
        Socio s= new Socio(documento, nombre, tipo, cantAdicionales);    
      //  lstSocio.setListData(socios.getSocios().toArray());
        socios.agregarSocio(s); 
        
    }//GEN-LAST:event_btnAgregarSocioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lstSocio.setListData(socios.getSocios().toArray());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMejoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejoradaActionPerformed
        txtMejorada.setText(String.valueOf(socios.facturacionTotalMejorada()));
    }//GEN-LAST:event_btnMejoradaActionPerformed

    private void btnBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicaActionPerformed
      txtBasica.setText(String.valueOf(socios.facturacionTotalBasica()));

    }//GEN-LAST:event_btnBasicaActionPerformed

    private void btnFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullActionPerformed
     txtFull.setText(String.valueOf(socios.facturacionTotalFull()));

    }//GEN-LAST:event_btnFullActionPerformed

    private void btnFullDosAdicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullDosAdicionalesActionPerformed
     txtFullMasDosAdicionales.setText(String.valueOf(socios.socioTotalFull()));

    }//GEN-LAST:event_btnFullDosAdicionalesActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSocio;
    private javax.swing.JButton btnBasica;
    private javax.swing.JButton btnFull;
    private javax.swing.JButton btnFullDosAdicionales;
    private javax.swing.JButton btnMejorada;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstSocio;
    private javax.swing.JRadioButton rdbBasica;
    private javax.swing.JRadioButton rdbFull;
    private javax.swing.JRadioButton rdbMejorada;
    private javax.swing.JTextField txtAdicionales;
    private javax.swing.JTextField txtBasica;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFull;
    private javax.swing.JTextField txtFullMasDosAdicionales;
    private javax.swing.JTextField txtMejorada;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
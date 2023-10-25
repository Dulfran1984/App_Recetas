package Vistas;

import Modelo.cls_recetas;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class frm_recetas extends javax.swing.JFrame {
    LinkedList<cls_recetas> Recetas = new LinkedList<>();
    boolean bln_sw;
    int int_posicion;
    public frm_recetas() {
        initComponents();
        btn_actualizar.setEnabled(false);
        btn_borrar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_ingredientes = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_chef = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de registro de recetas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Código:");

        txt_codigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ingredientes:");

        txa_ingredientes.setColumns(20);
        txa_ingredientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txa_ingredientes.setLineWrap(true);
        txa_ingredientes.setRows(5);
        jScrollPane1.setViewportView(txa_ingredientes);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Stock:");

        txt_stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Precio:");

        txt_precio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Chef:");

        txt_chef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo-nuevo.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta(4).png"))); // NOI18N
        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificado.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar(5).png"))); // NOI18N
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizado(1).png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_chef, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_chef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        txt_chef.setText("");
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_precio.setText("");
        txt_stock.setText("");
        txa_ingredientes.setText("");
        btn_actualizar.setEnabled(false);
        btn_borrar.setEnabled(false);
        txt_codigo.requestFocus();  
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Recetas.add(new cls_recetas(
        txt_codigo.getText(),
        txt_nombre.getText(),
        txa_ingredientes.getText(),
        Integer.parseInt(txt_stock.getText()),
        Float.parseFloat(txt_precio.getText()),
        txt_chef.getText()));
        JOptionPane.showMessageDialog(null, "Receta registrada con éxito","Guardar",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        bln_sw = false;
        int_posicion = 0;
        for (int i = 0; i < Recetas.size(); i++){
            if(txt_codigo.getText().equals(Recetas.get(i).getStr_codigo())){
                bln_sw = true;
                int_posicion = i;
                break;
            }
        }
        if (bln_sw == false){
            JOptionPane.showMessageDialog(null, "No se encontraron registros","Consultar",JOptionPane.ERROR_MESSAGE);
            btn_actualizar.setEnabled(false);
            btn_borrar.setEnabled(false);
        }else{
            txt_chef.setText(Recetas.get(int_posicion).getStr_chef());
            txt_nombre.setText(Recetas.get(int_posicion).getStr_nombre());
            txt_precio.setText(""+Recetas.get(int_posicion).getFlt_precio());
            txt_stock.setText(""+Recetas.get(int_posicion).getInt_stock());
            txa_ingredientes.setText(Recetas.get(int_posicion).getStr_ingredientes());
            btn_actualizar.setEnabled(true);
            btn_borrar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        Recetas.get(int_posicion).setFlt_precio(Float.parseFloat(txt_precio.getText()));
        Recetas.get(int_posicion).setInt_stock(Integer.parseInt(txt_stock.getText()));
        Recetas.get(int_posicion).setStr_chef(txt_chef.getText());
        Recetas.get(int_posicion).setStr_ingredientes(txa_ingredientes.getText());
        Recetas.get(int_posicion).setStr_nombre(txt_nombre.getText());
        JOptionPane.showConfirmDialog(null, "Receta actualizada con éxtio","Actualizar",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        btn_actualizar.setEnabled(false);
        btn_borrar.setEnabled(false);
        Recetas.remove(int_posicion);
        JOptionPane.showMessageDialog(null, "Receta borrada con éxito","Borrar",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_recetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_recetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txa_ingredientes;
    private javax.swing.JTextField txt_chef;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}

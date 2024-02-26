
package org.nodos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private ListaNodos listaNodo;
    private nodo nodo;
    private nodo Lnodo;
    private ArrayList<nodo> lista;
    
    public Main() {
        initComponents();
        lista = new ArrayList<>();
        listaNodo = new ListaNodos(lista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbID = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbPeso = new javax.swing.JLabel();
        txDatos = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbID.setText("ID");

        lbNombre.setText("Nombre");

        lbPeso.setText("Peso");

        txDatos.setText("Ingrese nodo a Buscar");

        txtID.setEnabled(false);

        txtNombre.setEnabled(false);

        txtPeso.setEnabled(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNombre)
                            .addComponent(lbPeso)
                            .addComponent(lbID)
                            .addComponent(txDatos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addGap(12, 12, 12)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDatos)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        txtPeso.setEnabled(false);
        txtNombre.setEnabled(false);
        try{
           nodo = new nodo();
           nodo.setNodo_ID(Integer.parseInt(txtID.getText()));
           nodo.setNodo_nombre(txtNombre.getText());
           nodo.setNodo_peso(Double.valueOf(txtPeso.getText()));
           
           if(nodoExiste(nodo.getNodo_ID(),nodo.getNodo_nombre())){
               JOptionPane.showMessageDialog(this,"Nodo existente con mismo nombre y/o ID");
               txtPeso.setEnabled(true);
               txtNombre.setEnabled(true);
           }else{
               listaNodo.AgregarNodo(nodo);
               lista = listaNodo.getActualizar();
               JOptionPane.showMessageDialog(this,"Nodo guardado"); 
               txtPeso.setText(null);
               txtNombre.setText(null);
               txtID.setText(null);
           } 
           }catch(Exception ex){
               JOptionPane.showMessageDialog(this,"Error: " + ex.getMessage());
               }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean nodoExiste(int id,String nombre){
        for(nodo n: lista){
            if(n.getNodo_ID()==id || n.getNodo_nombre().equals(nombre))
                return true;
        }
        return false;
    }
     
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        try{ 
            nodo = new nodo();
            nodo.setNodo_ID(Integer.parseInt(txtBuscar.getText()));
            nodo = listaNodo.BuscarNodo(nodo);
            if(nodo!=null){
                txtID.setText(String.valueOf(nodo.getNodo_ID()));
                txtNombre.setText(nodo.getNodo_nombre());
                txtPeso.setText(String.valueOf(nodo.getNodo_peso()));
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
                txtPeso.setEnabled(true);
                txtNombre.setEnabled(true);
                txtBuscar.setText(null);
                
                }else{
                 JOptionPane.showMessageDialog(this,"No se encontró el nodo");
                 txtBuscar.setText(null);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error: " + ex.getMessage());
                }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      
        txtNombre.setEnabled(true);
        txtPeso.setEnabled(true);
        
        if(lista.isEmpty()){
           txtID.setText("1");
           txtNombre.setText(null);
           txtPeso.setText(null);
           
       }else{
           Lnodo = lista.getLast();
           txtID.setText(String.valueOf(Lnodo.getNodo_ID()+1));
           txtNombre.setText(null);
           txtPeso.setText(null);
       }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       try{
            int ID = Integer.parseInt(txtID.getText());
            String Nombre = txtNombre.getText();
            Double Peso = Double.valueOf(txtPeso.getText());
            
            for(nodo n: lista){
                if(n.getNodo_ID() == ID)
                    n.setNodo_nombre(Nombre);
                    n.setNodo_peso(Peso);
            }
            txtID.setText(null);
            txtNombre.setText(null);
            txtPeso.setText(null);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            txtNombre.setEnabled(false);
            txtPeso.setEnabled(false);;
            JOptionPane.showMessageDialog(this,"Nodo actualizado");
       }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error: " + ex.getMessage());
            
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtID.setText(null);
        txtNombre.setText(null);
        txtPeso.setText(null);
        txtBuscar.setText(null);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        btnEditar.setEnabled(false);
        try{
        nodo = new nodo();
        nodo.setNodo_ID(Integer.parseInt(txtID.getText()));
        nodo.setNodo_nombre(txtNombre.getText());
        nodo.setNodo_peso(Double.valueOf(txtPeso.getText()));
        
        listaNodo.eliminarNodo(nodo);
        txtID.setText(null);
        txtNombre.setText(null);
        txtPeso.setText(null);
        txtBuscar.setText(null);
        JOptionPane.showMessageDialog(this,"Nodo eliminado");
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtNombre.setEnabled(false);
        txtPeso.setEnabled(false);;
        }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error: " + ex.getMessage());
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel txDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}

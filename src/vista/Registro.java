
package vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Hash_1;
import modelo.Sql_usuarios;
import modelo.Usuarios;


public class Registro extends javax.swing.JFrame {

    
    public Registro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        ContraseñaConf = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoDni = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        DNI = new javax.swing.JLabel();
        textoSexo = new javax.swing.JTextField();
        textoContraseña = new javax.swing.JPasswordField();
        textoConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registrarte");

        jLabel2.setText("Es rapido y facil");

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nombre.setText("Nombre");

        Apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Apellido.setText("Apellido");

        Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Contraseña.setText("Contraseña");

        ContraseñaConf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContraseñaConf.setText("Confirmar contraseña");

        Sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sexo.setText("Sexo");

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        textoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoApellidoActionPerformed(evt);
            }
        });

        textoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDniActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registrarte");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        DNI.setText("DNI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DNI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Apellido)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ContraseñaConf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Sexo)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(textoSexo)
                                    .addComponent(textoContraseña)
                                    .addComponent(textoConfirmar))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNI))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseña)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaConf)
                    .addComponent(textoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnRegistro)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
       
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoApellidoActionPerformed
        
    }//GEN-LAST:event_textoApellidoActionPerformed

    private void textoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDniActionPerformed
        
    }//GEN-LAST:event_textoDniActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        
       
        
        Sql_usuarios modSql = new Sql_usuarios();
        Usuarios mod = new Usuarios();
        
        String pass = new String(textoContraseña.getPassword());
        String passCon = new String(textoConfirmar.getPassword());
        
        if(pass.equals(passCon))
        {
            String nuevoPass = Hash_1.sha1(pass);
            
            mod.setDni(1);
            mod.setNombre(textoNombre.getText());
            mod.setApellido(textoApellido.getText());
            mod.setContraseña(nuevoPass);
            mod.setSexo(textoSexo.getText());
            
            try {
                if (modSql.registrar(mod)){
                   JOptionPane.showMessageDialog(null, "Registrado correctamente");
                   
                } else{
                     JOptionPane.showMessageDialog(null, "Error al registrarse");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña no coincide");
        }
        
        
    }//GEN-LAST:event_btnRegistroActionPerformed
    private void limpiar(){
        
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel ContraseñaConf;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JPasswordField textoConfirmar;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoSexo;
    // End of variables declaration//GEN-END:variables
}

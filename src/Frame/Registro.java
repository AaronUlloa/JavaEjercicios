package Frame;

import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        //this.setOpacity(0.5f);
        this.setLocationRelativeTo(null);
        comprobar();
    }

    Login login = new Login();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        chFam = new javax.swing.JCheckBox();
        chMan = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        chNo = new javax.swing.JCheckBox();
        chSi = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelHora1.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelHora1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rSLabelHora1.setForeground(new java.awt.Color(102, 255, 0));
        rSLabelHora1.setFont(new java.awt.Font("Cantarell Thin", 1, 24)); // NOI18N
        getContentPane().add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 160, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("DejaVu Sans", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(153, 0, 153));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 40));

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(153, 0, 153));
        txtUser.setOpaque(false);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 330, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 330, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 170, 10));

        jLabel3.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/calender.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 40));

        jLabel4.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("UserName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, 30));

        jLabel5.setFont(new java.awt.Font("SpaceMono Nerd Font", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 180, 20));

        jLabel6.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/User icon.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 40, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 330, 10));

        chFam.setOpaque(false);
        chFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFamActionPerformed(evt);
            }
        });
        jPanel1.add(chFam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        chMan.setOpaque(false);
        chMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chManActionPerformed(evt);
            }
        });
        jPanel1.add(chMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/Female User icon.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 40, 40));

        dtFecha.setBackground(new java.awt.Color(43, 43, 43));
        dtFecha.setForeground(new java.awt.Color(153, 0, 153));
        dtFecha.setOpaque(false);
        jPanel1.add(dtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, 20));

        jLabel8.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, 30));

        chNo.setForeground(new java.awt.Color(204, 204, 204));
        chNo.setText("NO");
        chNo.setOpaque(false);
        chNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNoActionPerformed(evt);
            }
        });
        jPanel1.add(chNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        chSi.setForeground(new java.awt.Color(204, 204, 204));
        chSi.setText("SI");
        chSi.setOpaque(false);
        chSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSiActionPerformed(evt);
            }
        });
        jPanel1.add(chSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 110, 10));

        jLabel9.setFont(new java.awt.Font("SpaceMono Nerd Font", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Visitas una Iglesia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 180, 20));

        jLabel10.setFont(new java.awt.Font("Source Code Variable", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/church.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 10));

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("GoMono Nerd Font Mono", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.setSelectedTextColor(new java.awt.Color(153, 0, 153));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 330, 40));

        btnRegistro.setBackground(new java.awt.Color(102, 0, 204));
        btnRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(204, 204, 204));
        btnRegistro.setText("REGISTRARSE");
        btnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 204), new java.awt.Color(153, 0, 153), new java.awt.Color(153, 0, 204)));
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setOpaque(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 320, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 590));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DiosTeAma.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String usuario = txtUser.getText();
        String contra = new String(txtPass.getPassword());
        String fecha = new String(dtFecha.getDateFormatString());
        
        
        if (comprobar() == 1) {

            Usuario obj = new Usuario();

            if (Usuario.verificarUsuarioNuevo(usuario) == -1) {
                obj.setName(usuario);
                obj.setPassword(contra);
                obj.setFecha(fecha);
                ListaUsuario.agregar(obj);

                JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO CORRECTAMENTE ! :) !"
                        + "\nUSER: " + usuario
                        + "\nPass: " + contra
                        + "\n" );

                this.setVisible(false);
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ESTE NOMBRE DE USUARIO, YA HA SIDO REGISTRADO !:(!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "FAVOR VERIFICAR TODOS LOS CAMPOS!");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void chManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chManActionPerformed
        
        if (chMan.isSelected() == true){
            chFam.setEnabled(false);
        }else{
            chFam.setEnabled(true);
        }
    }//GEN-LAST:event_chManActionPerformed

    private void chFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFamActionPerformed
        
        if (chFam.isSelected() == true){
            chMan.setEnabled(false);
        }else{
            chMan.setEnabled(true);
        }
    }//GEN-LAST:event_chFamActionPerformed

    private void chSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSiActionPerformed
        
        if (chSi.isSelected() == true){
            chNo.setEnabled(false);
        }else{
            chNo.setEnabled(true);
        }
    }//GEN-LAST:event_chSiActionPerformed

    private void chNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chNoActionPerformed
        if (chNo.isSelected() == true){
            chSi.setEnabled(false);
        }else{
            chSi.setEnabled(true);
        }
    }//GEN-LAST:event_chNoActionPerformed

    private int comprobar(){
        boolean hombre = chMan.isSelected();
        boolean mujer = chFam.isSelected();
        boolean iSi = chSi.isSelected();
        boolean iNo = chNo.isSelected();
        String contra = new String(txtPass.getPassword());
        
        if (chMan.isEnabled() == true && chFam.isEnabled() == true && chSi.isEnabled() == true && chNo.isEnabled() == true){
            if (hombre == true && iSi == true){
                chFam.setEnabled(false);
                chNo.setEnabled(false);
            }else if(hombre == true && iNo == true){
                chFam.setEnabled(false);
                chSi.setEnabled(false);
            }else if (mujer == true && iSi == true){
                chMan.setEnabled(false);
                chNo.setEnabled(false);
            }else if (mujer == true && iNo == true){
                chMan.setEnabled(false);
                chSi.setEnabled(false);
            }
            return 1;
        }else {
            if (txtUser.getText().equals("") || "".equals(contra)){
                return -1;
            }
            return -1;
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JCheckBox chFam;
    private javax.swing.JCheckBox chMan;
    private javax.swing.JCheckBox chNo;
    private javax.swing.JCheckBox chSi;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

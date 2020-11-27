package Frame;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

//        JLBiblia.setVisible(false);
//        JLBibliaName.setVisible(false);
//        JLCadenas.setVisible(false);
//        JLCadenasName.setVisible(false);
//        JLGive.setVisible(false);
//        JLGiveName.setVisible(false);
//        JLPecado.setVisible(false);
//        JLPecadoName.setVisible(false);
//        JLRegeneracion.setVisible(false);
//        JLRegeneracionName.setVisible(false);
//        JLStay.setVisible(false);
//        JLStayName.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
//        visible(-1);

    }

    public void OpenInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("https://cristianismoactivo.org/como-se-que-dios-ama"));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    public void OpenCalculadora() {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("calc");
            pr.waitFor();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    public void OpenMusic() {
//        
//        AudioClip Song;
//        Song = java.applet.Applet.newAudioClip(getClass().getResource("/Canciones/intro.wav"));
//        Song.play();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelIngrese = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JTPassword = new javax.swing.JPasswordField();
        JLItemMenu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTButtonEntrar = new javax.swing.JToggleButton();
        JLMusica = new javax.swing.JLabel();
        JLInternet = new javax.swing.JLabel();
        JLCalculadora = new javax.swing.JLabel();
        JBRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JLBibliaName = new javax.swing.JLabel();
        JLPecadoName = new javax.swing.JLabel();
        JLCadenasName = new javax.swing.JLabel();
        JLStay = new javax.swing.JLabel();
        JLRegeneracionName = new javax.swing.JLabel();
        JLGiveName = new javax.swing.JLabel();
        JLGive = new javax.swing.JLabel();
        JLBiblia = new javax.swing.JLabel();
        JLPecado = new javax.swing.JLabel();
        JLCadenas = new javax.swing.JLabel();
        JLRegeneracion = new javax.swing.JLabel();
        JLStayName = new javax.swing.JLabel();
        JLUsuarioLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLMinimizarLogin = new javax.swing.JLabel();
        JLSalirLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelIngrese.setBackground(new java.awt.Color(255, 255, 255));
        JPanelIngrese.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JPanelIngrese.setForeground(new java.awt.Color(255, 255, 255));
        JPanelIngrese.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Password:");
        JPanelIngrese.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, 30));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("User:");
        JPanelIngrese.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        JPanelIngrese.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, 100));

        JTUsuario.setBackground(new java.awt.Color(255, 255, 255));
        JTUsuario.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JTUsuario.setForeground(new java.awt.Color(153, 153, 153));
        JTUsuario.setText("Usuario");
        JTUsuario.setBorder(null);
        JTUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTUsuarioMouseMoved(evt);
            }
        });
        JTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTUsuarioMouseExited(evt);
            }
        });
        JPanelIngrese.add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        JPanelIngrese.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 220, 20));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        JPanelIngrese.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 20));

        JTPassword.setBackground(new java.awt.Color(255, 255, 255));
        JTPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        JTPassword.setForeground(new java.awt.Color(153, 153, 153));
        JTPassword.setText("contrase");
        JTPassword.setBorder(null);
        JTPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTPasswordMouseMoved(evt);
            }
        });
        JTPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTPasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTPasswordMouseExited(evt);
            }
        });
        JPanelIngrese.add(JTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 170, 30));

        JLItemMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        JLItemMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLItemMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLItemMenuMouseClicked(evt);
            }
        });
        JPanelIngrese.add(JLItemMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        JPanelIngrese.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        JPanelIngrese.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 30, 30));

        JTButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_OFF.png"))); // NOI18N
        JTButtonEntrar.setBorder(null);
        JTButtonEntrar.setBorderPainted(false);
        JTButtonEntrar.setContentAreaFilled(false);
        JTButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTButtonEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        JTButtonEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        JTButtonEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        JTButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTButtonEntrarActionPerformed(evt);
            }
        });
        JPanelIngrese.add(JTButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 110, 40));

        JLMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Musical_Notes_32px.png"))); // NOI18N
        JLMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLMusicaMouseClicked(evt);
            }
        });
        JPanelIngrese.add(JLMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, 40, 40));

        JLInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Globe_32px.png"))); // NOI18N
        JLInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLInternetMouseClicked(evt);
            }
        });
        JPanelIngrese.add(JLInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 40, 40));

        JLCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        JLCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLCalculadoraMouseClicked(evt);
            }
        });
        JPanelIngrese.add(JLCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, 40, 40));

        JBRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        JBRegistrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        JBRegistrar.setForeground(new java.awt.Color(255, 93, 71));
        JBRegistrar.setText("Registrarse");
        JBRegistrar.setBorder(null);
        JBRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegistrarActionPerformed(evt);
            }
        });
        JPanelIngrese.add(JBRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        getContentPane().add(JPanelIngrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLBibliaName.setBackground(new java.awt.Color(255, 99, 71));
        JLBibliaName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLBibliaName.setForeground(new java.awt.Color(255, 99, 71));
        JLBibliaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBibliaName.setText("BIBLIA");
        jPanel1.add(JLBibliaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 20));

        JLPecadoName.setBackground(new java.awt.Color(255, 99, 71));
        JLPecadoName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLPecadoName.setForeground(new java.awt.Color(255, 99, 71));
        JLPecadoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLPecadoName.setText("PECADO");
        jPanel1.add(JLPecadoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 80, 20));

        JLCadenasName.setBackground(new java.awt.Color(255, 99, 71));
        JLCadenasName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLCadenasName.setForeground(new java.awt.Color(255, 99, 71));
        JLCadenasName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCadenasName.setText("ROMPIENDO CADENAS");
        jPanel1.add(JLCadenasName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 200, 20));

        JLStay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLStay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/Heart Cross icon.png"))); // NOI18N
        JLStay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLStayMouseMoved(evt);
            }
        });
        JLStay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLStayMouseExited(evt);
            }
        });
        jPanel1.add(JLStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 160, 130));

        JLRegeneracionName.setBackground(new java.awt.Color(255, 99, 71));
        JLRegeneracionName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLRegeneracionName.setForeground(new java.awt.Color(255, 99, 71));
        JLRegeneracionName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLRegeneracionName.setText("REGENERACION");
        jPanel1.add(JLRegeneracionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 140, 20));

        JLGiveName.setBackground(new java.awt.Color(255, 99, 71));
        JLGiveName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLGiveName.setForeground(new java.awt.Color(255, 99, 71));
        JLGiveName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLGiveName.setText("SERVICIO");
        jPanel1.add(JLGiveName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 100, 20));

        JLGive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLGive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/Giveaway icon 2.png"))); // NOI18N
        JLGive.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLGiveMouseMoved(evt);
            }
        });
        JLGive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLGiveMouseExited(evt);
            }
        });
        jPanel1.add(JLGive, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 160, 130));

        JLBiblia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBiblia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/biblia.png"))); // NOI18N
        JLBiblia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLBibliaMouseMoved(evt);
            }
        });
        JLBiblia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBibliaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLBibliaMouseExited(evt);
            }
        });
        jPanel1.add(JLBiblia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 160, 130));

        JLPecado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLPecado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/pecado.png"))); // NOI18N
        JLPecado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLPecadoMouseMoved(evt);
            }
        });
        JLPecado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLPecadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLPecadoMouseExited(evt);
            }
        });
        jPanel1.add(JLPecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 160, 130));

        JLCadenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCadenas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/break_every_chain_by_paularthur83_d9a6t2a-fullview.png"))); // NOI18N
        JLCadenas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLCadenasMouseMoved(evt);
            }
        });
        JLCadenas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLCadenasMouseExited(evt);
            }
        });
        jPanel1.add(JLCadenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 160, 130));

        JLRegeneracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLRegeneracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/Heart With Pulse icon.png"))); // NOI18N
        JLRegeneracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JLRegeneracionMouseMoved(evt);
            }
        });
        JLRegeneracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLRegeneracionMouseExited(evt);
            }
        });
        jPanel1.add(JLRegeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 160, 130));

        JLStayName.setBackground(new java.awt.Color(255, 99, 71));
        JLStayName.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        JLStayName.setForeground(new java.awt.Color(255, 99, 71));
        JLStayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLStayName.setText("PERMANECER");
        jPanel1.add(JLStayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 120, 20));

        JLUsuarioLogin.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        JLUsuarioLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(JLUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLMinimizarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        JLMinimizarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLMinimizarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLMinimizarLoginMouseClicked(evt);
            }
        });
        jPanel2.add(JLMinimizarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 30, 50));

        JLSalirLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        JLSalirLogin.setToolTipText("");
        JLSalirLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLSalirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLSalirLoginMouseClicked(evt);
            }
        });
        jPanel2.add(JLSalirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLItemMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLItemMenuMouseClicked
        // TODO add your handling code here:

        AnimationClass Internet = new AnimationClass();
        AnimationClass Calculadora = new AnimationClass();
        AnimationClass Musica = new AnimationClass();

        Internet.jLabelXRight(-40, 10, 10, 5, JLInternet);
        Calculadora.jLabelXRight(-40, 10, 10, 5, JLCalculadora);
        Musica.jLabelXRight(-40, 10, 10, 5, JLMusica);

        // <<-- Des Izquierda a Derecha
        AnimationClass internet = new AnimationClass();
        AnimationClass calculadora = new AnimationClass();
        AnimationClass musica = new AnimationClass();

        internet.jLabelXLeft(10, -40, 10, 5, JLInternet);
        calculadora.jLabelXLeft(10, -40, 10, 5, JLCalculadora);
        musica.jLabelXLeft(10, -40, 10, 5, JLMusica);
    }//GEN-LAST:event_JLItemMenuMouseClicked

    private void JLMinimizarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLMinimizarLoginMouseClicked

        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_JLMinimizarLoginMouseClicked

    private void JLSalirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLSalirLoginMouseClicked
        // TODO add your handling code here:
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "Desea Salir del Programa?", "EXIT", Dialog);

        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_JLSalirLoginMouseClicked

    private void JLBibliaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBibliaMouseMoved
        // TODO add your handling code here:
        JLBiblia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLBibliaMouseMoved

    private void JLPecadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPecadoMouseMoved
        // TODO add your handling code here:
        JLPecado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLPecadoMouseMoved

    private void JLCadenasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCadenasMouseMoved
        // TODO add your handling code here:
        JLCadenas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLCadenasMouseMoved

    private void JLRegeneracionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLRegeneracionMouseMoved
        // TODO add your handling code here:
        JLRegeneracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLRegeneracionMouseMoved

    private void JLStayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLStayMouseMoved
        // TODO add your handling code here:
        JLStay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLStayMouseMoved

    private void JLGiveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLGiveMouseMoved
        // TODO add your handling code here:
        JLGive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_JLGiveMouseMoved

    private void JLBibliaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBibliaMouseExited
        // TODO add your handling code here:
        JLBiblia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_JLBibliaMouseExited

    private void JLPecadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPecadoMouseExited
        // TODO add your handling code here:
        JLPecado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JLPecadoMouseExited

    private void JLCadenasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCadenasMouseExited
        // TODO add your handling code here:
        JLCadenas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JLCadenasMouseExited

    private void JLRegeneracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLRegeneracionMouseExited
        // TODO add your handling code here:
        JLRegeneracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JLRegeneracionMouseExited

    private void JLStayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLStayMouseExited
        // TODO add your handling code here:
        JLStay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JLStayMouseExited

    private void JLGiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLGiveMouseExited
        // TODO add your handling code here:
        JLGive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JLGiveMouseExited

    private void JLInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLInternetMouseClicked
        // TODO add your handling code here:
        OpenInternet();
    }//GEN-LAST:event_JLInternetMouseClicked

    private void JLCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCalculadoraMouseClicked
        // TODO add your handling code here:
        OpenCalculadora();
    }//GEN-LAST:event_JLCalculadoraMouseClicked

    private void JLMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLMusicaMouseClicked
        // TODO add your handling code here:
        OpenMusic();
    }//GEN-LAST:event_JLMusicaMouseClicked

    private void JTUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMouseMoved
        // TODO add your handling code here:
        JTUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

    }//GEN-LAST:event_JTUsuarioMouseMoved

    private void JTUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMouseExited
        // TODO add your handling code here:
        JTUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JTUsuarioMouseExited

    private void JTPasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTPasswordMouseMoved
        // TODO add your handling code here:
        JTPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

    }//GEN-LAST:event_JTPasswordMouseMoved

    private void JTPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTPasswordMouseExited
        // TODO add your handling code here:
        JTPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_JTPasswordMouseExited

    private void JBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegistrarActionPerformed
//        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(false);
        Registro rg = new Registro();
        rg.setVisible(true);
    }//GEN-LAST:event_JBRegistrarActionPerformed

    private void JTButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTButtonEntrarActionPerformed

        String usuario = JTUsuario.getText();
        String password = new String(JTPassword.getPassword());
        int index = Usuario.verificarLogin(usuario, password);

        if (index == -1) {

            JOptionPane.showMessageDialog(this, "USER OR PASSWORD ARE INCORRECT!");

            visible(index);

        } else {

            JOptionPane.showMessageDialog(this, "HA SIDO LOGIADO!");

            String Usuario = usuario.toUpperCase();
            JLUsuarioLogin.setText(Usuario);
            visible(index);

        }
    }//GEN-LAST:event_JTButtonEntrarActionPerformed

    public void visible(int index) {
        int in = index;

        if (in == -1) {
            JLBiblia.setVisible(false);
            JLBibliaName.setVisible(false);
            JLCadenas.setVisible(false);
            JLCadenasName.setVisible(false);
            JLGive.setVisible(false);
            JLGiveName.setVisible(false);
            JLPecado.setVisible(false);
            JLPecadoName.setVisible(false);
            JLRegeneracion.setVisible(false);
            JLRegeneracionName.setVisible(false);
            JLStay.setVisible(false);
            JLStayName.setVisible(false);
        } else {
            JLBiblia.setVisible(true);
            JLBibliaName.setVisible(true);
            JLCadenas.setVisible(true);
            JLCadenasName.setVisible(true);
            JLGive.setVisible(true);
            JLGiveName.setVisible(true);
            JLPecado.setVisible(true);
            JLPecadoName.setVisible(true);
            JLRegeneracion.setVisible(true);
            JLRegeneracionName.setVisible(true);
            JLStay.setVisible(true);
            JLStayName.setVisible(true);

        }
    }

    private void JTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMouseClicked
        JTUsuario.setText("");
    }//GEN-LAST:event_JTUsuarioMouseClicked

    private void JTPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTPasswordMouseClicked
        JTPassword.setText("");
    }//GEN-LAST:event_JTPasswordMouseClicked

    private void JLBibliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBibliaMouseClicked
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        BibliaC biblia = new BibliaC();
        biblia.setVisible(true);
    }//GEN-LAST:event_JLBibliaMouseClicked

    private void JLPecadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPecadoMouseClicked
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        Pecado pecado = new Pecado();
        pecado.setVisible(true);
    }//GEN-LAST:event_JLPecadoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRegistrar;
    private javax.swing.JLabel JLBiblia;
    private javax.swing.JLabel JLBibliaName;
    private javax.swing.JLabel JLCadenas;
    private javax.swing.JLabel JLCadenasName;
    private javax.swing.JLabel JLCalculadora;
    private javax.swing.JLabel JLGive;
    private javax.swing.JLabel JLGiveName;
    private javax.swing.JLabel JLInternet;
    private javax.swing.JLabel JLItemMenu;
    private javax.swing.JLabel JLMinimizarLogin;
    private javax.swing.JLabel JLMusica;
    private javax.swing.JLabel JLPecado;
    private javax.swing.JLabel JLPecadoName;
    private javax.swing.JLabel JLRegeneracion;
    private javax.swing.JLabel JLRegeneracionName;
    private javax.swing.JLabel JLSalirLogin;
    private javax.swing.JLabel JLStay;
    private javax.swing.JLabel JLStayName;
    private javax.swing.JLabel JLUsuarioLogin;
    private javax.swing.JPanel JPanelIngrese;
    private javax.swing.JToggleButton JTButtonEntrar;
    private javax.swing.JPasswordField JTPassword;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

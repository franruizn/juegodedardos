
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author MEDAC
 */
public class Play extends javax.swing.JFrame {

    /**
     * Creates new form Play
     */
    JuegoDeDamrDosCricket inicio;
    Resultado ventanaResultado;
    HashMap<String, Integer> jugador1 = new HashMap<>();
    HashMap<String, Integer> jugador2 = new HashMap<>();

    public Play() {
        initComponents();
    }

    Play(JuegoDeDamrDosCricket inicio) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.inicio = inicio;
        for (int i = 20; i > 13; i--) {
            if (i == 14) {
                jugador1.put("Centro", 0);
                jugador2.put("Centro", 0);
            } else {
                jugador1.put(Integer.toString(i), 0);
                jugador2.put(Integer.toString(i), 0);
            }
        }
        System.out.println(jugador1);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nombre1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nombre2");

        jLabel3.setText("D1");

        jLabel4.setText("D2");

        jLabel5.setText("D3");

        jLabel6.setText("D1");

        jLabel7.setText("D2");

        jLabel8.setText("D3");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dardo.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("TURNOS");

        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reiniciar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Resultados");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jButton4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel8)
                            .addComponent(jButton6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int turnos = 1, tiros1 = 0, tiros2 = 0, puntuacion1 = 0, puntuacion2 = 0;


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tiros2 < 3) {
            jButton2.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints1(valor, respuesta);
            tiros1++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 2 aún le quedan tiros", "No es tu turno", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tiros2 == 3 || tiros2 == 0) {
            jButton1.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints1(valor, respuesta);
            tiros1++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 2 aún le quedan tiros", "No es tu turno", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (tiros2 == 3 || tiros2 == 0) {
            jButton3.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints1(valor, respuesta);
            comprobarTurno();
            tiros1++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 2 aún le quedan tiros", "JuegoDeDamrDosCricket", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

        ventanaResultado = new Resultado(this, jugador1, jugador2, puntuacion1, puntuacion2);
        ventanaResultado.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (tiros1 == 3 || tiros1 == 0) {
            jButton4.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints2(valor, respuesta);
            comprobarTurno();
            tiros2++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 1 aún le quedan tiros", "JuegoDeDamrDosCricket", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (tiros1 == 3 || tiros1 == 0) {
            jButton5.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints2(valor, respuesta);
            comprobarTurno();
            tiros2++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 1 aún le quedan tiros", "JuegoDeDamrDosCricket", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (tiros1 == 3 || tiros1 == 0) {
            jButton6.setEnabled(false);
            String valor = JOptionPane.showInputDialog("Introduce el valor");
            Object[] opciones = {"Simple", "Doble", "Triple"};
            int respuesta = JOptionPane.showOptionDialog(null, "Simple, Doble o Triple",
                    "Pregunta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]) + 1;

            addPoints2(valor, respuesta);
            comprobarTurno();
            tiros2++;
        } else {
            JOptionPane.showMessageDialog(null, "Al jugador 1 aún le quedan tiros", "JuegoDeDamrDosCricket", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void comprobarTurno() {
        if (tiros1 == 3 && tiros2 == 3) {
            turnos++;
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jTextArea1.setText(Integer.toString(turnos));
            tiros1 = 0;
            tiros2 = 0;
        }

        if (turnos == 20 || comprobarCerrados()) {
            this.setVisible(false);
            ventanaResultado = new Resultado(this, jugador1, jugador2, puntuacion1, puntuacion2);
            ventanaResultado.setVisible(true);
            if (puntuacion1 > puntuacion2) {
                JOptionPane.showMessageDialog(this, "Gana el jugador: " + jLabel1.getText(), "JuegoDeDamrDosCricket", JOptionPane.INFORMATION_MESSAGE);
            } else if (puntuacion2 > puntuacion1) {
                JOptionPane.showMessageDialog(this, "Gana el jugador: " + jLabel1.getText(), "JuegoDeDamrDosCricket", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "¡Ha habido un empate!", "JuegoDeDamrDosCricket", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private Boolean comprobarCerrados() {
        Boolean cerrado = false;
        Iterator it = jugador1.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (jugador1.get(key) == 3) {
                cerrado = true;
            } else {
                cerrado = false;
                break;
            }
        }

        Iterator it2 = jugador2.keySet().iterator();
        while (it2.hasNext()) {
            String key = (String) it2.next();
            if (jugador2.get(key) == 3) {
                cerrado = true;
            } else {
                cerrado = false;
                break;
            }
        }

        return cerrado;

    }

    private void addPoints1(String valor, int respuesta) throws NumberFormatException {
        if (jugador1.get(valor) < 3) {
            jugador1.replace(valor, jugador1.get(valor) + 1 * respuesta);
            if (jugador1.get(valor) > 3) {
                jugador1.replace(valor, 3);
            }
        } else if (jugador2.get(valor) < 3) {
            puntuacion1 += Integer.parseInt(valor) * respuesta;
        } else {

        }
    }
    
    private void addPoints2(String valor, int respuesta) throws NumberFormatException {
        if (jugador2.get(valor) < 3) {
            jugador2.replace(valor, jugador2.get(valor) + 1 * respuesta);
            if (jugador2.get(valor) > 3) {
                jugador2.replace(valor, 3);
            }
        } else if (jugador1.get(valor) < 3) {
            puntuacion2 += Integer.parseInt(valor) * respuesta;
        } else {

        }
    }

    public void cambiarNombre1(String nombre) {
        jLabel1.setText(nombre);
    }

    public void cambiarNombre2(String nombre) {
        jLabel2.setText(nombre);
    }

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
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

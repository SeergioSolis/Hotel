/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author xjlop
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    
    public UI() {
        initComponents();
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultas = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Bajas = new javax.swing.JLabel();
        ModUsrs = new javax.swing.JLabel();
        Galeria = new javax.swing.JLabel();
        Distribuciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Consultas.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        Consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultasMouseClicked(evt);
            }
        });
        getContentPane().add(Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 190));

        Salir.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        Salir.setBorder(new javax.swing.border.MatteBorder(null));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SalirMouseReleased(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 50, 20));

        Bajas.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        Bajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BajasMouseReleased(evt);
            }
        });
        getContentPane().add(Bajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 160, 180));

        ModUsrs.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        ModUsrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ModUsrsMouseReleased(evt);
            }
        });
        getContentPane().add(ModUsrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 150, 180));

        Galeria.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        Galeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GaleriaMouseReleased(evt);
            }
        });
        getContentPane().add(Galeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 160, 180));

        Distribuciones.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        Distribuciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DistribucionesMouseReleased(evt);
            }
        });
        getContentPane().add(Distribuciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 190));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 150, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta y check in (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BajasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajasMouseReleased
        Bajas bajas = new Bajas();
        bajas.setLocationRelativeTo(null);
        bajas.setSize(700, 500);
        bajas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BajasMouseReleased

    private void SalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_SalirMouseReleased

    private void ConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultasMouseClicked
        Consultas consultas = new Consultas();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,560);
        consultas.setResizable(false);
    }//GEN-LAST:event_ConsultasMouseClicked

    private void ModUsrsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModUsrsMouseReleased
        ModificarUsuarios consultas = new ModificarUsuarios();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setResizable(false);
    }//GEN-LAST:event_ModUsrsMouseReleased

    private void GaleriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GaleriaMouseReleased
        try {
            Galeria consultas = new Galeria();
            this.setVisible(false);
            consultas.setVisible(true);
            consultas.setResizable(false);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GaleriaMouseReleased

    private void DistribucionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DistribucionesMouseReleased
        Piso1 ui = new Piso1();
        this.setVisible(false);
        ui.setVisible(true);
        
        
    }//GEN-LAST:event_DistribucionesMouseReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ConsultasAp consultas = new ConsultasAp();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setResizable(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bajas;
    private javax.swing.JLabel Consultas;
    private javax.swing.JLabel Distribuciones;
    private javax.swing.JLabel Galeria;
    private javax.swing.JLabel ModUsrs;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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
        MenuBarra = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        MenuArquivoSair = new javax.swing.JMenuItem();
        MenuEletronica = new javax.swing.JMenu();
        MenuEletronicaIndutor1 = new javax.swing.JMenuItem();
        MenuEletrica = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaHora = new javax.swing.JMenuItem();
        MenuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AFeletriC - Cálculos elétricos e eletrônicos");
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("AFeletriC - Cálculos elétricos e eletrônicos");

        MenuArquivo.setText("Arquivo");

        MenuArquivoSair.setText("Sair");
        MenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuArquivoSair);

        MenuBarra.add(MenuArquivo);

        MenuEletronica.setText("Eletrônica");

        MenuEletronicaIndutor1.setText("Indutor com núcleo de ar");
        MenuEletronicaIndutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEletronicaIndutor1ActionPerformed(evt);
            }
        });
        MenuEletronica.add(MenuEletronicaIndutor1);

        MenuBarra.add(MenuEletronica);

        MenuEletrica.setText("Elétrica");
        MenuBarra.add(MenuEletrica);

        MenuAjuda.setText("Ajuda");

        MenuAjudaHora.setText("Hora");
        MenuAjudaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaHoraActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaHora);

        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        MenuBarra.add(MenuAjuda);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed

        JOptionPane.showMessageDialog(null, "AFeletriC - versão 1.0\n"
                + "Cálculos elétricos e eletrônicos\n"
                + "Autor: Fabrício de lima Ribeiro\n"
                + "Data: 26/03/2020");

    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuAjudaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaHoraActionPerformed

        FormAjudaHora form = new FormAjudaHora();
        form.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        //form.setTitle("Hora e data atuais");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);

    }//GEN-LAST:event_MenuAjudaHoraActionPerformed

    private void MenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoSairActionPerformed
        
        //Sai do programa
        //dispose();
        System.exit(0);
        
    }//GEN-LAST:event_MenuArquivoSairActionPerformed

    private void MenuEletronicaIndutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEletronicaIndutor1ActionPerformed

        FormIndutor1 form = new FormIndutor1();
        form.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);        
        
    }//GEN-LAST:event_MenuEletronicaIndutor1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormPrincipal().setVisible(true);
                FormPrincipal form = new FormPrincipal();
                //inicializa o formulario no meio da tela
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaHora;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenuItem MenuArquivoSair;
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JMenu MenuEletrica;
    private javax.swing.JMenu MenuEletronica;
    private javax.swing.JMenuItem MenuEletronicaIndutor1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

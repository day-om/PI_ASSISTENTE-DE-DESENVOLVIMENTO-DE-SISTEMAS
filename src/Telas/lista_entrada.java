
package Telas;

import Classes.Lista_entrada;
import Classes.Lista_prof;
import Classes.Lista_saida;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dayan
 */
public class lista_entrada extends javax.swing.JFrame {

    public DefaultTableModel tabela;
    public Lista_entrada listaEntrada;
  
    
    public lista_entrada() {
        initComponents();
        tabelaEntrada();
        listaEntrada = new Lista_entrada(tabela);
    }
    
     private void tabelaEntrada(){
        tabela = new DefaultTableModel(new Object[]{"Aluno", "Data", "Valor", "Forma de pagamento"},0);
        mostra_entradas.setModel(tabela);
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bt_menu = new javax.swing.JButton();
        bt_perfil = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostra_entradas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, 30));

        bt_perfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_perfil.setForeground(new java.awt.Color(255, 255, 255));
        bt_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/do-utilizador.png"))); // NOI18N
        bt_perfil.setToolTipText("Perfil");
        jPanel1.add(bt_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ENTRADAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostra_entradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mostra_entradas.setToolTipText("Consultas");
        jScrollPane1.setViewportView(mostra_entradas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 330));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 570, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        nova_entrada menu = new nova_entrada(listaEntrada);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

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
            java.util.logging.Logger.getLogger(lista_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_perfil;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mostra_entradas;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}

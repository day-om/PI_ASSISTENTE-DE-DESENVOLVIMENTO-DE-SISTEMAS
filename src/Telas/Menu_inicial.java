
package Telas;

import Classes.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Menu_inicial extends javax.swing.JFrame {
    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public Menu_inicial(Usuario usuarioLogado){
        initComponents();
        AtalhoAcessibilidade();
        
        int tipo;
        tipo = usuarioLogado.getTipoUsuario();
        switch(tipo){
            case 1:
            bt_cadastro.setEnabled(true);
            bt_aulas.setEnabled(true);
            bt_financeiro.setEnabled(true); 
            break;
            case 2:
            bt_cadastro.setEnabled(true);
            bt_aulas.setEnabled(true);
            bt_financeiro.setEnabled(false); 
            break;
            case 3:
            bt_cadastro.setEnabled(false);
            bt_aulas.setEnabled(true);
            bt_financeiro.setEnabled(false);
            break;
            default:
            JOptionPane.showMessageDialog(null,"Tipo de usuário não encontrado!");
            break;
        }
        
        
        
    }
    public Menu_inicial() {
        initComponents();
        AtalhoAcessibilidade();
        
    }
    public void AtalhoAcessibilidade(){
        bt_menu.setMnemonic(KeyEvent.VK_M);
        bt_sair.setMnemonic(KeyEvent.VK_S);
        bt_cadastro.setMnemonic(KeyEvent.VK_D);
        bt_aulas.setMnemonic(KeyEvent.VK_A);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_cadastro = new javax.swing.JButton();
        bt_aulas = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_financeiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Escolha a opção que deseja acessar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_cadastro.setBackground(new java.awt.Color(51, 81, 177));
        bt_cadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        bt_cadastro.setText("CADASTRO");
        bt_cadastro.setToolTipText("Clique para cadastrar");
        bt_cadastro.setNextFocusableComponent(bt_aulas);
        bt_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 40));

        bt_aulas.setBackground(new java.awt.Color(51, 81, 177));
        bt_aulas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_aulas.setForeground(new java.awt.Color(255, 255, 255));
        bt_aulas.setText("AULAS");
        bt_aulas.setToolTipText("Clique para acessar opções sobre as aulas");
        bt_aulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aulasActionPerformed(evt);
            }
        });
        jPanel1.add(bt_aulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, 40));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jPanel2.setBackground(new java.awt.Color(51, 81, 177));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.250x250.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -30, -1, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aulas.80x57.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeiro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        bt_financeiro.setBackground(new java.awt.Color(51, 81, 177));
        bt_financeiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_financeiro.setForeground(new java.awt.Color(255, 255, 255));
        bt_financeiro.setText("FINANCEIRO");
        bt_financeiro.setToolTipText("Clique para acessar opções sobre o financeiro");
        bt_financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_financeiroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_financeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroActionPerformed
        menu_cadastrar menu = new menu_cadastrar(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_cadastroActionPerformed

    private void bt_aulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aulasActionPerformed
        menu_aula menu = new menu_aula(usuarioLogado);
        menu.setVisible(true);
         dispose();
    }//GEN-LAST:event_bt_aulasActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_financeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_financeiroActionPerformed
        menu_financeiro menu=new menu_financeiro();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_financeiroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_aulas;
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_financeiro;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

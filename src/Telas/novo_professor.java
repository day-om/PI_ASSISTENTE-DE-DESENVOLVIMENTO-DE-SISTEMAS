

package Telas;

import Classes.Lista_prof;
import Classes.Professor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class novo_professor extends javax.swing.JFrame {

    public Lista_prof listaProf;
    
    public novo_professor(Lista_prof listaProf) {
        initComponents();
        this.listaProf = listaProf;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        recebe_instrumento = new javax.swing.JComboBox<>();
        horario_manha = new javax.swing.JTextField();
        horario_tarde = new javax.swing.JTextField();
        bt_enviar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        bt_perfil = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Preencha as informações abaixo  para cadastrar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("NOVO PROFESSOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Escolha o(s) horário(s)");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(recebe_nome);
        jLabel2.setText("NOME:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        recebe_nome.setToolTipText("Digite o nome do professor(a)");
        jPanel3.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 450, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(recebe_instrumento);
        jLabel3.setText("INSTRUMENTO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HORÁRIOS:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarde");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manhã");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        recebe_instrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teclado", "Violão", "Flauta" }));
        recebe_instrumento.setToolTipText("Escolha o instrumento");
        jPanel3.add(recebe_instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));
        jPanel3.add(horario_manha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 320, -1));
        jPanel3.add(horario_tarde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 320, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 510, 280));

        bt_enviar.setBackground(new java.awt.Color(51, 81, 177));
        bt_enviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_enviar.setForeground(new java.awt.Color(255, 255, 255));
        bt_enviar.setText("Enviar");
        bt_enviar.setToolTipText("Cique para enviar as informações");
        bt_enviar.setNextFocusableComponent(bt_limpar);
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 390, 110, 30));

        bt_limpar.setBackground(new java.awt.Color(51, 140, 233));
        bt_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar.setText("Limpar");
        bt_limpar.setToolTipText("Cique para limpar as informações");
        bt_limpar.setNextFocusableComponent(recebe_nome);
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 100, 30));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 30, 30));

        bt_perfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_perfil.setForeground(new java.awt.Color(255, 255, 255));
        bt_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/do-utilizador.png"))); // NOI18N
        bt_perfil.setToolTipText("Perfil");
        jPanel1.add(bt_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

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

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Cadastro_professores novo = new Cadastro_professores();
        novo.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        String nome = recebe_nome.getText();
        String instrumento = (String) recebe_instrumento.getSelectedItem();
        String manha = horario_manha.getText();
        String tarde = horario_tarde.getText();
      
        if (nome.isEmpty() || instrumento.isEmpty() || manha.isEmpty() || tarde.isEmpty()){
        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos."
                + "Caso não tenha possibiliadade de horário em um dos turnos, digite 0.");
        return;
        }   
        if(!nome.matches("[a-zA-Z]+")){
        JOptionPane.showMessageDialog(null, "No campo (NOME) insira apenas letras!"); 
        return; 
        }
        if(!manha.matches("[0-9]+")){
        JOptionPane.showMessageDialog(null, "No campo (MANHÃ) insira apenas números!"); 
        return;   
        }
        if(!tarde.matches("[0-9]+")){
        JOptionPane.showMessageDialog(null, "No campo (TARDE) insira apenas números!"); 
        return;   
        }
        
        Professor professor = new Professor(nome,instrumento,manha,tarde);
        listaProf.Adicionar(professor);
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            
        recebe_nome.setText("");
        horario_manha.setText("");
        horario_tarde.setText("");
        
           
        
    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        recebe_nome.setText("");
        horario_manha.setText("");
        horario_tarde.setText("");
    }//GEN-LAST:event_bt_limparActionPerformed

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
            java.util.logging.Logger.getLogger(novo_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novo_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novo_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novo_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                DefaultTableModel tabela_prof = new DefaultTableModel(
                        new Object[]{"Professor","Instrumento","Horário(manhã)","Horário(tarde)"},
                        0
                );
                Lista_prof listaProf = new Lista_prof(tabela_prof);
                
                new novo_professor(listaProf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_perfil;
    private javax.swing.JButton bt_sair;
    private javax.swing.JTextField horario_manha;
    private javax.swing.JTextField horario_tarde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> recebe_instrumento;
    private javax.swing.JTextField recebe_nome;
    // End of variables declaration//GEN-END:variables
}


package Telas;

import Classes.Aluno;
import Classes.Aula;
import Classes.Conexao_bd;
import Classes.Diario;
import Classes.Usuario;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class registros_atualizar extends javax.swing.JFrame {

    
     Usuario usuarioLogado = Usuario.getUsuarioLogado();
     
    public registros_atualizar() {
        initComponents();
    }
    
    public registros_atualizar(Usuario usuarioLogado){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        recebe_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        recebe_data = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recebe_presenca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        recebe_descricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        recebe_desempenho = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id_registros = new javax.swing.JTextField();
        pesquisar_id = new javax.swing.JButton();
        id_aluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_atualizar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Escolha um dos botões abaixo para continuar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ATUALIZAR REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Escolha o(s) horário(s)");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recebe_nome.setToolTipText("Digite o nome do aluno(a)");
        jPanel3.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 410, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(recebe_presenca);
        jLabel4.setText("PRESENÇA:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setToolTipText("Clique para pesquisar aluno");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(bt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALUNO(A):");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        recebe_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_dataActionPerformed(evt);
            }
        });
        jPanel3.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setLabelFor(recebe_desempenho);
        jLabel6.setText("DESEMPENHO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        recebe_presenca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presença", "Falta", " " }));
        jPanel3.add(recebe_presenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setLabelFor(id_registros);
        jLabel7.setText("ID - REGISTRO");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel3.add(recebe_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 480, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setLabelFor(recebe_descricao);
        jLabel8.setText("DESCRIÇÃO DA AULA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        recebe_desempenho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Com dificuldade.", "Regular", "Foi muito bem!" }));
        jPanel3.add(recebe_desempenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setLabelFor(recebe_data);
        jLabel9.setText("NOVA DATA:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        id_registros.setToolTipText("");
        jPanel3.add(id_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, -1));

        pesquisar_id.setText("Pesquisar");
        pesquisar_id.setToolTipText("Clique para pesquisar ID do registro");
        pesquisar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_idActionPerformed(evt);
            }
        });
        jPanel3.add(pesquisar_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        id_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_alunoActionPerformed(evt);
            }
        });
        jPanel3.add(id_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(id_aluno);
        jLabel3.setText("ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 20, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 540, 330));

        bt_atualizar.setBackground(new java.awt.Color(51, 81, 177));
        bt_atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_atualizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_atualizar.setText("Atualizar");
        bt_atualizar.setToolTipText("Cique para enviar as informações");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 100, 30));

        bt_limpar.setBackground(new java.awt.Color(51, 140, 233));
        bt_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar.setText("Limpar");
        bt_limpar.setToolTipText("Cique para limpar as informações");
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 100, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recebe_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebe_dataActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        int aluno = Integer.parseInt(id_aluno.getText());;
        String data = recebe_data.getText();
        String presenca = (String) recebe_presenca.getSelectedItem();
        String descricao = recebe_descricao.getText();
        String desempenho = (String) recebe_desempenho.getSelectedItem();
        int diario = Integer.parseInt(id_registros.getText());

        Conexao_bd dao;
        boolean status;
        int resposta;

        dao = new Conexao_bd();
        status = dao.conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null,"Erro de conexão");
        }else{
            resposta = dao.atualizarDiario(data,presenca,descricao,desempenho,aluno,diario);

            if(resposta == 1){
                JOptionPane.showMessageDialog(null,"Dados cadastrados com sucesso");
                id_aluno.setText("");
                recebe_nome.setText("");
                id_registros.setText("");
                recebe_data.setText("");
                recebe_descricao.setText("");
                recebe_nome.requestFocus();

            }else if (resposta ==1062){
                JOptionPane.showMessageDialog(null,"Erro no cadastrado");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao tentar inserir dados");
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        lista_registros registro = new lista_registros();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String nome;
        nome = recebe_nome.getText();

        Conexao_bd dao = new Conexao_bd();
        boolean status = dao.conectar();

        if(status == true){
            Aluno aluno = dao.consultarAluno(nome);
            System.out.println(dao.consultarAluno(nome));
            if(aluno == null){
                JOptionPane.showMessageDialog(null,"Aluno não localizado!");
            }else{
                recebe_nome.setText(aluno.getNome());
                id_aluno.setText(Integer.toString(aluno.getId()));
                JOptionPane.showMessageDialog(null, "Aluno encontrado com sucesso! Digite os novos dados!");
            }
            dao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null,"Erro de conexão");
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void pesquisar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_idActionPerformed
        int id;
        id = parseInt(id_registros.getText());

        Conexao_bd dao = new Conexao_bd();
        boolean status = dao.conectar();

        if(status == true){
            Diario diario = dao.consultarRegistro(id);
            System.out.println(dao.consultarRegistro(id));
            if(diario == null){
                JOptionPane.showMessageDialog(null,"Registro não localizado!");
            }else{
                JOptionPane.showMessageDialog(null, "Registro encontrado com sucesso! Pesquise o aluno!");
            }
            dao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null,"Erro de conexão");
        }
    }//GEN-LAST:event_pesquisar_idActionPerformed

    private void id_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_alunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_alunoActionPerformed

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
            java.util.logging.Logger.getLogger(registros_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registros_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registros_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registros_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registros_atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JTextField id_aluno;
    private javax.swing.JTextField id_registros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton pesquisar_id;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JTextField recebe_descricao;
    private javax.swing.JComboBox<String> recebe_desempenho;
    private javax.swing.JTextField recebe_nome;
    private javax.swing.JComboBox<String> recebe_presenca;
    // End of variables declaration//GEN-END:variables
}

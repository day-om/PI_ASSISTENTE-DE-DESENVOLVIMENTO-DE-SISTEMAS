
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Conexao_bd {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    
    //Métodos de conexão
     public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola_de_musica","root","12345");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }
    
    // Métodos de atualização
    public void atualizarAdm(int id, String novoNome, int novaFuncao) {
    String sql = "UPDATE administradores SET nome = ?, funcao_adm = ? WHERE idAdministradores = ?";
    
    try{
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);
       
        stmt.setString(1, novoNome);
        stmt.setInt(2, novaFuncao);
        stmt.setInt(3, id);

        int linhasAfetadas = stmt.executeUpdate();
        
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o usuário.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados.");
    }
}
 
    public int atualizarAluno(int id,String nome, String idade, String cpf, int pacote, int nivel, int instrumento) {
    String sql = "UPDATE alunos SET nome = ?, idade = ?, cpf = ?, pacote_aluno = ?,nivel_aluno = ?, instrumento_aluno = ? WHERE idAlunos = ?";
    int status;
    try{
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1,nome);
        stmt.setString(2, idade);
        stmt.setString(3, cpf);
        stmt.setInt(4, pacote);
        stmt.setInt(5, nivel);
        stmt.setInt(6, instrumento);
        stmt.setInt(7, id);
        
        status = stmt.executeUpdate();
        return status; 
        
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
        
}
    public int atualizarAula(String data,int horario,int idAula) {
    String sql = "UPDATE aulas SET data = ?, horario = ? WHERE idAulas = ?";
    int status;
    try{
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1,data);
        stmt.setInt(2, horario);        
        stmt.setInt(3, idAula);
        
        status = stmt.executeUpdate();
        return status; 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
        
}
    public int atualizarProf(String nome,int instrumento,int idProf) {
    String sql = "UPDATE professores SET nome = ?, instrumento_professor = ? WHERE idProfessores = ?";
    int status;
    try{
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1,nome);
        stmt.setInt(2, instrumento);        
        stmt.setInt(3, idProf);
        
        status = stmt.executeUpdate();
        return status; 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
        
}
    public int atualizarDiario(String data,String presenca, String descricao, String desempenho,int aluno,int idDiario) {
    String sql = "UPDATE diario SET data = ?, presenca = ?, descricao = ?,desempenho = ?, aluno = ? WHERE idDiario = ?";
    int status;
    try{
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        
        stmt.setString(1,data);
        stmt.setString(2,presenca);
        stmt.setString(3,descricao);
        stmt.setString(4,desempenho);
        stmt.setInt(5, aluno); 
        stmt.setInt(6, idDiario);        
        
        
        status = stmt.executeUpdate();
        return status; 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
        
}
    
    // Métodos e exclusão
   public boolean excluirAdm(int id) {
    
    String sql = "DELETE FROM administradores WHERE idAdministradores = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   public boolean excluirAluno(int id) {
    
    String sql = "DELETE FROM alunos WHERE idAlunos = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
        
    }
}
   public boolean excluirAula(int id) {
    
    String sql = "DELETE FROM aulas WHERE idAulas = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   public boolean excluirEntrada(int id) {
    
    String sql = "DELETE FROM financeiro_entrada WHERE idFinanceiro_entrada = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   public boolean excluirProf(int id) {
    
    String sql = "DELETE FROM professores WHERE idProfessores = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   public boolean excluirRegistros(int id) {
    
    String sql = "DELETE FROM diario WHERE idDiario = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
   public boolean excluirSaida(int id) {
    
    String sql = "DELETE FROM financeiro_saida WHERE idFinanceiro_saida = ?"; 
    
    try{        
        conectar();
        PreparedStatement stmt = this.conn.prepareStatement(sql);

        stmt.setInt(1, id);  
        int linhasAfetadas = stmt.executeUpdate();

        return linhasAfetadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
 

    //Métodos para salvar cadastros   
   public int salvarUsuario(Usuario usuario){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuarios (login,senha,tipo_usuario) VALUES(?,?,?)");
            st.setString(1,usuario.getLogin());
            st.setString(2,usuario.getSenha());
            st.setInt(3,usuario.getTipoUsuario());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
     public int salvarProf(Professor professor){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO professores (Nome,instrumento_professor) VALUES(?,?)");
            st.setString(1,professor.getNome());
            st.setInt(2,professor.instrumento);
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
      public int salvarAluno(Aluno aluno){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO alunos (Nome,idade,CPF,pacote_aluno,nivel_aluno,instrumento_aluno) VALUES(?,?,?,?,?,?)");
            st.setString(1,aluno.getNome());
            st.setString(2,aluno.getIdade());
            st.setString(3,aluno.getCpf());
            st.setInt(4,aluno.getPacote());
            st.setInt(5,aluno.getNivel());
            st.setInt(6,aluno.getInstrumento());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
       public int salvarAdm(Adm adm){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO administradores (Nome,funcao_adm) VALUES(?,?)");
            st.setString(1,adm.getNome());
            st.setInt(2,adm.getFuncao());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
        public int salvarAula(Aula aula){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO aulas (aluno,horario,data) VALUES(?,?,?)");
            st.setInt(1,aula.getAluno());
            st.setInt(2,aula.getHorario());
            st.setString(3,aula.getData());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
        public int salvarRegistro(Diario aula){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO diario (aluno,data,presenca,descricao,desempenho) VALUES(?,?,?,?,?)");
            st.setInt(1,aula.getAluno());
            st.setString(2,aula.getData());
            st.setString(3,aula.getPresenca());
            st.setString(4,aula.getDescricao_aula());
            st.setString(5,aula.getDesempenho());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
        public int salvarEntrada(Entrada entrada){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Financeiro_entrada (data,valor,aluno,Forma_pagamento,usuario) VALUES(?,?,?,?,?)");
            st.setString(1,entrada.getData());
            st.setDouble(2,entrada.getValor());
            st.setInt(3,entrada.getAluno());
            st.setInt(4,entrada.getFormaPagamento());
            st.setInt(5,entrada.getUsuario());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
         public int salvarSaida(Saida saida){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Financeiro_saida (descricao,data,valor,usuario) VALUES(?,?,?,?)");
            st.setString(1,saida.getDescricao());
            st.setString(2,saida.getData());
            st.setDouble(3,saida.getValor());
            st.setInt(4,saida.getUsuario());
            status = st.executeUpdate();
            return status; 
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
         
         //Métodos para buscar registros
        public Aluno consultarAluno (String nome){
         
        try {
            Aluno aluno = new Aluno();
            st = conn.prepareStatement("SELECT * from alunos WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                aluno.setId(rs.getInt("idAlunos"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getString("idade"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setPacote(rs.getInt("pacote_aluno"));
                aluno.setNivel(rs.getInt("nivel_aluno"));
                aluno.setInstrumento(rs.getInt("instrumento_aluno"));
                return aluno;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
        public Aula consultarAula(int id){
         
        try {
            Aula aula = new Aula();
            st = conn.prepareStatement("SELECT * from aulas WHERE idAulas = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                aula.setId(rs.getInt("idAulas"));
                aula.setAluno(rs.getInt("aluno"));
                aula.setData(rs.getString("data"));
                aula.setHorario(rs.getInt("horario"));
                
                return aula;
                
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
       public Usuario consultarUsuario (String nome){
         
        try {
            Usuario usuario = new Usuario();
            st = conn.prepareStatement("SELECT * from Usuarios WHERE login = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                usuario.setIdUsuario(rs.getInt("idUsuarios"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipoUsuario(rs.getInt("tipo_usuario"));
                
                return usuario;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
        public Adm consultarAdm (String nome){
         
        try {
            Adm adm = new Adm();
            st = conn.prepareStatement("SELECT * from Administradores WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                adm.setId(rs.getInt("idAdministradores"));
                adm.setNome(rs.getString("nome"));
                adm.setFuncao(rs.getInt("funcao_adm"));               
                
                return adm;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
        public Professor consultarProf (String nome){
         
        try {
            Professor prof = new Professor();
            st = conn.prepareStatement("SELECT * from Professores WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                prof.setIdProfessor(rs.getInt("idProfessores"));
                prof.setNome(rs.getString("nome"));
                prof.setInstrumento(rs.getInt("instrumento_professor"));               
                
                return prof;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
       public Diario consultarRegistro(int id){
         
        try {
            Diario diario = new Diario();
            st = conn.prepareStatement("SELECT * from diario WHERE idDiario = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                diario.setId(rs.getInt("idDiario"));
                diario.setAluno(rs.getInt("aluno"));
                diario.setData(rs.getString("data"));
                diario.setPresenca(rs.getString("presenca"));
                diario.setDescricao_aula(rs.getString("descricao"));
                diario.setDesempenho(rs.getString("desempenho"));
                
                return diario;
                
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
       }
    
        // Métodos para listar dados em tabelas na tela
            public List<Professor> getProfessor(String consultaNome) {

        String sql = "SELECT * FROM professores WHERE nome LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Professor> listaProf = new ArrayList<>();

            while (rs.next()) {
                Professor prof = new Professor();

                prof.setIdProfessor(rs.getInt("idProfessores"));
                prof.setNome(rs.getString("nome"));
                prof.setInstrumento(rs.getInt("instrumento_professor"));

                listaProf.add(prof);

            }
            desconectar();
            return listaProf;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
      public List<Aluno> getAluno(String consultaNome) {

        String sql = "SELECT * FROM alunos WHERE nome LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Aluno> listaAluno = new ArrayList<>();

            while (rs.next()) {
                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("idAlunos"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getString("idade"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setPacote(rs.getInt("pacote_aluno"));
                aluno.setNivel(rs.getInt("nivel_aluno"));
                aluno.setInstrumento(rs.getInt("instrumento_aluno"));

                listaAluno.add(aluno);

            }
            desconectar();
            return listaAluno;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
       public List<Adm> getAdm (String consultaNome) {

        String sql = "SELECT * FROM administradores WHERE nome LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Adm> listaAdm = new ArrayList<>();

            while (rs.next()) {
                Adm adm = new Adm();

                adm.setId(rs.getInt("idAdministradores"));
                adm.setNome(rs.getString("nome"));
                adm.setFuncao(rs.getInt("funcao_adm"));

                listaAdm.add(adm);

            }
            desconectar();
            return listaAdm;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
    
    public List<Aula> getAula (String consultaNome) {

        String sql = "SELECT * FROM aulas WHERE aluno LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Aula> listaAula = new ArrayList<>();

            while (rs.next()) {
                Aula aula = new Aula();

                aula.setId(rs.getInt("idAulas"));
                aula.setAluno(rs.getInt("aluno"));
                aula.setHorario(rs.getInt("horario"));
                aula.setData(rs.getString("data"));

                listaAula.add(aula);

            }
            desconectar();
            return listaAula;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
    public List<Diario> getRegistro (String consultaNome) {

        String sql = "SELECT * FROM diario WHERE data LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Diario> listaRegistro = new ArrayList<>();

            while (rs.next()) {
                Diario diario = new Diario();

                diario.setId(rs.getInt("idDiario"));
                diario.setAluno(rs.getInt("aluno"));
                diario.setData(rs.getString("data"));
                diario.setPresenca(rs.getString("presenca"));
                diario.setDescricao_aula(rs.getString("descricao"));
                diario.setDesempenho(rs.getString("desempenho"));

                listaRegistro.add(diario);

            }
            desconectar();
            return listaRegistro;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
    
     public List<Entrada> getEntrada (String consultaNome) {

        String sql = "SELECT * FROM financeiro_entrada WHERE data LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Entrada> listaEntrada = new ArrayList<>();

            while (rs.next()) {
                Entrada entrada = new Entrada();

                entrada.setId(rs.getInt("idFinanceiro_entrada"));
                entrada.setData(rs.getString("data"));
                entrada.setValor(rs.getDouble("valor"));
                entrada.setAluno(rs.getInt("aluno"));
                entrada.setFormaPagamento(rs.getInt("forma_pagamento"));
                entrada.setUsuario(rs.getInt("usuario"));

                listaEntrada.add(entrada);

            }
            desconectar();
            return listaEntrada;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         }
     public List<Saida> getSaida (String consultaNome) {

        String sql = "SELECT * FROM financeiro_saida WHERE data LIKE ?";
        try {
            if (!conectar()) {
                JOptionPane.showMessageDialog(null, "Sem conexão com o banco");
                return null;
            }
            conectar();
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + consultaNome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Saida> listaSaida = new ArrayList<>();

            while (rs.next()) {
                Saida saida = new Saida();

                saida.setId(rs.getInt("idFinanceiro_saida"));
                saida.setDescricao(rs.getString("descricao"));
                saida.setData(rs.getString("data"));
                saida.setValor(rs.getDouble("valor"));
                saida.setUsuario(rs.getInt("usuario"));
               

                listaSaida.add(saida);

            }
            desconectar();
            return listaSaida;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
         
     
     
    }
     //Método para validar login
    
    public Usuario validarLogin(String login, String senha) {
        
        String query = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";

        
        try{
            conectar();  // Conecta ao banco
            PreparedStatement stmt = this.conn.prepareStatement(query);

            
            stmt.setString(1, login);
            stmt.setString(2, senha);

            
            ResultSet resultSet = stmt.executeQuery();

            
            if (resultSet.next()) {
               
                int tipo = resultSet.getInt("tipo_usuario"); 
                return new Usuario(login, senha, tipo); 
            }

        } catch (SQLException e) {
            e.printStackTrace();  
        }

        return null;  
    }

   
}
        


     
        
     


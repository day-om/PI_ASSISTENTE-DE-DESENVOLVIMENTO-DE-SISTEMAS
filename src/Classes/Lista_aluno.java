
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_aluno {
    
    private ArrayList<Aluno> alunos;
    private DefaultTableModel tabela_alunos;
    
     public Lista_aluno(DefaultTableModel tabela){
        this.alunos = new ArrayList<>();
        this.tabela_alunos = new DefaultTableModel();
    }
     public void Adicionar (Aluno aluno){
        alunos.add(aluno); 
        tabela_alunos.addRow(new Object []{
            aluno.getNome(),
            aluno.getIdade(),
            aluno.getCpf(),
            aluno.getPacote(),
            aluno.getInstrumento(),
            aluno.getNivel()           
            });
        
    }
    public ArrayList<Aluno> getAluno(){
        return alunos;
    }
    
    public DefaultTableModel getTabelaaluno(){
        return tabela_alunos;
    }
}

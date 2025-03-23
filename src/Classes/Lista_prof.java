
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_prof {
    
    private ArrayList<Professor> professores;
    private DefaultTableModel tabela_prof;
    
     public Lista_prof(DefaultTableModel tabela){
        this.professores = new ArrayList<>();
        this.tabela_prof = new DefaultTableModel();
    }
     
    public void Adicionar (Professor professor){
        professores.add(professor); 
        tabela_prof.addRow(new Object []{
            professor.getNome(),
            professor.getInstrumento(),
            professor.getHorario_manha(),
            professor.getHorario_tarde()            
            });
        
    }
    public ArrayList<Professor> getProfessor(){
        return professores;
    }
    
    public DefaultTableModel getTabelaprof(){
        return tabela_prof;
    }
     
     
}

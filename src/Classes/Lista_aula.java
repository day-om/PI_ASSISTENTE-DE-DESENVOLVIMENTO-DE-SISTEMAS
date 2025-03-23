
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_aula {
    
    private ArrayList<Aula> aulas;
    private DefaultTableModel tabela_aula;
    
     public Lista_aula(DefaultTableModel tabela){
        this.aulas = new ArrayList<>();
        this.tabela_aula = new DefaultTableModel();
    }
     
    public void Adicionar (Aula aula){
        aulas.add(aula); 
        tabela_aula.addRow(new Object []{
            aula.getAluno(),
            aula.getInstrumento(),
            aula.getHorario()
            });
        
    }
    public ArrayList<Aula> getAula(){
        return aulas;
    }
    
    public DefaultTableModel getTabelaaula(){
        return tabela_aula;
    }
}

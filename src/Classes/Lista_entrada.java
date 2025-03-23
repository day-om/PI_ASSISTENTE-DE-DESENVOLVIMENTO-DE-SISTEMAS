
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_entrada {
    
    private ArrayList<Entrada> entradas;
    private DefaultTableModel tabela_entradas;
    
     public Lista_entrada(DefaultTableModel tabela){
        this.entradas = new ArrayList<>();
        this.tabela_entradas = tabela;   
}
     
      public void Adicionar (Entrada entrada){
        entradas.add(entrada); 
        tabela_entradas.addRow(new Object []{
            entrada.getAluno(),
            entrada.getData(),
            entrada.getValor(),
            entrada.getFormaPagamento()
            });
        
    }
    public ArrayList<Entrada> getEntrada(){
        return entradas;
    }
    
    public DefaultTableModel getTabelasaidas(){
        return tabela_entradas;
    }
    
    
}

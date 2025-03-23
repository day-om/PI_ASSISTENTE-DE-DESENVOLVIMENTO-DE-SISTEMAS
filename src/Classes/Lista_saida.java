
package Classes;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_saida {
    
    private ArrayList<Saida> saidas;
    private DefaultTableModel tabela_saidas;
    
     public Lista_saida(DefaultTableModel tabela){
        this.saidas = new ArrayList<>();
        this.tabela_saidas = tabela;   
}
     
     public void Adicionar (Saida saida){
        saidas.add(saida); 
        tabela_saidas.addRow(new Object []{
            saida.getDescricao(),
            saida.getData(),
            saida.getValor()
            });
        
    }
    public ArrayList<Saida> getSaida(){
        return saidas;
    }
    
    public DefaultTableModel getTabelasaida(){
        return tabela_saidas;
    }
}

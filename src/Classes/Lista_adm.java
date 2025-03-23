
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_adm {
    
    private ArrayList<Adm> adms;
    private DefaultTableModel tabela_adm;
    
     public Lista_adm(DefaultTableModel tabela){
        this.adms = new ArrayList<>();
        this.tabela_adm = new DefaultTableModel();
    
}
     public void Adicionar (Adm adm){
        adms.add(adm); 
        tabela_adm.addRow(new Object []{
            adm.getNome(),
            adm.getFuncao()
            });
        
    }
    public ArrayList<Adm> getAdm(){
        return adms;
    }
    
    public DefaultTableModel getTabelaadm(){
        return tabela_adm;
    }
     
}

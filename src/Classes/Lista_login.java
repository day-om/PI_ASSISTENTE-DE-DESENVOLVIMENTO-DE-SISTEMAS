
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Lista_login {
    
    private ArrayList<Login> logins;
    private DefaultTableModel tabela_logins;
    
     public Lista_login(DefaultTableModel tabela){
        this.logins = new ArrayList<>();
        this.tabela_logins = tabela;
    }
     
     public void Adicionar (Login login){
        logins.add(login); 
        tabela_logins.addRow(new Object []{
            login.getUsuario(),
            login.getSenha()
            });
        
    }
    public ArrayList<Login> getLogin(){
        return logins;
    }
    
    public DefaultTableModel getTabelalogin(){
        return tabela_logins;
    }
     
     
}

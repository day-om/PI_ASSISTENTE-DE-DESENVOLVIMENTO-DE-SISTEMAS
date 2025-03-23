
package escola.de.musica;

public class Administradores extends Usuarios{
    String nome;
    String funcao;

    public Administradores(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }
     @Override
     public void mostrarDados(){
         System.out.println("----- Dados do Colaborador -----");
         System.out.println("Nome: "+ nome);
         System.out.println("Função "+ funcao);
         
         
     }
  
   }

   
    


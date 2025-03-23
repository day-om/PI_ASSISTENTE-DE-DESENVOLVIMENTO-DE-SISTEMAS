
package escola.de.musica;

import java.util.Date;


public class Financeiro extends Usuarios{
    String aluno;
    String data;
    String formaPagamento;

    public Financeiro(String aluno, String data, String formaPagamento) {
        this.aluno = aluno;
        this.data = data;
        this.formaPagamento = formaPagamento;
    }  
    @Override
    public void mostrarDados(){
        System.out.println("----- PAGAMENTOS -----");
        System.out.println("Aluno: "+ aluno);
        System.out.println("Data do pagamento: "+ data);
        System.out.println("Forma de pagamento: "+ formaPagamento);
    }
}

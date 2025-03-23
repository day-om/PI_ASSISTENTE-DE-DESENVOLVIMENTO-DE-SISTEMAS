
package Classes;


public class Entrada {
    String aluno;
    String data;
    Double valor;
    String formaPagamento;

    public Entrada(String aluno, String data, Double valor, String formaPagamento) {
        this.aluno = aluno;
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
    
    
    
}

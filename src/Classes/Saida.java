
package Classes;


public class Saida {
    String descricao;
    String data;
    Double valor;

    public Saida(String descricao, String data, Double valor) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
    
    
}

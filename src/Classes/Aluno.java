
package Classes;

public class Aluno {
    String nome;
    String idade;
    String cpf;
    String pacote;
    String instrumento;
    String nivel;

    public Aluno(String nome, String idade, String cpf, String pacote, String instrumento, String nivel) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.pacote = pacote;
        this.instrumento = instrumento;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}

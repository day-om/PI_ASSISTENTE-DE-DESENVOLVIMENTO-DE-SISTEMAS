
package Classes;


public class Professor {
    String nome;
    String instrumento;
    String horario_manha;
    String horario_tarde;

    public Professor(String nome, String instrumento, String horario_manha, String horario_tarde) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.horario_manha = horario_manha;
        this.horario_tarde = horario_tarde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getHorario_manha() {
        return horario_manha;
    }

    public void setHorario_manha(String horario_manha) {
        this.horario_manha = horario_manha;
    }

    public String getHorario_tarde() {
        return horario_tarde;
    }

    public void setHorario_tarde(String horario_tarde) {
        this.horario_tarde = horario_tarde;
    }
    

   

   

    
    
    
    
}

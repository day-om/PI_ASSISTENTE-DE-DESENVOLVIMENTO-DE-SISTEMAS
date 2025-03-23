
package Classes;


public class Aula {
    String aluno;
    String instrumento;
    String horario;

    public Aula(String aluno, String instrumento, String horario) {
        this.aluno = aluno;
        this.instrumento = instrumento;
        this.horario = horario;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}

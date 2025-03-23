
package escola.de.musica;


public class Aulas extends Usuarios{
    String aluno;
    String instrumento;
    String horario;

    public Aulas(String aluno, String instrumento, String horario) {
        this.aluno = aluno;
        this.instrumento = instrumento;
        this.horario = horario;
    }
    @Override
    public void mostrarDados(){
        System.out.println("---- AULAS AGENDADAS -----");
        System.out.println("Aluno(a): "+ aluno);
        System.out.println("Instrumento: "+ instrumento);
        System.out.println("Horário: "+ horario);
    }
}


package escola.de.musica;


public class Professores extends Usuarios{
    String nome;
    String instrumento;
    String horario;

    public Professores(String nome, String instrumento, String horario) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.horario = horario;
    }
    
    @Override
    public void mostrarDados(){
        System.out.println("----- Dados do Professor -----");
        System.out.println("Nome: "+ nome);
        System.out.println("Instrumento "+ instrumento);
        System.out.println("Horários: "+ horario);
    }
}

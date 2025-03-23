
package escola.de.musica;


public class Alunos extends Usuarios {
    String nome;
    String idade;
    String CPF;
    String pacoteAula;
    String instrumento;
    String nivelInstrumento;

    public Alunos(String nome, String idade,String CPF, String pacoteAula, String instrumento, String nivelInstrumento) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.pacoteAula = pacoteAula;
        this.instrumento = instrumento;
        this.nivelInstrumento = nivelInstrumento;
    }
    
    @Override
    public void mostrarDados(){
        System.out.println("----- Dados do Aluno(a) -----");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("CPF: "+ CPF);
        System.out.println("Pacote de aula: "+ pacoteAula);
        System.out.println("Instrumento: "+ instrumento);
        System.out.println("Nivel: "+ nivelInstrumento);
    }
}

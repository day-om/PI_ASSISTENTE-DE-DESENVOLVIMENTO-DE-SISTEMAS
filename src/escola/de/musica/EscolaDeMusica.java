
package escola.de.musica;
import escola.de.musica.Administradores;
import escola.de.musica.Alunos;
import escola.de.musica.Aulas;
import escola.de.musica.Financeiro;
import escola.de.musica.Professores;
import escola.de.musica.Usuarios;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class EscolaDeMusica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       List<Administradores> listaAdm = new ArrayList<>();
       List<Professores> listaProf = new ArrayList<>();
       List<Alunos> listaAlunos = new ArrayList<>();
       List<Aulas> listaAulas = new ArrayList<>();
       List<Financeiro> listaFinanceiro = new ArrayList<>();
       
       
       int menu;
       
       do{
           System.out.println("----- MENU ----- ");
           System.out.println("Escolha uma das opções: ");
           System.out.println("1 - Cadastros.");
           System.out.println("2 - Aulas.");
           System.out.println("3 - Financeiro.");
           System.out.println("4 - Mostrar Dados.");
           System.out.println("5 - Sair.");
           
           menu = entrada.nextInt();
           if(menu != 1 && menu != 2 && menu!= 3 && menu != 4 && menu !=5){
               System.out.println("Insira uma opção válida!");
           }
           
           switch(menu){
               case 1 -> {
                   int opcao;
           System.out.println("Escolha uma das opções: ");
           System.out.println("1 - Administradores.");
           System.out.println("2 - Professores.");
           System.out.println("3 - Alunos");
           System.out.println("4 - Sair.");
           
           opcao = entrada.nextInt();
           if(opcao != 1 && opcao != 2 && opcao!= 3 && opcao != 4){
               System.out.println("Insira uma opção válida!");  
           }
           
            switch(opcao){
                case 1 -> {
                    System.out.println("PREENCHA OS DADOS ABAIXO:");
                    System.out.println("Nome: ");
                    String nome = entrada.next();
                    System.out.println("Função: ");
                    String funcao = entrada.next();
                    Administradores adm = new Administradores(nome,funcao);
                    listaAdm.add(adm); 
                    System.out.println("Cadastro realizado com sucesso!");
                    
                    break; 
                }
                case 2 -> {
                    System.out.println("PREENCHA OS DADOS ABAIXO:");
                    System.out.println("Nome: ");
                    String nome = entrada.next();
                    System.out.println("Instrumento: ");
                    String instrumento = entrada.next();
                    System.out.println("Horário: ");
                    String horario = entrada.next();
                    Professores prof = new Professores(nome,instrumento,horario);
                    listaProf.add(prof);
                    System.out.println("Cadastro realizado com sucesso!");
                    
                    break; 
                }
                case 3 -> {
                    System.out.println("PREENCHA OS DADOS ABAIXO:");
                    System.out.println("Nome: ");
                    String nome = entrada.next();
                    System.out.println("Idade: ");
                    String idade = entrada.next();
                    System.out.println("Nome: ");
                    String CPF = entrada.next();
                    System.out.println("Pacote de aula: ");
                    String pacoteAula = entrada.next();
                    System.out.println("Instrumento: ");
                    String instrumento = entrada.next();
                    System.out.println("Nível: ");
                    String nivelInstrumento = entrada.next();
                    Alunos aluno = new Alunos(nome,idade,CPF,pacoteAula,instrumento,nivelInstrumento);
                    listaAlunos.add(aluno);
                    System.out.println("Cadastro realizado com sucesso!");   
                    
                    break; 
                    
                }                
            }
            break;
            }
               case 2-> {
                   System.out.println("---- AGENDAMENTOS -----");
                   System.out.println("Aluno:");
                   String aluno = entrada.next();
                   System.out.println("Instrumento:");
                   String instrumento = entrada.next();
                   System.out.println("Horário:");
                   String horario = entrada.next();
                   Aulas aula = new Aulas(aluno,instrumento,horario);
                   listaAulas.add(aula);
                   System.out.println("Agendamento realizado com sucesso!");
                   
                   break; 
               }
               case 3-> {
                   System.out.println("----- REGISTRO DE PAGAMENTO ---- ");
                   System.out.println("Aluno: ");
                   String aluno = entrada.next();
                   System.out.println("Data:");
                   String data = entrada.next();
                   System.out.println("Forma de pagamento:");
                   String formaPagamento = entrada.next();
                   Financeiro financeiro = new Financeiro(aluno,data,formaPagamento);
                   listaFinanceiro.add(financeiro);
                   System.out.println("Registro concluído com sucesso!");
                   
                   break; 
               }
               
            
               case 4-> {
                  int opcao;
                   System.out.println("Quais dados deseja visualizar?");
                   System.out.println("1- Administradores.");
                   System.out.println("2- Professores");
                   System.out.println("3- Alunos");
                   System.out.println("4- Aulas.");
                   System.out.println("5- Pagamentos.");
                   System.out.println("6- Sair");
                   
                   opcao = entrada.nextInt();
                   
                   switch(opcao){
                       case 1-> {
                           for(Administradores a: listaAdm){
                               a.mostrarDados();
                           }
                        break;   
                       }
                       case 2-> {
                           for(Professores p: listaProf){
                               p.mostrarDados();
                           }
                        break;   
                       }
                       case 3-> {
                           for(Alunos a: listaAlunos){
                               a.mostrarDados();
                           }
                        break;   
                       }
                       case 4-> {
                           for(Aulas a: listaAulas){
                               a.mostrarDados();
                           }
                        break;   
                       }
                       case 5-> {
                           for(Financeiro f: listaFinanceiro){
                               f.mostrarDados();
                           }
                        break;   
                       }
                   }
               }       
               }
           
       
       }while(menu != 5);
       
       
       
        
        
    }
    
}

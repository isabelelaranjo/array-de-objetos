package principal;
 
import modelo.*;
import java.util.*;
public class Cadastro {

    public static void main(String[] args) {
      Array<Alunos> listaAlunos =new Array<>();
      Scanner scanner = new Scanner(System.in);
      int opcao = 0;

      listaAlunos.inserir(new Alunos("Fulano"));
      listaAlunos.inserir(new Alunos("Ciclano"));
      listaAlunos.inserir(new Alunos("Beltano"));

      System.out.println(""" 
              Escolha a operação a ser realzada:
              
              1 - Pesquisar
              
              2 - Atualizar
              
              3 - Remover
              
              4 - Inserir
              
              5 - Exibir
              
              0 - Parar
              """);

      do {

          opcao = scanner.nextInt();
          switch (opcao) {

              case 1:
                  System.out.println("Digite o RA: ");
                  int ra = scanner.nextInt();
                  System.out.println(listaAlunos.pesquisarCadastro(ra));
                  break;

              case 2:
                  System.out.println("Digite o RA do aluno e o novo nome: ");
                  int raAtt = scanner.nextInt();
                  String novoNome = scanner.next();
                  listaAlunos.atualizar(raAtt, new Alunos(novoNome));
                  break;

              case 3:
                  System.out.println("Digite o RA do aluno a remover: ");
                  int raPesquisa = scanner.nextInt();
                  listaAlunos.remover(raPesquisa);
                  break;

              case 4:
                  System.out.println("Insira um novo aluno: ");
                  String novoAluno = scanner.next();
                  listaAlunos.inserir(new Alunos(novoAluno));
                  break;

              case 5:
                  System.out.println("Exibir todos os alunos");
                  listaAlunos.exibir();
                  break;

              default:
                  break;
          }

      }while (opcao != 0) ;

    }
    
}

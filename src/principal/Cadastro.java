package principal;
 
import modelo.*;
public class Cadastro {

    public static void main(String[] args) {
      Array<Alunos> listaCarros=new Array<>();
      listaCarros.inserir(new Alunos("Fox"));
      listaCarros.inserir(new Alunos("Jetta"));
      listaCarros.inserir(new Alunos("Jetta"));

      listaCarros.remover(1);

      listaCarros.exibir();
    }
    
}

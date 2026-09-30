package principal;
 
import modelo.*;
public class Cadastro {

    public static void main(String[] args) {
      Array<Alunos> listaCarros=new Array<>();
      listaCarros.inserir(new Alunos("Fox", 200000));
      listaCarros.inserir(new Alunos("Jetta", 20000));
      listaCarros.exibir();
    }
    
}

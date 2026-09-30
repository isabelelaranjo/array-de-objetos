package modelo;

public class Array<T>{

    private Object[] lista = new Object[3];
    private int controle = 0;//controla cadastros 

    public boolean inserir(T item) {
        if (controle == lista.length) {
            lista=criarNovoArray();
        }
        lista[controle] = item;
        controle++;
        return true;
    }

    public void exibir() {
        for (int i = 0; i < controle; i++) {
            System.out.println(lista[i]);
        }
    }

    private Object[] criarNovoArray() {
        Object[] novo = new Object[lista.length * 2];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    /**
     * Pesquisa usando o m�todo linear para buscar 
     * o cadastro de uma pessoa no array lista.
     * @param ra int
     * @return Alunos
     */
    public Alunos pesquisarCadastro(int ra){
        Alunos a;
        for(int i=0;i<controle;i++){
         a=(Alunos)lista[i];//Convers�o tempor�ria (cast)
         if(ra==a.getRa()){
           return a;
         }
      }
      return null;
    }

    public boolean atualizar (Alunos chave, Alunos novo){

        return true;
    }

    
}

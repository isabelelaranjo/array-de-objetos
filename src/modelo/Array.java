package modelo;

public class Array<T>{

    private Object[] lista = new Object[3];
    private int controle = 0;//controla cadastros 

    public void inserir(T item) {
        if (controle == lista.length) {
            lista=criarNovoArray();
        }
        lista[controle] = item;
        controle++;
    }

    public void exibir() {
        for (int i = 0; i < controle; i++) {
            System.out.println(lista[i]);
        }
    }

    private Object[] criarNovoArray() {
        Object[] novo = new Object[lista.length + 3];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    /**
     * Pesquisa usando o método linear para buscar 
     * o cadastro de uma pessoa no array lista.
     * @param id int
     * @return Pessoa
     */
    public Pessoa pesquisarCadastro(int id){
        Pessoa p;
        for(int i=0;i<controle;i++){
         p=(Pessoa)lista[i];//Conversão temporária (cast)
         if(id==p.getId()){
           return p;
         }
      }
      return null;
    }
    
    
    
    
    
}

package modelo;

public class Array<T>{

    private  Object[] lista = new Object[3];
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

    public Alunos pesquisarCadastro(int ra){
        Alunos a;
        for(int i=0;i<controle;i++){
         a=(Alunos)lista[i];
         if(ra==a.getRa()){
           return a;
         }
      }
      return null;
    }

    public boolean atualizar (int ra, Alunos novo){
        for(int i = 0; i < lista.length; i++){
            Alunos a = (Alunos)lista[i];
            if(ra == i){
                a.setNome(novo.getNome());
                return true;
            }
        }
        return false;
    }

    public boolean remover(int ra){
        for(int i = 0; i < lista.length; i++) {
            Alunos a = (Alunos)lista[i];
            if(a.getRa() == ra) {
                for(int j = 0; j < lista.length-1; j++) {
                    lista[j] = lista[j+1];
                }
                lista[lista.length-1] = null;
            }
            controle--;
            return true;
        }
        return false;
    }

    public Alunos obter (int posicao){
        for(int i = 0; i<lista.length; i++){
            if(i==posicao){
                return (Alunos)lista[i];
            }
        }
        return null;
    }

    public boolean comparar(Alunos a, Alunos b){
        if(a.equals(b)){
            return true;
        }
        return false;
    }
    
}

public class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }
    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }
    
    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else{
            System.out.println("Dados da lista " + nomeLista);
            No<T> aux = primeiroNo;

            while (aux != null){
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }
    }


}

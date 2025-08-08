public class Professor extends Pessoa{
    private int idProfessor;

    public Professor(){

    }
    public Professor(String nome, int idade, long cpf, int idProfessor){
        super(nome, idade, cpf);
        setIdProfessor(idProfessor);
    }
    public void setIdProfessor(int idProfessor){
        this.idProfessor = idProfessor;
    }
    public int getIdProfessor(){
        return this.idProfessor;
    }
    public String toString(){
        return String,format(super.toString() + "ID Professor: " + getIdProfessor());
    }
}

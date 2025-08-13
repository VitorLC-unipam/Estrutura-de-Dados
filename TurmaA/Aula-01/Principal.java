import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("Vitor", 22);
        Pessoa obj2 = new Pessoa("Lucas", 20);
        Pessoa obj3 = new Pessoa("Hanna", 19);

        /* 
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());*/

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
        listaP.add(new Pessoa("Vitor",22));
        listaP.add(new Pessoa("Lucas",20));
        listaP.add(new Pessoa("Hanna", 19));

        /* g
        System.out.println(listaP.get(0));
        System.out.println(listaP.get(1));
        System.out.println(listaP.get(2));*/

        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }


    }
   
}

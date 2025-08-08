public class Principal{
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Cecilia", 6);
        Pessoa obj3 = new Pessoa("Joaquim", 2, 2121212121l);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());


    }   
    

}
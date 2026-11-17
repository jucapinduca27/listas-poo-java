public class Princ {
    public static void main(String[] args) {
        Classe1 obj1 = new Classe1(5);
        Classe2 obj2 = new Classe2(obj1);
        int x = 3;
        obj1.soma(2);
        obj2.somaValor(x);
        System.out.println(x + "-"+ obj1.getValor() + "-" + obj2.getValor());
    }
}

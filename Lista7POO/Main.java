import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static Forma criaForma(){
        Random random = new Random();
        int tipoForma = random.nextInt(6);
        double a = 1 + random.nextDouble() * 9; 
        double b = 1 + random.nextDouble() * 9; 
        switch (tipoForma) {
            case 0:
                return new Quadrado(a);
            case 1:
                return new Circulo(a);
            case 2:
                return new Triangulo(a, b);
            case 3:
                return new Esfera(a);
            case 4:
                return new Cubo(a);
            case 5:
                return new Cilindro(a, b);
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Forma f = criaForma();
            formas.add(f);
        }
        System.out.println("Imprimindo dados das formas:");
        for(Forma f : formas){
            f.imprimir_dados();
            System.out.println();
        }

    }
}
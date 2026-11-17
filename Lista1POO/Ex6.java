import java.util.Random;




public class Ex6 {
    public static void main(String[] args){
        int[] lista = new int[10];
        Random x = new Random();
        for(int i = 0; i < 10; i++){
            lista[i] = x.nextInt(100);
        }
        System.out.println("Vetor desordenado:");
        for(int k = 0; k < 10; k++){
            System.out.print(+lista[k]+" ");
        }
        for(int i = 0; i < 9; i++){
            int indice = i;
            for(int j = i+1; j < 10; j++){
            if(lista[j] < lista[indice]){
                indice = j;
                }
            }
            int aux = lista[indice];
            lista[indice] = lista[i];
            lista[i] = aux;
        }
        System.out.println();
        System.out.println("Vetor ordenado:");
        for(int i = 0; i < 10; i++){
            System.out.print(+lista[i]+" ");
        }


    }
}

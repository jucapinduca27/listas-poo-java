import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 0, k = 0;
        System.out.print("Tamanho do vetor:");
        tam = sc.nextInt();
        int[] vetor = new int[tam];
        System.out.print("Deslocamento K:");
        k = sc.nextInt();

        for(int i = 0; i < tam; i++){
            System.out.printf("%dº número:", i+1);
            vetor[i] = sc.nextInt();
        }
        k %= tam;
        
        int[] novo_vetor = new int[tam];
        for(int i = 0; i < tam; i++){
            int np = (i+k) % tam;
            novo_vetor[np] = vetor[i];
        }
        System.out.printf("Novo vetor: ");
        for(int i = 0; i < tam; i++){
            System.out.printf("%d ", novo_vetor[i]);
        }
        sc.close();
        
    }
}

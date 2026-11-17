import java.util.Scanner;

public class Ex11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, soma = 0;
        System.out.print("Digite um número:");
        N = sc.nextInt();
        System.out.printf("São divisores de %d: ", N);
        for(int i = 1; i < N; i++){
            if(N % i == 0){
                System.out.printf("%d ", i);
                soma += i;
            }
        }

        if(soma == N)
            System.out.printf("\n%d é um número perfeito\n", N);
        else
            System.out.printf("\n%d não é um número perfeito!\n", N);
    }

}
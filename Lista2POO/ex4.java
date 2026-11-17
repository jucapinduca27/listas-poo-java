
import java.util.Scanner;

public class ex4{
    public static boolean ehPerfeito(int n){
        int soma = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                soma += i;
            }
        }

        if(soma == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número A:");
        int A = sc.nextInt();
        System.out.printf("Digite um número B:");
        int B = sc.nextInt();
        int qtd_perfect = 0;
        for(int i = A; i < B; i++){
            if(ehPerfeito(i)){
                System.out.printf("%d é perfeito.\n", i);
                qtd_perfect++;
            }
                    
        }
        System.out.printf("Há %d números perfeitos no intervalo (%d,%d).\n", qtd_perfect,A,B);

        
    }
 }

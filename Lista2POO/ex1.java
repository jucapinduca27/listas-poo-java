import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor; 
        System.out.print("Digite o valor R$:");
        valor = sc.nextInt();
        int notas_cem = valor / 100;
        valor %= 100;
        int notas_cinquenta = valor / 50;
        valor %= 50;
        int notas_vinte = valor / 20;
        valor %= 20;
        int notas_dez = valor / 10;
        valor %= 10;
        int notas_cinco = valor / 5;
        valor %= 5;
        int notas_dois = valor / 2;
        valor %= 2;
        System.out.printf("%d nota(s) de R$100\n",notas_cem );
        System.out.printf("%d nota(s) de R$50\n", notas_cinquenta);
        System.out.printf("%d nota(s) de R$20\n", notas_vinte);
        System.out.printf("%d nota(s) de R$10\n", notas_dez);
        System.out.printf("%d nota(s) de R$5\n", notas_cinco);
        System.out.printf("%d nota(s) de R$2\n", notas_dois);
        if(valor == 0){
            System.out.print("Saque PODE ser realizado!\n");
        } else {
            System.out.print("Saque NÃO PODE ser realizado!\n");
        }
    }
}
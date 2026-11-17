import java.util.Scanner;



public class Ex9 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sal_min, val_kwh, qtd_kwh, conta, conta_desc;
        System.out.println("Valor do salário mínimo R$:");
        sal_min = sc.nextFloat();
        System.out.println("Quantidade do KwH gasta:");
        qtd_kwh = sc.nextFloat();
        val_kwh = (sal_min/800);
        System.out.printf("Valor do Kwh R$: %.2f%n",val_kwh);
        conta = val_kwh * qtd_kwh;
        conta_desc = conta * 0.85f;
        System.out.printf("Valor a ser pago R$: %.2f%n", conta);
        System.out.printf("Valor a ser pago com 15%% de desconto R$: %.2f%n",conta_desc);
        sc.close();

    }
        


}



    


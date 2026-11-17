import java.util.Scanner;



public class Ex8 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;
        float saldo = 0, din;
        do {
        System.out.println("\n=====BANCO BANESTES====");
        System.out.println("SALDO ATUAL: R$"+saldo+"");
        System.out.println("[0] - Débito");
        System.out.println("[1] - Crédito");
        System.out.println("[2] - Sair");
        System.out.print("OPÇÃO ESCOLHIDA:");
        opcao = sc.nextInt();
        switch(opcao){
            case 0:{
                System.out.print("VALOR A RETIRAR:");
                din = sc.nextFloat();
                if(din > saldo)
                {
                    System.out.print("SALDO INSUFICIENTE!\n");
                } 
                else if(din <= 0)
                {
                    System.out.print("VALOR INVÁLIDO PRA SAQUE!\n");
                }
                else
                {
                    System.out.print("REMOVIDO: R$"+din+"\n");
                    saldo -= din;
                }
                break;
            }
            case 1:{
                System.out.print("VALOR A DEPOSITAR:");
                din = sc.nextFloat();
                if(din <= 0){
                    System.out.print("VALOR DE DEPÓSITO INVÁLIDO!\n");
                } else {
                    saldo += din;
                    System.out.println("DEPOSITADO: R$" + din);
                }
                break;
            }
            case 2:{
                System.out.print("SALDO ATUAL: R$" + saldo + "\n");
                System.out.print("SAINDO......\n");
                break;
            }
            default:{
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
        }
        } while(opcao != 2);
        sc.close();


    }



    
}

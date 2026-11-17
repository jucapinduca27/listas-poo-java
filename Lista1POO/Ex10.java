import java.util.Scanner;

public class Ex10
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int op,x,y,result=0;
	    do {
	        System.out.println("---CALCULADORA---");
	        System.out.println("[1] - SOMA");
	        System.out.println("[2] - SUBTRAÇÃO");
	        System.out.println("[3] - DIVISÃO");
	        System.out.println("[4] - MULTIPLICAÇÃO");
	        System.out.println("[0] - SAIR");
	        System.out.print(   "OPÇÃO ESCOLHIDA:");
	        op = sc.nextInt();
	        if(op >= 1 && op <= 4){
	            System.out.println("Escolha o 1º número:");
	            x = sc.nextInt();
	           System.out.println("Escolha o 2º número:");
	            y = sc.nextInt();
	            boolean opVal = true;
	            switch (op){
	                case 1: {
	                    result = x + y;
	                    break;
	                    }
	                case 2:{
	                    result = x - y;
	                    break;
	                }
	                case 3:{
	                    if(y == 0){
	                        System.out.println("Erro: divisão por zero");
	                        opVal = false;
	                    }
	                    else {
	                        result = x / y;	  
	                    }
	                    break;
	                }
	                case 4:{
	                    result = x * y;
	                    break;
	                }

	         }
	         if(opVal){
	             System.out.println("Resultado: "+result);
	         }
	        }
	        
	        else if (op == 0)
	            System.out.println("Saindo da calculadora...");
	        else
	            System.out.println("Opção inválida!");
	           
	       } while (op != 0);
	    
	} 
}
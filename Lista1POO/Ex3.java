import java.util.Scanner;

public class Ex3
{
    public static boolean ehprimo(int n){
        if(n <= 1)
            return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) 
                return false;
        }
        return true;
        
    }
	public static void main(String[] args) {
	    int[] vetor = new int[10];
	    Scanner sc = new Scanner(System.in);
	    for(int i = 0; i < 10; i++){
	        System.out.print(+(i+1)+"º número:");
	        vetor[i] = sc.nextInt();
	    }
	    for(int i = 0; i < 10; i++){
	        if(ehprimo(vetor[i]))
	            System.out.println(+vetor[i]+" é primo!");
	    }
	}
}

import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		do {
		    System.out.print("Quantos termos de Fibonacci:");
		    N = sc.nextInt();
		} while (N <= 0);
		int f_2 = 0, f_1 = 1;
		for(int i = 0; i < N; i++){
		    int soma = f_2 + f_1;
		    System.out.println(f_2);
		    f_2 = f_1;
		    f_1 = soma;
		}
	}
}

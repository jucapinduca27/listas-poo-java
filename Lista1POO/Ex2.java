import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os lados do triangulo:");
		System.out.print("1º Lado:");
		a = sc.nextFloat();
		System.out.print("2º Lado:");
		b = sc.nextFloat();
		System.out.print("3º Lado:");
		c = sc.nextFloat();
		if(c >= a + b || b >= a + c || a >= b + c){
		    System.out.println("Triangulo Impossivel!");
		} else {
		    if(a == b && a == c)
		        System.out.println("Triangulo Equilatero");
		    else if(a == b || a == c || b == c)
		        System.out.println("Triangulo Isosceles");
		    else 
		        System.out.println("Triangulo Escaleno");
		}
		
		
	}
}

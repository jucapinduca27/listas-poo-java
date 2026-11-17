import java.util.Scanner;

public class Ex7
{
    
	public static void main(String[] args) {
	    int num_alunos, num_notas;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Quantidade de alunos:");
	    num_alunos = sc.nextInt();
	    System.out.print("Quantidade de notas:");
	    num_notas = sc.nextInt();
	    float[][] notas = new float[num_alunos][num_notas];
	    float[] medias = new float[num_alunos];
	    for(int i = 0; i < num_alunos; i++){
	        System.out.println(+(i+1)+"º aluno:");
	        float soma = 0;
	        for(int j = 0; j < num_notas; j++){
	            System.out.print("Nota "+(j+1)+":");
	            notas[i][j] = sc.nextFloat();
	            soma += notas[i][j];
	        }
	        medias[i] = soma/3;
	        if(medias[i] >= 7)
	           System.out.println("APROVADO");
	        else if(medias[i] >= 4)
	           System.out.println("PROVA FINAL");
	        else
	           System.out.println("REPROVADO");
	       System.out.println();
	   }
	}
}

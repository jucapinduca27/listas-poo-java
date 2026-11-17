import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        float soma = 0, maior_nota = 0, menor_nota = 0; 
        System.out.print("Quantas notas serão lidas?:");
        N = sc.nextInt();
        float[] notas = new float[N];
        for(int i = 0; i < N; i++){
            System.out.print(+(i+1)+"ª nota:");
            notas[i] = sc.nextFloat();
            if(i == 0){
                maior_nota = notas[i];
                menor_nota = notas[i];
            } else {
                if(notas[i] > maior_nota)
                    maior_nota = notas[i];
                if(notas[i] < menor_nota)
                    menor_nota = notas[i];
            }
            soma += notas[i];
        }
        float media = soma / N;
        System.out.printf("Maior nota: %.2f%n",maior_nota);
        System.out.printf("Menor nota: %.2f%n",menor_nota);
        System.out.printf("Média da turma: %.2f%n",media);

        sc.close();

    }
}

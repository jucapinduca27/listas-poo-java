import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, a=0,b=0,c=0;
        System.out.print("Digite um número:");
        N = sc.nextInt();
        boolean ehTriangular = false;
        for(int i = 0; i * (i+1) * (i+2) <= N; i++){
            if(N == i * (i+1) * (i+2)){
                ehTriangular = true;
                a = i; b = i + 1; c = i + 2;
                break;
            }
        }
        if(ehTriangular)
            System.out.printf("%dx%dx%d = %d. Então %d é triangular!\n",a,b,c, N, N);
        else
            System.out.printf("%d não é triângular.\n", N);
    }
}

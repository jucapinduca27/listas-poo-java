import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        do {
            System.out.print("Digite um número:");
            X = sc.nextInt();
            if(X == 0){
                System.out.print("Programa encerrado!\n");
                break;
            }
            System.out.printf("(%d)x(%d) = %d\n", X,X, X*X);
        } while(X != 0);
    }
}

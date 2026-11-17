import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];
        System.out.println("Leitura Matriz A:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("Posição (%d,%d):", i,j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Leitura Matriz B:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("Posição (%d,%d):", i,j);
                B[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                C[i][j] = 0; // Resetar valor
                for(int k = 0; k < 4; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }

            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                 System.out.printf("%d ", C[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        do {
            System.out.print("Digite A e B (sendo A < B): ");
            A = sc.nextInt();
            B = sc.nextInt();
        } while (A >= B);

        
        int primeiroDiv3 = A;
        while (primeiroDiv3 % 3 != 0) {
            primeiroDiv3++;
        }

        int aqtd = 0, aprim = 0, ault = 0;
        int maxQtd = 0, maxPrim = 0, maxUlt = 0;

        for (int i = primeiroDiv3; i <= B; i += 3) {
            if (i % 5 != 0) { 
                if (aqtd == 0) {
                    aprim = i;
                }
                aqtd++;
                ault = i;

                if (aqtd > maxQtd) {
                    maxQtd = aqtd;
                    maxPrim = aprim;
                    maxUlt = ault;
                }
            } else {
                aqtd = 0;
            }
        }

        if (maxQtd > 0) {
            System.out.printf("Há %d números no maior grupo.\n", maxQtd);
            System.out.printf("Primeiro no grupo: %d\n", maxPrim);
            System.out.printf("Último no grupo: %d\n", maxUlt);
        } else {
            System.out.println("No intervalo, não há números que satisfaçam as condições!");
        }

        sc.close();
    }
}
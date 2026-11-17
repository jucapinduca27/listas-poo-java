import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<FixedEmployee> FixedEmployees = new ArrayList<>();
        ArrayList<ComissionedEmployee> ComissionedEmployees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option = -1;
        do {
            System.out.printf("\n====================== M E N U ==============================\n");
            System.out.println("[1] - CADASTRAR EMPREGADO DE SALÁRIO FIXO.");
            System.out.println("[2] - CADASTRAR EMPREGADO DE SALÁRIO POR COMISSÃO.");
            System.out.println("[3] - LISTAR EMPREGADOS DE SALÁRIO FIXO.");
            System.out.println("[4] - LISTAR EMPREGADOS DE SALÁRIO POR COMISSÃO");
            System.out.println("[5] - FOLHA DE PAGAMENTO TOTAL.");
            System.out.println("[6] - BUSCAR EMPREGADO POR CPF.");
            System.out.println("[0] - SAIR DO MENU");
            System.out.print("\nOPCÃO ESCOLHIDA:");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.print("NOME:"); String name = sc.nextLine();
                    System.out.print("SETOR: "); String sector = sc.nextLine();
                    System.out.print("CPF: "); String cpf = sc.nextLine();
                    System.out.printf("SALÁRIO FIXO: "); Float wage = sc.nextFloat();
                    sc.nextLine();
                    FixedEmployee emp = new FixedEmployee(name, cpf, sector, wage);
                    FixedEmployees.add(emp);
                    System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("NOME:"); name = sc.nextLine();
                    System.out.print("SETOR: "); sector = sc.nextLine();
                    System.out.print("CPF: "); cpf = sc.nextLine();
                    System.out.print("SALÁRIO: "); wage = sc.nextFloat();
                    System.out.print("TOTAL DE VENDAS (R$): "); Float totalSells = sc.nextFloat();
                    System.out.print("PERCENTUAL DE COMISSÃO (%): ");  Float percentCom = sc.nextFloat();
                    ComissionedEmployee emp2 = new ComissionedEmployee(name, cpf, sector, wage, totalSells, percentCom);
                    ComissionedEmployees.add(emp2);
                    System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                    System.out.println();
                    break;
                case 3:
                    if(FixedEmployees.size() == 0){
                        System.out.println("NÃO HÁ FUNCIONÁRIOS CADASTRADOS!");
                        break;
                    }
                    int Fixed = 1;
                    for(FixedEmployee f: FixedEmployees){
                        System.out.printf("%dº EMPREGADO - DADOS:\n", Fixed);
                        f.showDataEmployee();
                        Fixed++;
                    }
                    System.out.println();
                    break;

                case 4:
                    if(ComissionedEmployees.size() == 0){
                        System.out.println("NÃO HÁ FUNCIONÁRIOS CADASTRADOS!");
                        break;
                    }
                    int Comiss = 1 ;
                    for(ComissionedEmployee f: ComissionedEmployees){
                        System.out.printf("%d EMPREGADO - DADOS:\n", Comiss);
                        f.showDataEmployee();
                        Comiss++;
                    }
                    System.out.println();
                    break;
                case 5:
                    Float total = 0.f;
                    for(FixedEmployee f: FixedEmployees){
                        total += f.WageCalc();
                    }
                    for(ComissionedEmployee c: ComissionedEmployees){
                        total += c.WageCalc();
                    }
                    System.out.printf("FOLHA DE PAGAMENTO: R$%.2f\n", total);
                    System.out.println();
                    break;

                case 6: 
                    System.out.print("CPF DO EMPREGADO: ");
                    cpf = sc.next();
                    int flag = 0;
                    for(FixedEmployee f: FixedEmployees){
                        if(f.getCPF().equalsIgnoreCase(cpf)){
                            f.showDataEmployee();
                            flag = 1;
                            break;
                        }
                    }
                    for(ComissionedEmployee c: ComissionedEmployees){
                        if(c.getCPF().equalsIgnoreCase(cpf)){
                            c.showDataEmployee();
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.println("EMPREGADO NÃO ENCONTRADO!");
                        
                    }
                    System.out.println();
                    break;
                default: 
                    System.out.println("OPÇÃO INVÁLIDA! ESCOLHA DE 1 A 6");
                    System.out.println();
            }
        } while (option != 0);

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    private String nome;
    Scanner sc = new Scanner(System.in);
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Escola(String n){
        this.nome = n;
    }

    public void AddFuncionario(){
        String nome, cpf;
        double salario;

        System.out.print("NOME DO FUNCIONÁRIO: ");
        nome = sc.nextLine();

        System.out.print("CPF DO FUNCIONÁRIO: ");
        cpf = sc.nextLine();

        System.out.print("SALÁRIO DO FUNCIONÁRIO: ");
        salario = sc.nextDouble();
        sc.nextLine();

        int op;
        do {
            System.out.println("CARGO DO FUNCIONÁRIO");
            System.out.println("[1] - PROFESSOR");
            System.out.println("[2] - SECRETÁRIO");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            op = sc.nextInt();
            sc.nextLine();
            if (op != 1 && op != 2) {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
            }  while (op != 1 && op != 2);
            switch (op){
                case 1:
                    String disc;
                    System.out.print("DISCIPLINA MINISTRADA:");
                    disc = sc.nextLine();
                    Professor prof = new Professor(nome, cpf, salario, disc);
                    funcionarios.add(prof);
                    break;
                case 2:
                    String setor;
                    System.out.print("SETOR DO FUNCIONÁRIO:");
                    setor = sc.nextLine();
                    Secretario secret = new Secretario(nome, cpf, salario, setor);
                    funcionarios.add(secret);
                    break;
                default: 
                    System.out.print("OPÇÃO INVÁLIDA!\n");
                    break;
            }
         
        
    }
 
    public void ListarFuncionarios(){
        if(funcionarios.isEmpty()){
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }
        System.out.println("LISTAGEM DE FUNCIONÁRIOS:");
        for(Funcionario f: funcionarios){
            f.ExibirDados();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.print("NOME DA ESCOLA:");
        nome = scan.nextLine();
        Escola escola = new Escola(nome);
        int op;
        do {
            System.out.println("\n============ESCOLA " + nome + "==========");
            System.out.println("[1] - CADASTRAR FUNCIONÁRIO");
            System.out.println("[2] - LISTAR FUNCIONÁRIOS");
            System.out.println("[3] - SAIR DO MENU");
            System.out.print("OPÇÃO ESCOLHIDA:");
            op = scan.nextInt();
            System.out.println();
            switch(op){
            case 1:
                escola.AddFuncionario();
                break;
            case 2:
                escola.ListarFuncionarios();
                break;
            case 3:
                System.out.println("\nEncerrando sistema.....");
                break;
            default:
                System.out.println("\nOPÇÃO INVÁLIDA!");
                break;
        }
        } while (op != 3);
        
        scan.close();
        
    }

}

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Agenda myAgenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        String nome, tel, email;
        int op = 0;
        while(op != 5){
            System.out.println("========MENU INTERATIVO========");
            System.out.println("[1] - Adicionar contato");
            System.out.println("[2] - Remover contato");
            System.out.println("[3] - Buscar contato");
            System.out.println("[4] - Listar contatos");
            System.out.println("[5] - Sair");
            System.out.print("OPÇÃO:");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.println();
                    System.out.println("=====ADD CONTATO=====");
                    System.out.print("Digite o nome:"); nome = sc.nextLine();
                    System.out.print("Digite o telefone:"); tel = sc.nextLine();
                    System.out.print("Digite o email:"); email = sc.nextLine();
                    Contato novo = new Contato(nome, tel, email);
                    myAgenda.addContato(novo);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("=====REMOVER CONTATO=====");
                    System.out.print("Nome do contato: "); nome = sc.nextLine();
                    if(myAgenda.removerContato(nome)){
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não foi encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("=====BUSCA DE CONTATO=====");
                    System.out.print("Nome do contato: "); nome = sc.nextLine();
                    myAgenda.buscarContato(nome);
                    break;
                case 4:
                    System.out.println("=====LISTA DE CONTATOS=====");
                    myAgenda.listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo do menu....");
                    break;
                default: 
                    System.out.println("Opção inválida! Escolha (1 a 5)");
            }
        }
    }
}
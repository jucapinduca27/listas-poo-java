import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Book> Books = new ArrayList<>();
    private static ArrayList<Person> People = new ArrayList<>(); 
    private static ArrayList<Loan> Loans = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int op = 0;
        while(op != 7){
            System.out.println("========MENU LIVRARIA========"); // EMPRESTIMO SÓ PODE SE LIVRO ESTIVER DISPONIVEL -ONLOAN FALSE
            System.out.println("[1] - Cadastrar livro"); // AO PEGAR LIVRO - ONLOAN É TRUE E AO DEVOLVER ONLOAN É FALSE
            System.out.println("[2] - Cadastrar pessoa"); // INFO PESSOAS, LIVROS, EMPRESTIMOS DEVEM ESTAR EM LISTAS
            System.out.println("[3] - Realizar empréstimo");
            System.out.println("[4] - Devolver livro");
            System.out.println("[5] - Listar livros");
            System.out.println("[6] - Listar empréstimos");
            System.out.println("[7] - Sair da livraria");
            System.out.print("OPÇÃO:");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                    SignBook();
                    break;
                case 2:
                    SignPerson();
                    break;
                case 3:
                    SignLoan();
                    break;
                case 4:
                    ReturnBook();
                    break;
                case 5:
                    ShowBooks();
                    break;
                case 6:
                    ShowLoans();
                    break;
                case 7:
                    System.out.println("Saindo do programa....");
                    break;
                default:
                    System.out.println("Opção inválida! (1 a 7)");
            }
        
    }
}
    private static void SignBook(){
        System.out.print("Título do livro: ");
        String title = sc.nextLine();
        System.out.print("Autor do livro:");
        String author = sc.nextLine();
        Books.add(new Book(title, author));
    }
    private static void SignPerson(){
        System.out.print("Nome da pessoa: ");
        String name = sc.nextLine();
        System.out.print("CPF da pessoa: ");
        String cpf = sc.nextLine();
        People.add(new Person(name, cpf));
        System.out.println("Pessoa cadastrada com sucesso!");
    }
    private static void SignLoan(){
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
        Person personFound = searchPersonCPF(cpf);

        if(personFound == null){
            System.out.println("Não foi possível encontrar a pessoa!");
            return;
        }
        System.out.print("Título do livro:");
        String title = sc.nextLine();
        Book bookFound = searchBookTitle(title);
        if(bookFound == null){
            System.out.println("Não foi possível encontrar o livro!");
            return;
        }
        if(bookFound.onLoan()){
            System.out.println("Livro já se encontra emprestado!");
            return;
        }
        bookFound.lendBook();
        Loan newLoan = new Loan(personFound, bookFound);
        Loans.add(newLoan);
        System.out.println("Empréstimo concluído com sucesso!");
    }
    private static void ReturnBook(){
        System.out.print("Título do livro:");
        String title = sc.nextLine();
        Loan loanFound = null;
        for(Loan l: Loans){
            if(l.getBook().getTitle().equalsIgnoreCase(title)){
                loanFound = l;
                break;
            }
        }
        if(loanFound == null){
            System.out.println("Nenhum empréstimo encontrado com esse título!");
            return;
        }
        loanFound.getBook().returnBook();
        Loans.remove(loanFound);
    }
    private static void ShowBooks(){
        if(Books.isEmpty()){
            System.out.println("Nenhum livro cadastrado!");
            return;
        }
        System.out.println("===Catálogo de Livros===");
        for(Book b : Books){
            System.out.println(b);
        }
    }
    private static void ShowLoans(){
        if(Loans.isEmpty()){
            System.out.println("Nenhum empréstimo registrado!");
            return;
        }
        System.out.println("===Empréstimos===");
        for(Loan l: Loans){
            System.out.println(l);
        }
    }
    private static Person searchPersonCPF(String cpf){
        for(Person p: People){
            if(p.getCPF().equals(cpf)){
                return p;
            }
        }
        return null;
    }
    private static Book searchBookTitle(String title){
        for(Book b: Books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

}

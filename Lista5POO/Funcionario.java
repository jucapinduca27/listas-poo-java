public class Funcionario{
    // atributos
    private String nome;
    private String cpf;
    private double salario;
    // construtor
    public Funcionario(String n, String c, Double s){
        this.nome = n;
        this.cpf = c;
        this.salario = s;
    }
    public String getNome(){ // gets
        return nome;
    }
    public String getCPF(){
        return cpf;
    }
    public double getSal(){ // sets
        return salario;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setCPF(String c){
        this.cpf = c;
    }
    public void setSal(double s){
        this.salario = s;
    }
    public void ExibirDados(){
        System.out.println("NOME:" + nome );
        System.out.println("CPF:" + cpf );
        System.out.println("SALÁRIO:" + salario);
    }
}
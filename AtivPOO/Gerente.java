public class Gerente extends Bancario{

    public Gerente(String nome, String cpf, String rg, String end, String nm, int niv){
        super(nome, cpf, rg, end, nm, niv);

    }
    public void aprovarEmp(Cliente c, double valor){
        if(c.getScoreCred() > 600){
            System.out.println("Empréstimo aprovado para o cliente " + c.getNome() + " no valor de R$ " + valor);
        } else {
            System.out.println("Empréstimo negado para o cliente " + c.getNome() + ". Score de crédito insuficiente.");
        }
    }
    public void altLim(Cliente c, double novoLim){
        c.setLimCred(novoLim);
        System.out.println("Limite de crédito do cliente " + c.getNome() + " alterado para R$ " + novoLim);
    }
    public void altNivAcess(Bancario b, int novoNiv){
        b.setNivAcess(novoNiv);
        System.out.println("Nível de acesso do bancário " + b.getNome() + " alterado para " + novoNiv);
    }
    public void abrirConta(Cliente c, double limite) {
        c.setLimCred(limite);
        System.out.println("Conta aberta para o cliente " + c.getNome() + " com limite de crédito de R$ " + limite);
    }
}
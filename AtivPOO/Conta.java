import java.time.LocalDate;
import java.util.Locale;
import java.util.ArrayList;


public class Conta{
    protected String NumeroConta;
    protected String Agencia;
    protected String DataAbertura;
    protected double Saldo;
    protected Cliente c;
    private ArrayList<Movimentacao> Extrato;


    public Conta(String nc, String ag, String data, Cliente c){
        this.NumeroConta = nc;
        this.Agencia = ag; 
        this.DataAbertura = data;
        this.c = c;     
        this.Saldo = 0.0;
        this.Extrato = new ArrayList<>();
        
        adicionarMovimentacao("Abertura de conta", 0.0, "ENTRADA");
    }
    protected void adicionarMovimentacao(String descricao, double valor, String tipoTransacao) {
        Movimentacao movimentacao = new Movimentacao(descricao, valor, tipoTransacao);
        Extrato.add(movimentacao);
    }
    public String getNumeroConta() {
        return NumeroConta;
    }
    public void depositar(double Valor){
        if(Valor > 0){
            this.Saldo += Valor;
            adicionarMovimentacao("Depósito", Valor, "ENTRADA");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double Valor){
        if(Valor > 0 && Valor <= this.Saldo){
            this.Saldo -= Valor;
            adicionarMovimentacao("Saque", Valor, "SAÍDA");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
    public void transferir(double valor, Conta destino){
        if(valor > 0 && valor <= this.Saldo){
            this.Saldo -= valor;
            destino.depositar(valor);
            adicionarMovimentacao("Transferência para conta " + destino.getNumeroConta(), valor, "SAÍDA");
            destino.adicionarMovimentacao("Transferência recebida da conta " + this.getNumeroConta(), valor, "ENTRADA");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
    public double consultaSaldo(){
        return this.Saldo;
    }
    public void gerarExtrato(){
        System.out.println("Extrato da conta " + this.NumeroConta + "| Agência: " + this.Agencia);
        for(Movimentacao m : Extrato){
            System.out.println(m.getDataHora() + " - " + m.getDescricao() + " - " + m.getTipo() + " - R$ " + m.getValor());
        }
    }

}
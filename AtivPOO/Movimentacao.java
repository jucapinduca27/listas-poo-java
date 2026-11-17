import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimentacao{
    private String descricao;
    private double valor;
    private String tipo; 
    private LocalDate dataHora;

    public Movimentacao(String desc, double val, String tipo){
        this.descricao = desc;
        this.valor = val;
        this.tipo = tipo;
        this.dataHora = LocalDate.now();    
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getValor(){
        return this.valor;
    }
    public String getTipo(){
        return this.tipo;
    }
    public LocalDate getDataHora(){
        return this.dataHora;
    }
    @Override 
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        String sinal = tipo.equalsIgnoreCase("ENTRADA") ? "+" : "-";
        return String.format("%s %s%.2f - %s", dataHora.format(formatter), sinal, valor, descricao);
    }
}
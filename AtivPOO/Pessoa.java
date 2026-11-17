public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String end;

    public Pessoa(String nome, String cpf, String rg, String end){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.end = end;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getEnd() {
        return end;
    }
    public void setEndereco(String end) {
        this.end = end;
    }
    public void consultarDados(){
        System.out.print("NOME: " + nome);
        System.out.print("CPF: " + cpf);
        System.out.print("RG: " + rg);
        System.out.print("ENDEREÇO: " + end);
    }
}
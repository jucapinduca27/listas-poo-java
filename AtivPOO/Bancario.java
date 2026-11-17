public class Bancario extends Pessoa{
    private String NumMat;
    private int NivAcess;

    public Bancario(String nome, String cpf, String rg, String end, String nm, int niv){
        super(nome, cpf, rg, end);
        this.NumMat = nm;
        this.NivAcess = niv;

    }
    public String getNumMat() {
        return NumMat;
    }
    public int getNivAcess() {
        return NivAcess;
    }
    public void setNumMat(String numMat) {
        NumMat = numMat;
    }
    public void setNivAcess(int nivAcess) {
        NivAcess = nivAcess;
    }
    public boolean autenticacao(int NivExigido){
        return this.NivAcess >= NivExigido;
    }
    public void atendimento(Cliente cliente){
        System.out.print("Atendimento ao cliente: " + cliente.getNome() + "pelo bancário ");
    }
}
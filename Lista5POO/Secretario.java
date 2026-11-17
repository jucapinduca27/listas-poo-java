public class Secretario extends Funcionario{
    private String setor;
    public Secretario(String n, String c, double sa, String se){
        super(n,c,sa);
        this.setor = se;
    }
    public String getSetor(){
        return setor;
    }
    public void  setSetor(String se){
        this.setor = se;
    }
    public void exibeDados(){
        super.ExibirDados();
        System.out.println("SETOR: " + setor);
    }
}

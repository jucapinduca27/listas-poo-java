public class Professor extends Funcionario {
    public String disciplina;

    public Professor(String n, String c, double s, String d){
        super(n, c, s);
        this.disciplina = d;
    }
    public String getDisc(){
        return disciplina;
    }
    public void SetDisc(String d){
        this.disciplina = d;
    }
    public void exibeDados(){
        super.ExibirDados();
        System.out.println("DISC: " + disciplina);
    }

}

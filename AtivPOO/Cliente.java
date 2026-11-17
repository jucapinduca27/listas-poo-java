public class Cliente extends Pessoa{
    private double LimCred;
    private int ScoreCred;


    public Cliente(String nome, String cpf, String rg, String end, double lc, int score){
        super(nome, cpf, rg, end);
        this.LimCred = lc;
        this.ScoreCred = score;        
    }
    public double getLimCred() {
        return LimCred;
    }
    public void setLimCred(double limCred) {
        this.LimCred = limCred;
    }
    public int getScoreCred() {
        return ScoreCred;
    }
    public void setScoreCred(int scoreCred) {
        this.ScoreCred = scoreCred;
    }
    public void solicAumLim(double novoLim){
        if(ScoreCred >= 700){
            this.LimCred = novoLim;
            System.out.println("Solicitação de aumento de limite aprovada.");
            System.out.println("Limite de crédito atualizado para: R$ " + novoLim);
        } else {
            System.out.println("Solicitação de aumento de limite negada. Score de crédito insuficiente.");
        }
    }

    
}
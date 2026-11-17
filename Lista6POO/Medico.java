public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    public Medico(String name, String cpf, String crm, String especialidade){
        super(name, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    public void setCrm(String crm){
        this.crm = crm;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getCrm(){
        return crm;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() + "\nCRM: " + crm + "\nEspecialidade: " + especialidade;
    }
}
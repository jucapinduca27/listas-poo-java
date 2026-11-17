public class Paciente extends Pessoa{
    private String historicoMedico;
    private String convenio;
    public Paciente(String name, String cpf, String historicoMedico, String convenio){
        super(name, cpf);
        this.historicoMedico = historicoMedico;
        this.convenio = convenio;
    }
    public void setHistoricoMedico(String historicoMedico){
        this.historicoMedico = historicoMedico;
    }
    public void setConvenio(String convenio){
        this.convenio = convenio;
    }
    public String getHistoricoMedico(){
        return historicoMedico;
    }
    public String getConvenio(){
        return convenio;
    }
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() + "\nHistórico Médico: " + historicoMedico + "\nConvênio: " + convenio;
    }
}
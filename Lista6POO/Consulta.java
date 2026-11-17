public class Consulta{
    private String data;
    private String descricao;
    private Paciente paciente;
    private Medico medico;

    public Consulta(String data, String desc, Paciente pac, Medico med){
        this.data = data;
        this.descricao = desc;
        this.paciente = pac;
        this.medico = med;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public String getData(){
        return data;
    }
    public String getDescricao(){
        return descricao;
    }
    public Paciente getPaciente(){
        return paciente;
    }
    public Medico getMedico(){
        return medico;
    }
    public String exibirInformacoes(){
        return "\nData: " + data + "\nDescrição: " + descricao + "\nPaciente: " + paciente.getName() + "\nMédico: " + medico.getName();
    }
}
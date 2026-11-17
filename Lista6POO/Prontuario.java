import java.util.List;
import java.util.ArrayList;

public class Prontuario {
    private int numProntuario;
    private Paciente paciente;
    private ArrayList<Consulta> consultas;

    public Prontuario(int numProntuario, Paciente paciente) {
        this.numProntuario = numProntuario;
        this.paciente = paciente;
        this.consultas = new ArrayList<>();
    }
    public void setNumProntuario(int numProntuario) {
        this.numProntuario = numProntuario;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public int getNumProntuario() {
        return numProntuario;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
    public String ListarConsultas() {
        if(consultas.isEmpty()){
            return "Não há consultas cadastradas";
        }
        StringBuilder sb = new StringBuilder();
        for (Consulta c : consultas) {
            sb.append("\nData: ").append(c.getData())
              .append("\nDescrição: ").append(c.getDescricao())
              .append("\nMédico: ").append(c.getMedico().getName());
        }
        return sb.toString();
    }
    public String exibirInfoProntuario(){
        return "\nNº prontuário: " + numProntuario + 
                "\nPaciente: " + paciente.getName() + 
                "\nConsultas: " + ListarConsultas();
    }
}

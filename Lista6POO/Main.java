public class Main {
    public static void main(String[] args) {
    Medico medico1 = new Medico("Dr. Silva", "34343434",  "987654321", "Cardiologista");
    Paciente paciente1 = new Paciente("João", "123456", "", "Unimed");
    Consulta consulta1 = new Consulta("2023-06-01", "Consulta de rotina", paciente1, medico1);
    Consulta consulta2 = new Consulta("2023-06-02", "Consulta de acompanhamento", paciente1, medico1);
    Prontuario prontuario1 = new Prontuario(1, paciente1);
    prontuario1.adicionarConsulta(consulta1);
    prontuario1.adicionarConsulta(consulta2);
    System.out.println(prontuario1.exibirInfoProntuario());
    }
}

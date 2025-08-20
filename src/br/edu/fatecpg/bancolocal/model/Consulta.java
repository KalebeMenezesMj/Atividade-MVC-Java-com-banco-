package br.edu.fatecpg.bancolocal.model;

public class Consulta {

    private String nomePaciente;
    private String dataConsulta;
    private String horaConsulta;

    public Consulta(String horaConsulta, String dataConsulta, String nomePaciente) {
        this.horaConsulta = horaConsulta;
        this.dataConsulta = dataConsulta;
        this.nomePaciente = nomePaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "nomePaciente='" + nomePaciente + '\'' +
                ", dataConsulta='" + dataConsulta + '\'' +
                ", horaConsulta='" + horaConsulta + '\'' +
                "}\n";
    }
}

import java.util.Date;

public class Treino {
    private Date horario;
    private String atividade;

    public Treino(Date horario, String atividade) {
        this.horario = horario;
        this.atividade = atividade;
    }

    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}

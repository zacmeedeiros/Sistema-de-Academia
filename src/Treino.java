import java.text.SimpleDateFormat;
import java.util.Date;

public class Treino {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    private String horario;
    private String atividade;

    public Treino(String horario, String atividade) {
        this.horario = horario;
        this.atividade = atividade;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}

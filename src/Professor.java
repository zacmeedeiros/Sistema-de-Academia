import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
    private String tipo;
    private List<Aluno> list = new ArrayList<>();

    public Professor(){
    }
    public Professor(int matricula, String name, String tipo){
        super(matricula,name);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

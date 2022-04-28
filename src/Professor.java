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
    public void addAluno (Aluno aluno){
        list.add(aluno);
    }
    public void removeAluno(Aluno aluno){
        list.remove(aluno);
    }

    public String toString() {
        return "Professor [" +
                name +
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Funcionario> lista_de_funcionarios = new ArrayList<>();

    public void addFuncionario(Funcionario funcionario){
        lista_de_funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        lista_de_funcionarios.remove(funcionario);
    }
}

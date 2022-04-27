import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String cpf;
    private Date data_nascimento;
    private List<Treino> list = new ArrayList<>();

    public Aluno (){
    }
    public Aluno(String nome, String cpf, Date data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<Treino> getList() {
        return list;
    }

    public void addTreino (Treino treino){
        list.add(treino);
    }
    public void removeTreino (Treino treino){
        list.remove(treino);
    }

}
